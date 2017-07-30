package com.ankit.heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class RegarAndHeap {

	static BufferedReader br;
	static int arraySize;
	static int subsetSize;
	static int popSize;
	
	public static int readNumOfTestCases()
	{
		int testCaseNum = 0;
		try
		{
			String line = br.readLine();
			testCaseNum = Integer.parseInt(line);
			
		}
		catch(Exception e)
		{
			
		}
		
		return testCaseNum;
	}

	public static void readMeta()
	{
		try
		{
			String[] meta = br.readLine().split(" ");
			arraySize = Integer.parseInt(meta[0]);
			subsetSize = Integer.parseInt(meta[1]);
			popSize = Integer.parseInt(meta[2]);
		}
		catch(Exception e)
		{
			
		}
	}
	
	public static String[] readData()
	{
		String[] strArrData = null;
		try
		{
			strArrData = br.readLine().split(" ");
		}
		catch(Exception e)
		{
			
		}
		return strArrData;
	}

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		
		int numTestCases = readNumOfTestCases();
		
		for(int a = 0; a< numTestCases; a++)
		{
			readMeta();
			
			String[] data = readData();
			
			ArrayList<Integer> input = new ArrayList<Integer>();
			
			for(int j=0; j<data.length; j++)
			{
				input.add(Integer.parseInt(data[j]));	// input array
			}
			
			Collections.sort(input);
			
			ArrayList<int[]> subsets = new ArrayList<>();

			int[] s = new int[subsetSize];		 // here we'll keep indices 
												   // pointing to elements in input array

			if (subsetSize <= input.size()) 
			{
				// first index sequence: 0, 1, 2, ...
				for (int i = 0; (s[i] = i) < subsetSize - 1; i++);  
				
				subsets.add(getSubset(input, s));
				for(;;) 
				{
					int i;
					
					// find position of item that can be incremented
					for (i = subsetSize - 1; i >= 0 && s[i] == input.size() - subsetSize + i; i--); 
					
					if (i < 0) 
					{
						break;
					}
					s[i]++;					// increment this item
					
					for (++i; i < subsetSize; i++) 
					{
						// fill up remaining items
						s[i] = s[i - 1] + 1; 
					}
					subsets.add(getSubset(input, s));
				}

				int lowestSum = getArraySum(subsets.get(0));
				int obtainedSum = getArraySum(subsets.get(popSize));
				
				System.out.println(obtainedSum - lowestSum);
			} //if (subsetSize <= input.size())
			

		} // for(int a = 0; a< numTestCases; a++)

	}

	// generate actual subset by index sequence
	private static int[] getSubset(ArrayList<Integer> input, int[] subset) 
	{
		int[] result = new int[subset.length]; 
		
		for (int i = 0; i < subset.length; i++) 
			result[i] = input.get(subset[i]);
		return result;
	}

	private static int getArraySum(int[] is) 
	{
		int sum = 0;
		
		for(int i : is)
			sum += i;
		
		return sum;
	}

}
