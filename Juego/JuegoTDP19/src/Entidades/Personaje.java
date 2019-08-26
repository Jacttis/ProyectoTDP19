package Entidades;
import java.awt.*;

public abstract class Personaje extends Entidad {
	
	protected int vida,da�o;
	protected float velocidadAtaque;
	protected String descripcion;
	protected Inteligencia IA;
	protected Premio objetos [];
	
	public Personaje(Point ubicacion,int vida,int da�o,float velocidadAtaque,String descripcion,Inteligencia IA) {
		super(ubicacion);
		this.vida=vida;
		this.da�o=da�o;
		this.velocidadAtaque=velocidadAtaque;
		this.descripcion=descripcion;
		this.IA=IA;
		
	}
	//Getters
	public int getVida() {
		return vida;
	}
	public int getDa�o() {
		return da�o;
	}
	public float getVelocidadAtaque() {
		return velocidadAtaque;
	}
	public Inteligencia getInteligencia() {
		return IA;
	}
}
