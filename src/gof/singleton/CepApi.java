package gof.singleton;

/**
 * Singleton "Apressado"
 * @author vitorramon
 *
 */

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }
}
