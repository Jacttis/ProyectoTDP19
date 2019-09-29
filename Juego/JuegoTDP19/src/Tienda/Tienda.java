package Tienda;

import java.awt.*;
import java.util.LinkedList;

import Entidad.Aliado;

public class Tienda {

	private static Tienda instance=null;
	private LinkedList<Aliado> aliados;
	private int oro;
	private int puntos;

	private PosicionadorDeAliado posicionadorDeAliados;
	//private LinkedList<ObjetoPrecioso> objetos;

	private Tienda(PosicionadorDeAliado posicionador){

		posicionadorDeAliados=posicionador;
	}
	public  static Tienda crearTienda(PosicionadorDeAliado posicionador){
		if (instance==null){
			instance=new Tienda(posicionador);
		}
		return instance;
	}

	//setters
	public void setPuntos(int puntos){
		this.puntos=puntos;
	}
	public void setOro(int oro){
		this.oro=oro;
	}

	//getters
	public int getOro(){
		return oro;
	}
	public int getPuntos(){
		return puntos;
	}

	public void agregarAliado(Point pos,Aliado aliadoAAgregar){
		posicionadorDeAliados.posicionarAliado(pos,aliadoAAgregar);
	}




	
}
