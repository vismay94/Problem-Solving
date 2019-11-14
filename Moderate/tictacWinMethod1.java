package Moderate;

//We will assume here that we have been given last place where action happened.
public class tictacWinMethod1 {
    //    We will assume that in the matrix, 0 means EMPTY, 1 means circle and 2 means Cross
    public Boolean hasWon(int[][] board, int row, int col){
        if(board.length != board[0].length){
            return false;
        }
        int lastPlace = board[row][col];
        if(lastPlace ==0){
            return false;
        }

        if(hasWonRow(board,row) || hasWonColumn(board,col)) {
            return true;
        }
//        When first value of Row(leftest value), column given
        else if(row == col && hasWonDiagonal(board,1)){
                return true;
        }
//      Last value of Row or Column(Rightest value)
        else if(row == (board.length - col - 1) && hasWonDiagonal(board,-1)){
            return  true;
        }
        else{
            return false;
        }
    }
    //Compare each entry of Row with first value of row, if mismatch found then return false.
    private   Boolean hasWonRow(int[][] board, int row){
        for(int i=1; i<board[0].length;i++){
            if(board[row][i] != board[row][0]){
                return false;
            }
        }
        return true;
    }

    private Boolean hasWonColumn(int[][] board, int col){
        for(int i =1; i<board.length; i++){
            if(board[i][col] != board[0][col]){
                return false;
            }
        }
        return true;

    }

    private Boolean hasWonDiagonal(int[][] board, int direction){

        int row = 0;
        int col = direction == 1 ? 0: board.length -1;
        int first = board[row][col];

        for(int i =0; i<board.length; i++){
            if(board[row][col] != first){
                return false;
            }
            row += 1;
            col += direction;
        }
        return true;


    }

}
