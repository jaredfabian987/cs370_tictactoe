// import java.util.Scanner;

public class Game {
    // this is a constant for the boardsize 
   public static final int BOARDSIZE = 3;

   // this will hold the possible status that the game can be in
   public enum Status {WIN, DRAW, CONTINUE}

   public char[][] board; // initialize a 2d array

   public boolean firstPlayer; // if player turn is first
   public boolean gameOver; // if game is over

   // need a constructor for this class
   public Game(){
    // need to initialize a new instance of thie board and make it empty
    // need to set first player to true
    // need to set game over to false
   }

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
    // we need to check if the col and row entered by the user is within 1-3
    if (col >=1 && col <= BOARDSIZE && row >=1 && row <= BOARDSIZE ){
        if (board[row-1][col-1] == ' '){ // note that -1 is for the index since it starts at 0
            return true;
        }
    }
    // will deefault if the contions are not met
    System.out.println("Invalid move, please try again");
    return false;
   }


 }

