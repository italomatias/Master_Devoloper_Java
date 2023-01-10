package jogoforca.game;

import jogoforca.core.Config;
import jogoforca.core.Dictionary;
import jogoforca.core.InvalidCharacterException;
import jogoforca.core.Word;
import jogoforca.ui.UI;

import java.util.HashSet;
import java.util.Set;

public class Game {



    public void start(){

        UI.print("BEM VINDO AO JOGO DA FORCA ! ");
        Dictionary dictionary = Dictionary.getInstance();
        UI.print("Dcionário usado :  " + dictionary.getName() );
        Word word = dictionary.nextWord();

        UI.print("A palavra tem " + word.size() + " letras." );
        Set<Character> useedChars = new HashSet<>();
        int errorCount = 0 ;
        int MAX_ERROS = Integer.parseInt(Config.get("maxErros"));

        while (true){
            UI.print(word);
            UI.printNewLine();

            char c ;
            try{
                c = UI.readChar("Digite uma letra: ");

                if(useedChars.contains(c)){
                    throw  new InvalidCharacterException("Está letra já fou utilizada.");
                }
                    useedChars.add(c);

                if (word.hasChar(c)){
                    UI.print("Você acerto uma letra !!!");
                }else{
                    errorCount ++;
                    if(errorCount < MAX_ERROS){
                        UI.print("ERRROUUUU , VC AINDA TEM MAIS :" + (MAX_ERROS - errorCount) + " Chances");
                    }
                }

                UI.printNewLine();

                if (word.discovered()){
                    UI.print("PARABÉNS ! Você acertou a palavra completa : " + word.getOriginalWord());
                    UI.print("FIM DO JOGO");
                    break;
                }

                if (errorCount == MAX_ERROS){
                    UI.print("GAME OVER ! A palavra correta era  : " + word.getOriginalWord());
                    UI.print("FIM DO JOGO");
                    break;
                }

            }catch (InvalidCharacterException e){
                UI.print("Erro: " + e.getMessage());
            }

        }

    }
}
