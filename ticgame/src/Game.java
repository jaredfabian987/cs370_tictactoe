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
       for (int i = 0; i < BOARDSIZE; i ++){
        cout << "-------------------------\n";
        cout << "|";
     
        for (int  j = 0; j < 3; j++){
            cout  << "\t" << board [i][j] << "\t|";
        }
        if (i < BOARDSIZE-1){
            cout << "\n";
        }
        
        
    }
    
    cout << "\n-------------------------\n";
   }
   
   public void printSymbol (int col, int row, char val){

   }

   public boolean validMove(int col, int row){


    return false;
   }


 }

