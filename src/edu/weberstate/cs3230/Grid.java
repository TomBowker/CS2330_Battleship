package edu.weberstate.cs3230;

/**
 * Created by Tom on 1/23/2017.
 */

public class Grid {

    //create and initialize a 2D array
    // insert '$' to show that it is filled
    private String[][] gameboard = new String[10][10];

    public void Board() {

        //This will build my 2D Array and I will put the symbol $ for testing purposes
        //$ = empty
        for(int row = 0; row < gameboard.length; row++){
            for(int column = 0; column < gameboard.length; column++){
                gameboard[row][column] = "$";
            }
        }
    }

    //we need the ability to insert data into the array and replace the value
    public void InsertItem(char row, int column){

        int x = (int)row - 65;
        int y = column;

        //if the input is proper then replace that spot with a 1
        gameboard[x][y] = "0";
    }

    /*These Methods are for testing only*/

    //for testing purposes we need to create a display array
    //this will show what is being selected and what is not being selected
    public void DisplayBoard(){

        //This will help in testing so I can see what is being used and what is not
        for(int row = 0; row < gameboard.length; row++){
            for(int column = 0; column < gameboard.length; column++){
                System.out.print(gameboard[row][column] + " ");
            }
            System.out.println();
        }
    }

    //we need to test for what empty and what is not empty
    //this will take in an input of a String row and String column
    //isEmpty()
    public void IsEmpty(char row, int column){

        if(!(gameboard[(int)row - 65][column].equals("0")))
            System.out.println("location: " + row + ", " + column + " is empty");
        else
            System.out.println("location: " + row + ", " + column + " is occupied");
    }

}
