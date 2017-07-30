package com.sudoku.gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;        

import com.sudoku.sudokuMain.SudokuSolver;

public class GUI implements ActionListener
{

	JTextField[][] textField1 = new JTextField[9][9];

	public void actionPerformed(ActionEvent e) 
	{
		if("solveSudoku".equals(e.getActionCommand()))
		{
			System.out.println("Button has started working"+textField1[0][0].getText());
			System.out.println("hi"+textField1[0][1].getText()+"ankit");
			String str = "ankit";
			String str1 = str.replaceAll("an", "");
			System.out.println(str1);
			SudokuSolver sudokuSolver = new SudokuSolver();
//			String[][] a = sudokuSolver.solveThisThing(textField1);
			int[][] b = sudokuSolver.solveThisThing2(textField1);
			for(int i=0; i<9; i++)
			{
				for(int j=0; j<9; j++)
				{
					textField1[i][j].setText(""+b[i][j]);
				}
			}
		}
		if("resetSudoku".equals(e.getActionCommand()))
		{
			for(int i=0; i<9; i++)
			{
				for(int j=0; j<9; j++)
				{
					textField1[i][j].setText("");
				}
			}
		}
		
		if("testSudoku".equals(e.getActionCommand()))
		{
			textField1[0][0].setText("3");
			textField1[0][1].setText("4");
			textField1[0][2].setText("5");
			textField1[0][5].setText("6");
			textField1[2][0].setText("9");
			textField1[2][4].setText("2");
			textField1[2][6].setText("7");
			textField1[3][2].setText("7");
			textField1[3][3].setText("1");
			textField1[3][7].setText("9");
			textField1[4][2].setText("8");
			textField1[4][3].setText("3");
			textField1[4][7].setText("6");
			textField1[5][2].setText("2");
			textField1[5][3].setText("5");
			textField1[5][7].setText("4");
			textField1[6][1].setText("6");
			textField1[6][5].setText("8");
			textField1[6][8].setText("2");
			textField1[8][4].setText("3");
			textField1[8][6].setText("1");
			textField1[8][7].setText("5");
			textField1[8][8].setText("9");
		}
	}
	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    public void createAndShowGUI() {
    	//Create and set up the window.
    	JFrame frame = new JFrame("Sudoku Swing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	JPanel mainPane = new JPanel(new GridBagLayout());
    	GridBagConstraints mainPaneConstraints = new GridBagConstraints();
    	
    	JPanel panel[] = new JPanel[9];
    	JPanel panel2 = new JPanel(new GridBagLayout());
    	
    	GridBagConstraints c1 = new GridBagConstraints();

		panel2.setBorder(BorderFactory.createCompoundBorder(
												BorderFactory.createTitledBorder("Panel2"),
												BorderFactory.createEmptyBorder(5,5,5,5)));
		
		for(int i=0; i<9; i++)
		{
			for(int j=0; j<9; j++)
			{
				if(panel[j]==null)
				{
					panel[j] = new JPanel(new GridBagLayout());
					panel[j].setBorder(BorderFactory.createCompoundBorder(
							BorderFactory.createTitledBorder("Panel"+(j+1)),
							BorderFactory.createEmptyBorder(5,5,5,5)));
				}
				textField1[i][j]= new JTextField(3);
//				textField1[i][j].setText(i+""+j);
//				textField1[i][j].setDocument(new JTextFieldLimit(1));
				c1.gridx = j;
				c1.gridy = i;
				panel[(3*(i/3))+(j/3)].add(textField1[i][j],c1);
			}
			
			mainPaneConstraints.gridx = i%3;
			mainPaneConstraints.gridy = i/3;
			mainPane.add(panel[i],mainPaneConstraints);
		}

		JButton solveButton = new JButton("Solve Now");
		JButton resetSudoku = new JButton("Reset");
		JButton testSudoku = new JButton("Test Sudoku");
		
		mainPaneConstraints.gridx = 0;
		mainPaneConstraints.gridy = 3;
		mainPane.add(testSudoku,mainPaneConstraints);
		
		mainPaneConstraints.gridx = 1;
		mainPaneConstraints.gridy = 3;
		mainPane.add(solveButton,mainPaneConstraints);
		
		mainPaneConstraints.gridx = 2;
		mainPaneConstraints.gridy = 3;
		mainPane.add(resetSudoku,mainPaneConstraints);
		
		testSudoku.addActionListener(this);
		solveButton.addActionListener(this);
		resetSudoku.addActionListener(this);
		
		testSudoku.setActionCommand("testSudoku");
		solveButton.setActionCommand("solveSudoku");
		resetSudoku.setActionCommand("resetSudoku");
		
		frame.setContentPane(mainPane);
		//Display the window.
		frame.pack();
		frame.setVisible(true);
//		frame.setResizable(false);
		frame.setBounds(50, 100, 450, 450);
    }

}
