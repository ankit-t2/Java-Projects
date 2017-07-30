package com.ankit.fredo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainFredoClass {
	
	static int arraySize = 0;
	static int coPrime = 0;

    static ArrayList<Integer> aList = new ArrayList<Integer>();
    static List<String> strDataList = new ArrayList<String>();
	

	static BufferedReader br;

	static int gcd(BigInteger a) 
	{
		return a.gcd(BigInteger.valueOf(coPrime)).intValue();
	}
	
	static boolean readLineOne()
	{
		boolean successfulRead = true;

		try
		{
			
            String[] config = br.readLine().split(" ");

	        arraySize = Integer.parseInt(config[0]);
	        coPrime = Integer.parseInt(config[1]);

	        if(arraySize < 0 || arraySize > 100000)
	        {
	        	arraySize = 0;
	        	successfulRead = false;
	        }
	        else if(coPrime < 1 || coPrime > 1000000)
	        {
	        	coPrime = 1;
	        	successfulRead = false;
	        }
	        
	        successfulRead = true;

		}
		catch(Exception e)
		{
			successfulRead = false;
		}
		
		return successfulRead;
	}
	
	static boolean readDataLine()
	{

		boolean successfulRead = true;

		try
		{
			
			String lineTwo = br.readLine();
	        String[] data = lineTwo.split(" ");
	        
	        strDataList = Arrays.asList(data);
	        
	        if(data.length > 100000)
	        {
	        	successfulRead = false;
	        }
	        else
	        {
		        for(int i = 0 ; i < arraySize ; i++)
		        {
		        	int dataElem = Integer.parseInt(data[i]);
		        	
		        	if(dataElem < 0 || dataElem > 1000000)
			        {
		        		aList.clear();
		        		successfulRead = false;
		        		break;
			        }
		        	else
		        	{
		        		aList.add(dataElem);
		        	}
		        }
		        
		        Collections.sort(aList);
	        }
		}        
		catch(Exception e)
		{
			aList.clear();
			successfulRead = false;
		}
		
		return successfulRead;
	}
	
	public static void main(String args[] ) throws Exception
	{
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
		
    	//BufferedReader
        br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean readSuccessful = true;
        
        try
        {
        	readSuccessful = readLineOne();
        	
        	if(readSuccessful)
        	{
	        	readSuccessful = readDataLine();
	        	
	        	if(readSuccessful)
	        	{
			        for(int i = 0; i<arraySize ; i++)
			        {
			        	for(int j = (i+1) ; j < arraySize ; j++)
			        	{
			        		BigInteger mult = BigInteger.valueOf(aList.get(i)).multiply(BigInteger.valueOf(aList.get(j)));
			        		
			        		if(!strDataList.contains(String.valueOf(mult)))
			        		{
			        		
				        		if(gcd(mult) == 1)
				        		{
				        			System.out.println(mult);
				        			return;
				        		}
			        		}
			        	}
			        }
	        	}
        	}
        }
        catch(Exception e)
        {
        	System.out.println("Invalid Input");
        }
    }

}
