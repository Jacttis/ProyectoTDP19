package Niveles;

import java.awt.Point;
import java.util.Random;

import Constantes.Constantes;
import Entidad.Enemigos.Enemigo;
import Entidad.ObjetosMapa.ObjetoMapa;
import Entidad.ObjetosMapa.ObjetoPiedra;
import FabricaDisparos.FabricaDisparoReaperMan;
import FabricaEnemigo.*;
import Juego.Juego;
import Juego.Mapa;
import Niveles.Oleada.PrimerOleada;

public class NivelUno extends Nivel {

	public NivelUno() {
		super();
		nivelSiguiente=new NivelDos();
		oleada = new PrimerOleada(this);
	}


	public void llenarListaEnemigosSpawn() {

		listaEnemigosSpawn.add(FabricaEnemigoGolemHielo.getFabricaGolemHielo());
		listaEnemigosSpawn.add(FabricaEnemigoGolemTierra.getFabricaGolemTierra());
	}


	public void run(){

		try {

			//inicializarCartelPrimerOleada();

			//sleep(5000);

			//removerCartelOleada();



			Random r= new Random();
			int aparicionObjeto = r.nextInt(10);
			if(aparicionObjeto<5) {
				ObjetoMapa piedra = new ObjetoPiedra(new Point(1000, obtenerPosicionAleatoriaEnY()), 300);
				Mapa.getMapa().agregarEntidad(piedra);
			}

			oleada.setEnemigosAGenerar(3);

			oleada.start();

			while(true){
				if((!oleada.getEnemigosGenerados().isEmpty()) && (oleada.verificarMuerteDeOleada())){
					oleada=oleada.getSiguiente();

					break;

				}
				else
					if(oleada.verificarEnemigoGano()){
						Mapa.getMapa().perdio();
						break;
					}
				sleep(1000);

			}

			sleep(1000);

			listaEnemigosSpawn.add(FabricaEnemigoGolemFuego.getFabricaGolemFuego());

			oleada.setEnemigosAGenerar(5);

			oleada.start();

			while(true){
				if((!oleada.getEnemigosGenerados().isEmpty()) && (oleada.verificarMuerteDeOleada())){
					oleada=oleada.getSiguiente();

					break;

				}
				else
				if(oleada.verificarEnemigoGano()){
					Mapa.getMapa().perdio();
					break;
				}
				sleep(1000);

			}

			sleep(1000);


			aparicionObjeto = r.nextInt(10);
			if(aparicionObjeto<5) {
				ObjetoMapa piedra = new ObjetoPiedra(new Point(1000, obtenerPosicionAleatoriaEnY()), 300);
				Mapa.getMapa().agregarEntidad(piedra);
			}

			oleada.setEnemigosAGenerar(5);

			Enemigo reaper = FabricaEnemigoReaperMan.getFabricaReaperMan().crearEnemigo();
			reaper.posicionar(new Point(Constantes.ENEMIGOS_PX,obtenerPosicionAleatoriaEnY()));
			oleada.agregarEnemigo(reaper);

			oleada.start();


			while(true){
				if((!oleada.getEnemigosGenerados().isEmpty()) && (oleada.verificarMuerteDeOleada())){
					oleada=oleada.getSiguiente();
					break;
				}
				else
				if(oleada.verificarEnemigoGano()){
					Mapa.getMapa().perdio();
					break;
				}
				sleep(1000);

			}

			Mapa.getMapa().terminoNivel();



		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}


	public String getDireccionImagenFondoNivel(){
		String direccion="Sprites/Mapa/Mapa2Disenio.jpg";
		return direccion;
	}

}
