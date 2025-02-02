package Entidad.Aliados;

import Entidad.PowerUp.ControladorPowerAliado;
import Entidad.PowerUp.PowerUp;
import FabricaBotones.BotonVender;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseOyenteAliado implements MouseListener {
    private Aliado aliado;

    public MouseOyenteAliado(Aliado aliado){
        this.aliado=aliado;
    }

    /**
     * Si se clickea sobre el JLabel del sprite del aliado se envia el mensaje
     * al BotonVender intentoVenderAliado y tambien se envia el mensaje aplicarPowerToAliado
     * de ControladorPowerAliado.
     *
     * @param e
     */

    public void mouseClicked(MouseEvent e) {

        BotonVender.getBotonVender().intentoVenderAliado(aliado);
        ControladorPowerAliado.getControladorPowerAliado().aplicarPowerToAliado(aliado);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
