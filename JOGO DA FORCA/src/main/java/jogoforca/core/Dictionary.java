package jogoforca.core;

import jogoforca.game.GameException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Dictionary  {

    private static Dictionary instance;

    public static Dictionary getInstance(){
        if (instance == null){
            String dictionaryClassName = Config.get("dictionayClassName");
            Class<?> clazz = null;
            try {
                clazz = Class.forName(dictionaryClassName);
                Constructor<?> constructor = clazz.getConstructor();
                instance = (Dictionary) constructor.newInstance();
            } catch (Exception e ) {
                throw  new RuntimeException(e);
            }


            instance = new StaticDictionary();
        }
        return instance;
    }

    public abstract   Word nextWord();

    public abstract String getName();

}
