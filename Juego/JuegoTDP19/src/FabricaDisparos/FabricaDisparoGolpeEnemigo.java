package FabricaDisparos;

import Entidad.Enemigo;
import Entidad.GolpeEnemigo;
import Entidad.Personaje;
import Juego.Mapa;

public class FabricaDisparoGolpeEnemigo extends FabricaDisparo {

    protected GolpeEnemigo golpeEnemigo;

    public FabricaDisparoGolpeEnemigo(Personaje disparador){
        super(disparador);


    }

    public void generarDisparo() {
        GolpeEnemigo golpeNuevo=new GolpeEnemigo(disparador.getPos(),20,disparador.getWidth(),disparador.getHeight(),disparador);
        Mapa.getMapa().agregarEntidad(golpeNuevo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}