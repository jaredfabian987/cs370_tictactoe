// import java.util.Scanner;

public class Game {
    // this is a constant for the boardsize 
   public static final int BOARDSIZE = 3;

   // this will hold the possible status that the game can be in
   public enum Status {WIN, DRAW, CONTINUE}

   public char[][] board; // initialize a 2d array

   public boolean firstPlayer; // if player turn is first
   public boolean gameOver; // if game is over

   public void play(){} // to be called in main

   public void printStatus (int player){


   }

   public Status gameStatus (){
    return Status.CONTINUE;

   }

   public void printBoard(){

        // outer foor loop for the rows
        for (int i = 0; i < BOARDSIZE; i ++){
            // print the top border of the board
            System.out.println("-------------------------");
            // print the left border of the board
            System.out.print('|');
            for (int j = 0; j < BOARDSIZE; j++){
                // print the value in the board with some formatting
                System.out.print("\t" + board[i][j] + "\t|");
            }
            // print a new line after each row
            if (i < BOARDSIZE - 1){
                System.out.println();
            }
        }
        // print the bottom border of the board
        System.out.println("\n-------------------------");
}

   public void printSymbol (int col, int row, char val){

   }

   public boolean validMove(int col, int row){


    return false;
   }


 }

