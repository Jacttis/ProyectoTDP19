package Inteligencia;

import Entidad.Entidad;
import Graficos.Grafico;

public class InteligenciaPowerUp extends Inteligencia {

    public InteligenciaPowerUp(Entidad powerUp){
        super(powerUp);
    }

    public void actualizarEntidad() {
        entidad.getPos().setLocation(entidad.getPos().x-entidad.getVelocidad(),entidad.getPos().y);
        entidad.actualizarGraficos();
    }
}