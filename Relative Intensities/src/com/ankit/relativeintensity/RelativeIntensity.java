package com.ankit.relativeintensity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class RelativeIntensity 
{

	static BufferedReader br;
	static int arraySize;
	static int numLine;
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	static ArrayList<Integer> intensity = new ArrayList<Integer>();

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
				numbers.add(Integer.parseInt(strData[i]));
			}

		}
		catch(Exception e)
		{
			
		}
	}
	
	/**
	 * Finds GCD of 2 numbers.
	 * @param number1
	 * @param number2
	 * @return
	 */
	private static int gcd(int number1, int number2) 
	{
		if(number2 == 0)
		{
			return number1;
		}
		return gcd(number2, number1%number2);
	}
	
	private static void getGCD(ArrayList<Integer> a)
	{
		for(int i = 0; i<a.size(); i++)
		{
			int result;
			if(i == 0)
				result = a.get(1);
			else
				result = a.get(0);
			
			for(int j = 0; j < a.size(); j++)
			{
				if(i!=j)
				{
					result = gcd(result, a.get(j));
				}
			}
			
			intensity.add(result);
		}
		
	}
	
	public static void main(String[] args) 
	{
		br = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			readMeta();
			readData();
	
			getGCD(numbers);
			Collections.sort(intensity);
			
			for(int i = 0; i<numLine ; i++)
			{
				String line = br.readLine();
			
				int searchNum = Integer.parseInt(line);
				
				int j = 0;
				for(j = 0; j< intensity.size(); j++)
				{
					if(intensity.get(j) > searchNum)
						break;
				}
				
				System.out.println(intensity.size() - j);
		        
			} 
				
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
