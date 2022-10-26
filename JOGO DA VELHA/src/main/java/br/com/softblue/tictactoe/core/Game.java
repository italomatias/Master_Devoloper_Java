package br.com.softblue.tictactoe.core;

import br.com.softblue.tictactoe.Constants;
import br.com.softblue.tictactoe.score.FileScoreManager;
import br.com.softblue.tictactoe.score.ScoreManager;
import br.com.softblue.tictactoe.ui.UI;

import java.io.IOException;

public class Game {

    private Board board = new Board();
    private Player [] players = new Player[Constants.SYMBOL_PLAYERS.length];
    private int currentPlayerIndex = -1 ;
    private ScoreManager scoreManager;

    public void play() throws IOException{

        scoreManager = createScoreManager();

        UI.printGameTitle();

        for ( int i = 0 ; i < players.length ; i++ ){
          players[i] =  createPlayer(i);
        }

        boolean gameEnded = false ;

        Player currentPlayer = nextPlayer();
        Player winner = null;

        while (!gameEnded){

            board.print();

            try{
                gameEnded = currentPlayer.play();
            }catch (InvalidMoveException e){
                UI.printText("Erro: " + e.getMessage());
                continue;
            }


            if (gameEnded){
                winner = currentPlayer;
            }

            if (board.isFull()){
                gameEnded = true;
            }

            currentPlayer = nextPlayer();

        }

        if(winner == null){

            UI.printText("O jogo terminou empatado");

        }else{

            UI.printText("O jogador '"+ winner.getName()+"' venceu o jogo !!");

            scoreManager.saveScore(winner);

        }

        board.print();
        UI.printText("FIM DO JOGO !!!");

    }

    private Player createPlayer(int index){
        String name = UI.readInput("Jogador " + (index+1) + "=>");
        Player player = new Player(name , board , Constants.SYMBOL_PLAYERS[index] );

        Integer score =  scoreManager.getScore(player);

        if(score != null){
            UI.printText("O jogador "+ player.getName()+" Já possui :" + score + " vitória(s)");
        }

        UI.printText("O jogador '" + name +"' usará o símbolo '" + Constants.SYMBOL_PLAYERS[index]+"'");

        return player;

    }

    private  Player nextPlayer() {

        currentPlayerIndex++;

        if(currentPlayerIndex >= players.length){
            currentPlayerIndex = 0;
        }

        return players[currentPlayerIndex];
    }

    private ScoreManager createScoreManager() throws IOException {

        return  new FileScoreManager();

    }



}
