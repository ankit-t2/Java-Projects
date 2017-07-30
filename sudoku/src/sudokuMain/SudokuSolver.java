package com.sudoku.sudokuMain;

import javax.swing.JTextField;
import org.apache.commons.lang.StringUtils;

public class SudokuSolver 
{
	String[][] a=new String[9][9];

	private void removeValuesFromRowCol(int i, int j, String text) 
	{
		for(int k=0;k<9;k++)
		{
			if(k!=j)
			{
				a[i][k]=a[i][k].replaceAll(text, "");
			}
		}
		for(int k=0;k<9;k++)
		{
			if(k!=i)
			{
				a[k][j]=a[k][j].replaceAll(text, "");
			}
		}
	}

	private void removeValueFromPanel(int i, int j, String string) {
		int panelNum = 3*(i/3)+(j/3);
		int currPanelNum = 0;
		for(int x=0; x<9; x++)
		{
			for(int y=0; y<9; y++)
			{
				currPanelNum = 3*(x/3)+(y/3);
				if(currPanelNum==panelNum && x!=i && y!=j)
				{
					a[x][y]=a[x][y].replaceAll(string, "");
				}
			}
		}
	}

	private void solveRowCols(String[][] a) {
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(a[i][j].length()==1)
				{
					System.out.println(a[i][j]);
					removeValuesFromRowCol(i,j,a[i][j]);
				}
			}
		}
		
	}

	private void solvePanels(String[][] a) 
	{
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(a[i][j].length()==1)
				{
					removeValueFromPanel(i,j,a[i][j]);
				}
			}
		}
	}

	public String[][] solveThisThing(JTextField[][] textField)
	{
		System.out.println("Inside solveThisThing");
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				a[i][j]="123456789";
				if(StringUtils.isNotBlank(textField[i][j].getText()))
				{
					a[i][j]=textField[i][j].getText();
				}
			}
		}
		
		solveRowCols(a);
		solvePanels(a);
		return a;
	}
	
	private boolean validate(int i, int j, int[][] b) 
	{
		int k;
		int l;
		try
		{
			for(k=0 ;k<9; k++)
			{
				if(k!=i)
				{
					if(b[k][j]==b[i][j])
					{
						return false;
					}
				}
				if(k!=j)
				{
					if(b[i][k]==b[i][j])
					{
						return false;
					}
				}
			}
	
			int panelNum = 3*(i/3)+(j/3);
			int currPanelNum = 0;
			for(k=0; k<9; k++)
			{
				for(l=0; l<9; l++)
				{
					currPanelNum = (3*(k/3))+(l/3);
					if(currPanelNum==panelNum && k!=i && l!=j)
					{
						if(b[k][l]==b[i][j])
						{
							return false;
						}
					}
				}
			}
		}
		catch (Exception e) {
		}
		return true;
	}

	public boolean recursiveSolver(int[][] b)
	{
		boolean isOk = false;
		int currValue=1;
		try
		{
			for(int i=0; i<9; i++)
			{
				for(int j=0; j<9; j++)
				{
					if(b[i][j]==0)
					{
						while(!isOk)
						{
							System.out.println(i+"   "+j+"   "+currValue);
							b[i][j]=currValue;
							isOk = validate(i, j, b);
							if(isOk)
							{
								isOk=recursiveSolver(b);
							}
							if(!isOk)
							{
								System.out.println("not ok");
								currValue++;
								if(currValue==10)
								{
									b[i][j]=0;
									return false;
								}
							}
						}
					}
				}
			}
			
		}
		catch (Exception e) {
			
		}
		return true;
	}
	
	public int[][] solveThisThing2(JTextField[][] textField)
	{
		int[][] b = new int[9][9];
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(StringUtils.isNotBlank(textField[i][j].getText()))
				{
					b[i][j]=Integer.parseInt(textField[i][j].getText());
				}
				else
				{
					b[i][j]=0;
				}
			}
		}

		recursiveSolver(b);
		
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				System.out.print(b[i][j]+ "\t");
			}
			System.out.println("");
		}
		return b;
	}
}
