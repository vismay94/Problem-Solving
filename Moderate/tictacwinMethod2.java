package Moderate;

public class tictacwinMethod2 {

    public boolean hasWon(int[][] board){
        for (int i=0; i<board.length; i++){
//            Check for Rows
            if(hasWinner(board[i][0],board[i][1],board[i][2])){
                return true;
            }
//            Check for Columns
            if(hasWinner(board[0][i],board[1][i],board[2][i])){
                return true;
            }
            if(hasWinner(board[0][0],board[1][1],board[2][2])){
                return true;
            }
            if(hasWinner(board[0][2],board[1][1],board[2][0])){
                return true;
            }

        }
        return false;
    }
    private boolean hasWinner(int x, int y,int z){
        return x == y && y == z;
    }
}
