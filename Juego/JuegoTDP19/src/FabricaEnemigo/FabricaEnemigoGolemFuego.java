package FabricaEnemigo;

import Entidad.Enemigos.Enemigo;
import Entidad.Enemigos.EnemigoGolemFuego;


public class FabricaEnemigoGolemFuego extends FabricaEnemigo {

    public static FabricaEnemigoGolemFuego instance=null;


    public  static FabricaEnemigoGolemFuego getFabricaGolemFuego(){
        if(instance==null){
            instance=new FabricaEnemigoGolemFuego();
        }
        return instance;
    }

    private FabricaEnemigoGolemFuego(){
        super();

    }


    public Enemigo crearEnemigo() {
        return new EnemigoGolemFuego(150,60,2000,0,2,100,5);
    }


    public Enemigo crearEnemigoBoosted() {
        Enemigo enemigo = new EnemigoGolemFuego(150,60,2000,0,2,100,5);
        enemigo.agregarPowerUp(obtenerPowerUpAlAzar());
        return enemigo;
    }
}
