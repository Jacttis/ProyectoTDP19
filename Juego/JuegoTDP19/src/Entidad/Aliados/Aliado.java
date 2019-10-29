/**
 * Clase creada por Julian Acttis,Axel Fontana, Leandro Moran
 */
package Entidad.Aliados;

import Colisionadores.Colisionador;
import Colisionadores.ColisionadorAliado;
import ColisionadoresCombate.ColCombateAliado;
import ColisionadoresCombate.ColisionadorCombate;
import Entidad.*;
import Estados.Quieto;
import Inteligencia.InteligenciaAliados;
import java.awt.*;
import Juego.Mapa;
import Tienda.*;

public abstract class Aliado extends Personaje {

     protected String descripcion;
     protected int precio;
     protected Entidad disparo;
     protected ParCelda celdaUbicado;
    

    /**
     * Crea un Personaje Aliado

     * @param vida
     * @param damage

     * @param velocidadAtaque

     * @param Descripcion
     */
    public Aliado(int vida, int damage,float velocidadAtaque,int rango, double velocidad, String Descripcion) {
        super(new Point(0,0), vida, damage, velocidadAtaque, rango,velocidad);
        IA=new InteligenciaAliados(this);

        descripcion=Descripcion;

        colisionador=new ColisionadorAliado(this);
        colisionadorCombate=new ColCombateAliado(this);

        precio=1;

        estado=new Quieto(this);

    }
    /**
     * Devuelve la descripcion del Personaje Aliado
     * @return String con personaje aliado
     */
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * Retorna el valor del atributo precio del Aliado
     *
     *
     * @return int precio
     */

    public int getPrecio(){
        return precio;
    }

    public void setPrecio(int nuevoPrecio){
        precio=nuevoPrecio;
    }

    /**
     * Redefinicion del eliminarse mas general.
     *
     * Cuando se elimina desocupa la posicion en celda que ocupaba.
     *
     */

    public void eliminarse(){

        celdaUbicado.desocupar();
        Mapa.getMapa().eliminarEntidad(this);
    }

    public void posicionar(ParCelda celda){
        celda.ocupar();
        celdaUbicado=celda;
        pos.setLocation(celda.getPos());
    }

    public ParCelda getCelda(){
        return celdaUbicado;
    }

    /**
     * implementacion del metodo abstracto serChocado.
     *
     * Le envia al colisionador parametrizado el mensaje afectarAliado, con
     * esta instancia (Aliado) como parametro.
     * @param colisionador
     */

    public void serChocado(Colisionador colisionador){
        colisionador.afectarAliado(this);
    }

    public void serDetectado(ColisionadorCombate colisionadorCombate){
        colisionadorCombate.detectoAliado(this);
    }


    public Rectangle getRangoCombate() {
        Rectangle hitBox=this.getHitBox();
        hitBox.width=hitBox.width+rango;
        hitBox.setLocation(hitBox.x,hitBox.y);

        return hitBox;
    }


}