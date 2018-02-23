package razo;

public class Queryexec {
	void execute(String[] header,String sel,String[][] td,String con1,String con2,String con3) {
		int temp=0,temp1=0;
		for(int i=0;i<17;i++)
		{
			if(header[i].equals(sel))
			{
				temp=i;
			}
			
			if(header[i].equals(con1))
			{
				temp1=i;
			}
			
		}
		for(int j=0;j<570;j++)
	    {
	    	if(con2.equals("=")) {
	    		if(td[j][temp1].equals(con3))
	    		{
	    			System.out.println(td[j][temp]);
	    		}
	    	}
	    	if(con2.equals("!=")) {
	    		if(!(td[j][temp1].equals(con3)))
	    		{
	    			System.out.println(td[j][temp]);
	    		}
	    	}
	    	if(con2.equals(">")) {
	    		if(Integer.parseInt(td[j][temp1])>(Integer.parseInt(con3)))
	    		{
	    			System.out.println(td[j][temp]);
	    		}
	    	}
	    	if(con2.equals("<")) {
	    		if(Integer.parseInt(td[j][temp1])<(Integer.parseInt(con3)))
	    		{
	    			System.out.println(td[j][temp]);
	    		}
	    	}
	    }
		}
}
