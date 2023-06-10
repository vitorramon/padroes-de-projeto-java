import gof.facade.Facade;
import gof.singleton.CepApi;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        /* Singleton */

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        CepApi eager = CepApi.getInstance();
        System.out.println(eager);
        eager = CepApi.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        /* Strategy */

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);

        robo.mover();

        robo.setComportamento(agressivo);

        robo.mover();
        robo.mover();


        /* Facade */

        Facade facade = new Facade();
        facade.migrarCliente("Ramon", "78945-896");


    }
}