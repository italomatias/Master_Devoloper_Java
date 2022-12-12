package jogoforca.game;

import jogoforca.core.Dictionary;
import jogoforca.core.Word;

public class Game {
    public void start(){

        Dictionary d = Dictionary.getInstance();
        Word w = d.nextWord();
        System.out.println(w.getOriginalWord());

    }
}
