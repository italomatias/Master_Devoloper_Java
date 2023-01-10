package jogoforca.core;

import jogoforca.game.GameException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Dictionary  {

    private static Dictionary instance;

    public static Dictionary getInstance(){
        if (instance == null){
            instance = new StaticDictionary();
        }
        return instance;
    }

    public abstract   Word nextWord();

    public abstract String getName();

}
