package FabricaBotones.BotonesAliados;

import Entidad.Aliados.Aliado;
import Tienda.Tienda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class BotonAliado extends JButton {

    public BotonAliado(String imagePath){
        this.setToolTipText("Valor : "+getAliado().getPrecio()+" de Oro | "+getAliado().getDescripcion()+" |");
        this.setBackground(Color.DARK_GRAY);
        this.setIcon(new ImageIcon(imagePath));
//        this.setBounds();
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tienda.getTienda().setNextToAdd(getAliado());
            }
        });
    }

    public abstract Aliado getAliado();

}
