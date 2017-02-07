package edu.weberstate.cs3230;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    //create an instance of a scanner and my class Grid
        Grid grid = new Grid();
        Scanner scanner = new Scanner(System.in);

        //variables for data collection
        String input = "";
        char alphaInput;
        String numericalInput;
        int convertedNumInput;

        //create a game board and test whats inside
        grid.Board();
        grid.DisplayBoard();

        while(!(input == "Q")){

            //prompt users for the first coordinate
            System.out.println("Please enter a A-J character:");
            alphaInput = scanner.next().toUpperCase().charAt(0);
            System.out.println();

            if(alphaInput == 'Q') {
                System.out.println("Have a Nice Day");
                break;
            } //else if(alphaInput == )

            //prompt users for the second coordinate
            System.out.println("Please enter 0-9 number:");
            numericalInput = scanner.next().toUpperCase();

            if(numericalInput.equals("Q")){
                System.out.println("Have a Nice Day");
                break;
            }

            convertedNumInput = Integer.parseInt(numericalInput);

            if(convertedNumInput > 9){
                System.out.println("INVALID INPUT");
                break;
            }

            //insert coordinate into grid
            grid.InsertItem(alphaInput, convertedNumInput);

            //for testing purposes see if that part of the array has been filled
            grid.IsEmpty(alphaInput, convertedNumInput);

            System.out.println("Continue.... press enter, or hit Q to quit");
            input = scanner.next().toUpperCase();

            if(input.equals("Q")){
                break;
            }
        }

        //After input
        grid.DisplayBoard();
    }
}
