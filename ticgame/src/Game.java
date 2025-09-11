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
 
    board = new char [BOARDSIZE][BOARDSIZE]; // create a new board
    firstPlayer = true; // first player starts the game
    gameOver = false; // game is not over at the start

    // initialize the board with empty spaces
    for (int row = 0; row < BOARDSIZE; row++){
        for (int col = 0; col < BOARDSIZE; col++){
            board[row][col] = ' '; // empty space
        }
    }
    
   }


   public void play(){

   } // to be called in main


   public void printStatus (int player){
    System.out.println(player == 1 ? "Player X's turn" : "Player O's turn");

   }


   public Status gameStatus (){
    // need to check for win, draw or continue

    // check the rows for a win using a loop
    for (int row = 0; row < BOARDSIZE; row++){
        if (board[row][0] != ' ' && board[row][0] == board[row][1] && board [row][1] == board[row][2]){
            return Status.WIN;
        }
    }

    // check the columns for a win using a loop
    for (int col = 0; col < BOARDSIZE; col ++){
        if (board[0][col] != ' ' && board [0][col] == board[1][col] && board [1][col] == board [2][col]){
            return Status.WIN;
        }
    }

    // check the diagonals for a win
    if (board[0][0] != ' ' && board [0][0] == board [1][1] && board [1][1] == board [2][2]){
        return Status.WIN;
    }
    if (board[0][2] != ' ' && board [0][2] == board [1][1] && board [1][1] == board [2][0]){
        return Status.WIN;
    }
    
    // any empty space?
    for (int row = 0; row < BOARDSIZE; row++){
        for (int col = 0; col < BOARDSIZE; col++){
            if (board[row][col] == ' '){
                return Status.CONTINUE; // if there is an empty space, the game will continue
            }
        }

    // if no empty spaces, then it is a draw
    return Status.DRAW;// this will be the new default
    }

    // if none of the conditions above are met, the game will continue
    return Status.CONTINUE; // defualt
   }


   public void printBoard(){

        // outer foor loop for the rows
        for (int row = 0; row < BOARDSIZE; row ++){
            // print the top border of the board
            System.out.println("-------------------------");
            // print the left border of the board
            System.out.print('|');
            for (int col = 0; col < BOARDSIZE; col ++){
                // print the value in the board with some formatting
                System.out.print("\t" + board[row][col] + "\t|");
            }
            // print a new line after each row
            if (row < BOARDSIZE - 1){
                System.out.println();
            }
        }
        // print the bottom border of the board
        System.out.println("\n-------------------------");
}


   public void placeSymbol (int col, int row, char val){
    if (validMove(col,row)){// check if the move is valid
        board [row-1][col-1]= val; // place that value 
    }
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

