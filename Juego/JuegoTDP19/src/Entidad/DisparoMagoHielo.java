package Entidad;

import java.awt.Point;

import javax.swing.ImageIcon;

import Graficos.Grafico;
import Graficos.SpriteEntidad;
import Inteligencia.InteligenciaDisparoAliado;

public class DisparoMagoHielo extends Disparo {

	
	
	
	public DisparoMagoHielo(Point pos, double velocidad, int damage, Personaje disparador) {
		super(pos, velocidad, damage, disparador);
		IA=new InteligenciaDisparoAliado(this);
		
		width=45;
		height=45;
		
		imagen[0]=new ImageIcon("Sprites/CharacterSprites/GIFs/MagoHielo/DisparoMagoHieloTRUE.gif");

		Grafico sprites=new SpriteEntidad(this,imagen,0,0);
		listaGraficos.add(sprites);
	
		
	}

	public Entidad clone(){
		return new DisparoMagoHielo(pos,velocidad,damage,disparador);
	}
	
	
	
}
