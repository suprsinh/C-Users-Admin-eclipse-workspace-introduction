package intduction;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	
	 static List<Integer> fib;
	public static List<Integer> CreateFibonacci (int seriesLength)
	{
		
		

		
		List<Integer> fib = new ArrayList<Integer>();
		
		int a  = 0;
		int b =1;
		int series;
	   
		fib.add(a);
	   fib.add(b);
	   
	   
       
	   
	    
	    for(int i=0; i<seriesLength-2; i++)
	    {
	    	series = a+b;
	    	a=b;
	    	b=series;
	    	fib.add(series);
	    	
	    }
	    
	    
	    
	    
	    return fib;
	    
	    
	    
	 
	 
		
		
	}



public static void main (String[] args)

{
	List<Integer> c= CreateFibonacci(5);
	for(int i=0; i<c.size(); i++)
	{
		System.out.println(c.get(i));
	}
}
}

