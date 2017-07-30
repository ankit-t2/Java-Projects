package com.sudoku.sudokuMain;

import com.sudoku.gui.GUI;

public class SudokuMain {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		GUI gui = new GUI();
    	gui.createAndShowGUI();
	}

}
