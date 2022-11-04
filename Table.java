package AMIT;
import java.util.*;

public class Table {
	public static Scanner reader = new Scanner(System.in);
	private List<String> table1;
	private List<String> table2;
	private int rowsC;
	
	public Table() {
		this.rowsC = 0;
	}
	public void insertColumnNames(String name, String last_name) {
		
		this.table1.add(name);
		this.table2.add(last_name);
	}
	
	public void insertRow(String st1, String st2) {
		this.rowsC++;
		this.table1.add(st1);
		this.table2.add(st2);
	}
	
	public String GetValue(String C, int row) {
		int f;
		if(C.equals(this.table1[0])) return this.table1[row];
		else if (C.equals(this.table2[0])) return this.table2[row];
		return "collum wrong, enter again";
	
	}
	
	public void printTable() {
		System.out.println(this.table1[0] +  " " + this.table2[0]);
		for(int i = 1; i <= this.rowsC; i++) {
			System.out.println(this.table1[i] +"  " + this.table2[i] );
		}
	}
}
