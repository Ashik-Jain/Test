package main.com.ge.exercise1;

public class MyParser implements Parser {

	
	public Application parseApplicationData(String data) {
		String [] tockens=data.split("\\[");
		ApplicationImpl applicationimpl=null;
		UserImpl userimpl= null;
		GroupImpl groupimpl=null;
	
		
		for (int i = 0; i < tockens.length; i++) {
			if(tockens[i].startsWith("Application(")){
				applicationimpl=(ApplicationImpl) getAnObject(tockens[i],"Application");
				
				  if(tockens[i].endsWith("users:") && !tockens[i+1].equals("")) {
					  String[] tockens2=tockens[i+1].split("\\),");
					  for (String string : tockens2) {
						  userimpl=(UserImpl) getAnObject(string,"User");
						  if(!(null==userimpl)) {
							  applicationimpl.setUsers(userimpl);
						  }
					}
				  }
				  if(tockens[i].endsWith("groups:") && !tockens[i+1].equals("")) {
					  String[] tockens2=tockens[i+1].split("\\),");
					  for (String string : tockens2) {
						  groupimpl= (GroupImpl) getAnObject(string,"Group");
						  if(!(null==groupimpl)) {
							  applicationimpl.setGroups(groupimpl);
						  }
					}
				  }
				 
				 
			}
			else
				if(tockens[i].startsWith("Group(")){
					groupimpl=(GroupImpl) getAnObject(tockens[i],"Group");
					
					  if(tockens[i].endsWith("users:") && !tockens[i+1].equals("")) {
						  
						  String[] tockens2=tockens[i+1].split("\\),");
						  for (String string : tockens2) {
							  userimpl=(UserImpl) getAnObject(string,"User");
							  if(!(null==userimpl)) {
								  groupimpl.setUsers(userimpl);
							  }
						}
					  }
					  
					  applicationimpl.setGroups(groupimpl);
			}
			
		}

		return applicationimpl;
	}
	
	public static Object getAnObject(String str, String className) {
		String[] users=str.split(className+"\\("); 
		String id="";
		String name="";
		if(users.length>0){
		for (String strings : users) {
				String[] string=strings.split(",");
				for (String string2 : string) {
					String[] objProperties=string2.split(": ");
					for (int k = 0; k < objProperties.length; k++) {
						if(objProperties[k].equals("id") && !objProperties[k+1].equals("")) {
							id=objProperties[k+1];
						}
						else if(objProperties[k].equals("name") && !objProperties[k+1].equals("")) {
							String[] names=objProperties[k+1].split("\\)\\]");
							name=names[0];
						}
					}
										}
			
		}
		}
		 
		if(className.equals("Application")) {
			return new ApplicationImpl(id, name);
		}
		else if(className.equals("Group")) {
			return new GroupImpl(id, name);
		}
		else if(className.equals("User")) {
			return new UserImpl(id, name);
		}
		return null;
	}
	
	
}
		
		
		
		
		