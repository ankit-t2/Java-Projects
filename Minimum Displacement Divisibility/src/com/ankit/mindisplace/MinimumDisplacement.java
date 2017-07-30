package com.ankit.mindisplace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class MinimumDisplacement 
{

	static HashSet<Integer> permutations = new HashSet<Integer>();

	static void permute(int[] a, int k) 
	{
		if (k == a.length) 
		{
			int sum = 0;

			for (int i = 0; i < a.length; i++) 
			{
//				System.out.print(" [" + a[i] + "] ");
				sum += (a[i] * Math.pow(10, i));
			}
			permutations.add(sum);

//			System.out.println();

		} 
		else 
		{

			for (int i = k; i < a.length; i++) 
			{
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;

 				permute(a, k + 1);

				temp = a[k];
				a[k] = a[i];
				a[i] = temp;

			}
		}
	}


	public static void main(String args[]) 
	{
		long startTime = System.nanoTime();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;

		try
		{
			String[] data = br.readLine().split(" ");
	
	        int[] sequence = new int[data[0].length()];
	
			int denominator = Integer.parseInt(data[1]); 
	
			for (int i = 0; i < data[0].length(); i++)
			{
				sequence[i] = Integer.parseInt(data[0].substring(i, i+1));
			}
			
//			System.out.println("The original sequence is: ");
//	
//			for (int i = 0; i < data[0].length(); i++)
//			{
//				System.out.print(sequence[i] + " ");
//			}
//			
//			System.out.println("\nThe permuted sequences are: ");
	
			permute(sequence, 0);
			
			int displacement = 0;
			boolean isDivisible = false;
			
			for(Integer numerator : permutations)
			{
				if(numerator % denominator == 0)
				{
					int tempDisplacement = findDisplacement(data[0],numerator.toString());
					isDivisible = true;
					
					if(tempDisplacement == 0)
					{
						displacement = 0;
						break;
					}
					else if(displacement == 0)
					{
						displacement = tempDisplacement;
					}
					else if(tempDisplacement < displacement)
					{
						displacement = tempDisplacement;
					}
					
				}
			}
			
			if(isDivisible)
				System.out.println(displacement);
			else
				System.out.println(-1);
	
			long endTime = System.nanoTime();
			System.out.println("Took "+(endTime - startTime) + " ns"); 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


	private static int findDisplacement(String origInputStr, String newString) 
	{

		int displacement = 0;
		
		for(int i = 0 ; i < origInputStr.length(); i++)
		{
			if( !newString.substring(i,i+1).equals( origInputStr.substring(i, i+1) ) )
			{
				displacement++;
			}
		}

		return displacement;
	}

}