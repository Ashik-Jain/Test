package main.com.ge.exercise2;

public class ArrayQuadrantUtil {

	char[][] data;

	public ArrayQuadrantUtil(char[][] data) {

		this.data = data;

	}

	public char[] getQuadrantValues(int row, int column) {

		String s = "";

		for (int i = row; i < row + 2; i++) {

			for (int j = column; j < column + 2; j++) {

				s += data[i][j];

			}

		}

		return s.toCharArray();

	}

	public char[] getPartRow(int rowNum) {

		String s ="";

		for (int j = 0; j < data[rowNum].length; j++) {

			s += data[rowNum][j];

		}

		return s.toCharArray();

	}

	public char[] getPartColmn(int colNum) {

		String s ="";

		for (int j = 0; j < data.length; j++) {

			s += data[j][colNum];

		}

		return s.toCharArray();

	}

}