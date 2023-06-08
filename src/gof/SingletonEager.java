package gof;

/**
 * Singleton "Apressado"
 * @author vitorramon
 *
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
