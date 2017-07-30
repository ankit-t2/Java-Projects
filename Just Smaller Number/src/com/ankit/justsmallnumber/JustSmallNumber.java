package com.ankit.justsmallnumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class JustSmallNumber {


	static BufferedReader br;
	static int arraySize;
	static int numLine;
	static TreeSet<Integer> aList = new TreeSet<Integer>();
	
	public static void readMeta()
	{
        try
        {
			String[] meta = br.readLine().split(" ");
	        arraySize = Integer.parseInt(meta[0]);
	        numLine = Integer.parseInt(meta[1]);
	        
        }
        catch(Exception e)
        {
        	
        }
	}
	
	public static void readData()
	{
        try
        {
			String[] strData = br.readLine().split(" ");
	        
	        for(int i = 0 ; i<arraySize ; i++)
	        {
	        	aList.add(Integer.parseInt(strData[i]));
	        }

        }
        catch(Exception e)
        {
        	
        }
	}
	
	public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */

		try
		{
        //BufferedReader
	        br = new BufferedReader(new InputStreamReader(System.in));
	                
	        readMeta();
	        readData();
	
	        
	        for(int i = 0; i<numLine ; i++)
	        {
		        String line = br.readLine();
		        
		        Integer searchNum = Integer.parseInt(line);
		        
		        int index = aList.lower(searchNum);
		        System.out.println(index);
		        	
	        }
		}
		catch (Exception e)
		{
//			e.printStackTrace();
//			System.out.println("Exception " + e);
		}
	}
}
