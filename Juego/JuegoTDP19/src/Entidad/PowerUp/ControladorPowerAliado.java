package Entidad.PowerUp;

import Entidad.Aliados.Aliado;
import Entidad.PowerUp.MagiasTemporales.MagiaTemporal;

public class ControladorPowerAliado {

    public static ControladorPowerAliado instance = null;

    public static ControladorPowerAliado getControladorPowerAliado(){
        if(instance==null)
            instance=new ControladorPowerAliado();

        return instance;
    }

    private MagiaTemporal nextMagia;

    private ControladorPowerAliado(){

    }

    public void setNextPower(MagiaTemporal magia){
        nextMagia=magia;
    }

    public void aplicarPowerToAliado(Aliado aliado){
        if(nextMagia!=null) {
            nextMagia.afectarPersonaje(aliado);
            nextMagia=null;
        }
    }


}
