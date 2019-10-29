package FabricaDisparos;

import Entidad.Disparos.Disparo;
import Entidad.Disparos.DisparoArqueroHumano;
import Entidad.Personaje;
import Juego.Mapa;

import java.awt.*;

public class FabricaDisparoArquero extends FabricaDisparo {


    public FabricaDisparoArquero(Personaje disparador){
        super(disparador);

    }


    public void generarDisparo() {

        Disparo nuevoDisparo= new DisparoArqueroHumano(new Point(disparador.getPos().x+30,disparador.getPos().y+50),23,disparador.getDamage(),disparador);

        Mapa.getMapa().agregarEntidad(nuevoDisparo);
        hiloPuedeAtacar=new HiloPrueba(disparador);
        hiloPuedeAtacar.start();
    }
}
