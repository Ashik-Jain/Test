package main.com.ge.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Group {
    private String id;
    private String name;

    public Group(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int size;
    
}
