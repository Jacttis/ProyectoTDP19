package Entidad;


import Constantes.Constantes;
import Estados.Quieto;
import FabricaDisparos.FabricaDisparo;

import java.awt.*;
import javax.swing.*;

public class CaballeroEscudo extends Aliado {

    public CaballeroEscudo(int vida, int damage, float velocidadAtaque,int rango, String Descripcion){
        super(vida, damage, velocidadAtaque,rango, Descripcion);

        width= Constantes.ALIADOX;
        height=Constantes.ALIADOY;

        estado=new Quieto(this);

        imagen[0]=new ImageIcon("Sprites/CharacterSprites/GIFs/StillTrueCab.gif");
        imagen[1]=new ImageIcon("Sprites/CharacterSprites/GIFs/StillTrueCab.gif");
        imagen[2]=new ImageIcon("Sprites/CharacterSprites/GIFs/StillTrueCab.gif");
    }


    public void iniciarEtiquetaVida(){
        if(this.etiquetaVida==null){
            this.etiquetaVida=new JLabel();
            this.etiquetaVida.setBounds(pos.x,pos.y+this.height,80,5);
            this.etiquetaVida.setOpaque(true);
            this.etiquetaVida.setBackground(Color.GREEN);
            this.graficos[1]=etiquetaVida;
        }
    }

    public void actualizarEtiquetaVida(int n){

        if(etiquetaVida!=null) {
            etiquetaVida.setBounds(pos.x+this.width-90, pos.y+this.height+5 , (etiquetaVida.getWidth()-((n*80)/100)), etiquetaVida.getHeight());

            if (vidaActual < 70) {
                if (vidaActual < 40)
                    etiquetaVida.setBackground(Color.RED);
                else etiquetaVida.setBackground(Color.YELLOW);
            }
        }
    }

    public void atacar() {

    }

    public Entidad clone(){
        return new CaballeroEscudo(vidaTotal,damage,velocidadAtaque,rango,descripcion);
    }

    public Rectangle getHitBox(){
        return new Rectangle(pos.x,pos.y,width-20,height-70);
    }
}
