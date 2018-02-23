package razo;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

public class SQLow {
	static String qry="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the query:");
	   	Scanner scanner = new Scanner(System.in);
		String qry = scanner.nextLine();
	    QueryParser obj=new QueryParser();
	    String[] spqry= obj.splqry(qry);
		
	    String file = obj.extfname(qry);
		System.out.println("File Name:");
	    System.out.format("%s.csv\n", file);
	
	    String beforewh = obj.beforewhere(qry);
	    System.out.println(beforewh);
	    
	    
	    String afterwh = obj.afterwhere(qry);
	    System.out.println(afterwh);
	    
		obj.restrictions(spqry,qry);
		
		obj.logop(qry, spqry);
		
		System.out.println("GroupBy field:");
		String group = obj.grpfld(spqry,qry);
		System.out.println(group);
		
		System.out.println("OrderBy field:");
		String order = obj.ordfld(spqry,qry);
		System.out.println(order);
		
		System.out.println("Aggregators/Selectors:");
		obj.aggselp(spqry);
		scanner.close();
		
		QuerySolver sol = new QuerySolver();
		try {
			sol.mn();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
