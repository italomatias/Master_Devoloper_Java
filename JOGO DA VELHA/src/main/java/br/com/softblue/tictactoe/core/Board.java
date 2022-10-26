package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.Constants;
import br.com.softblue.tictactoe.ui.UI;

public class Board {

    private char [][] matrix = new char[Constants.BORD_SIZE][Constants.BORD_SIZE];

    public Board(){
        clear();
    }

    public void clear(){

        for (int i = 0 ; i<matrix.length;i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                matrix[i][j] = ' ';
            }
        }

    }

    public void print(){

        for (int i = 0 ; i<matrix.length;i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                UI.printTextNoNewLine( String.valueOf(matrix[i][j]));
                if (j<matrix[i].length - 1 ) {
                    UI.printTextNoNewLine(" | ");
                }
            }
            UI.printNewLine();

            if (i<matrix[i].length - 1 ) {
                UI.printText("----------");
            }
        }

    }

    public boolean isFull(){

        for (int i = 0 ; i<matrix.length;i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
               if(matrix[i][j]==' '){
                   return false;
               }
            }
        }

        return true;
    }

    public boolean play(Player player , Move move) throws  InvalidMoveException{


        if(move.getI()<0 || move.getJ()<0|| move.getI() >=matrix.length||move.getJ() >=matrix.length){
            throw new InvalidMoveException("O intervalor da jogada é inválido");
        }

        if(matrix[move.getI()][move.getJ()] != ' '){
            throw new InvalidMoveException("Essa jogada já foi realizada");
        }

       matrix[move.getI()][move.getJ()] = player.getSymbol();

       return checkRows(player) || checkCols(player) || checkDiagonal1(player) || checkDiagonal2(player);

    }

    private boolean checkRows(Player player){
        for (int i = 0; i < Constants.BORD_SIZE; i++){

            if(checkRow(i,player)){
                return true;
            }

        }
        return false;
    }

    private boolean checkRow(int i , Player player){
        for (int j = 0; j < Constants.BORD_SIZE; j++){
            if (matrix[i][j] != player.getSymbol()){
                return false;
            }
        }
        return true;
    }

    private boolean checkCol(int i , Player player){
        for (int j = 0; j < Constants.BORD_SIZE; j++){
            if (matrix[j][i] != player.getSymbol()){
                return false;
            }
        }
        return true;
    }

    private boolean checkCols(Player player){
        for (int i = 0; i < Constants.BORD_SIZE; i++){

            if(checkCol(i,player)){
                return true;
            }

        }
        return false;
    }

    private boolean checkDiagonal1(Player player){

        for (int i = 0; i < Constants.BORD_SIZE; i++){

            if (matrix[i][i]!= player.getSymbol()){
                return false;
            }

        }

        return  true ;
    }

    private boolean checkDiagonal2(Player player){

        for (int i = Constants.BORD_SIZE - 1 , j = 0 ; i >= 0; i-- , j++){

            if (matrix[i][j]!= player.getSymbol()){
                return false;
            }

        }

        return  true ;
    }
}

