package Estados;

import Entidad.Entidad;
import Entidad.Personaje;
import Graficos.Grafico;

public class Quieto extends Estado{
    public Quieto(Personaje personaje) {
        super(personaje);
    }


    public void actuar(){

        for( Grafico grafico : personaje.getListaGraficos()) {
            grafico.actualizarGrafico();
            grafico.cambiarGrafico(3);

        }

        verificarEstado();
    }


    /**
     * Redefiniciones de metodos generales para que cuando se este en este
     * estado no produzcan ninguna funcion.
     *
     */

    public void cambiarAQuieto(){

    }
}
