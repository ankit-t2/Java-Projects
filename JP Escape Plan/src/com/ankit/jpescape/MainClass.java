package com.ankit.wipro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass 
{

	public static boolean jump(int[][] building, int x, int y, int jumpHt)
	{
		boolean hasReached = false;
		
		if(x == 0)
		{
			hasReached = true;
		}
		else if(x == building.length-1)
		{
			hasReached = true;
		}
		else if (y == 0)
		{
			hasReached = true;
		}
		else if (y == building[0].length-1)
		{
			hasReached = true;
		}
		else
		{
			if(((building[x][y] - building[x-1][y]) <= jumpHt) && ((building[x][y] - building[x-1][y]) >= 0))
			{
				hasReached = jump(building, x-1,y,jumpHt);
			}
			else if(((building[x][y] - building[x+1][y]) <= jumpHt) && ((building[x][y] - building[x+1][y]) >= 0))
			{
				hasReached = jump(building, x+1,y,jumpHt);
			}
			else if(((building[x][y] - building[x][y-1]) <= jumpHt) && ((building[x][y] - building[x][y-1]) >= 0))
			{
				hasReached = jump(building, x,y-1,jumpHt);
			}
			else if(((building[x][y] - building[x][y+1]) <= jumpHt) && ((building[x][y] - building[x][y+1]) >= 0))
			{
				hasReached = jump(building, x,y+1,jumpHt);
			}
			else
			{
				hasReached = false;
			}
			
		}
		
		
		return  hasReached;
	}
	
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */

/*      //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
*/        
    	try
	    {
	    		
	        //BufferedReader
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int testCaseNum = Integer.parseInt(line);
	
	        for(int i = 0; i<testCaseNum ; i++)
	        {
		        line = br.readLine();
		        String[] buildMatrix = line.split(" ");
		        
		        int numRows = Integer.parseInt(buildMatrix[0]);
		        int numCols = Integer.parseInt(buildMatrix[1]);
		
		        int[][] building = new int[numRows][numCols];
		
		        for(int j=0 ; j<numRows ; j++)
		        {
			        line = br.readLine();
			        String[] data = line.split(" ");
			        
			        for(int k = 0; k<numCols ; k++)
			        {
			        	building[j][k] = Integer.parseInt(data[k]);
			        }
		        }
		        
		        line = br.readLine();
		        String[] dropPoint = line.split(" ");
		        int dropX = Integer.parseInt(dropPoint[0]);
		        int dropY = Integer.parseInt(dropPoint[1]);
		        int jumpHt = Integer.parseInt(dropPoint[2]);
		        
		        boolean hasReached = jump(building,dropX,dropY,jumpHt);
		        
		        if(hasReached)
		        	System.out.println("YES");
		        else
		        	System.out.println("NO");
		        
	        } //for(int i = 0; i<testCaseNum ; i++)
	    }
    	catch(Exception e)
    	{
    		
    	}
    }

}
