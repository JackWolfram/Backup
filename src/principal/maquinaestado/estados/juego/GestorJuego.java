/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.maquinaestado.estados.juego;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import principal.maquinaestado.EstadoJuego;
import principal.sprites.HojaSprites;

/**
 *
 * @author Jack_Wolfram
 */
public class GestorJuego implements EstadoJuego{

    private GestorMapa gestorMapa;
    HojaSprites hs = new HojaSprites("/recursos/imagenes/hojasTexturas/1.png", 16, false);
    
    @Override
    public void actualizar() {
        
    }

    @Override
    public void dibujar(Graphics g) {
        BufferedImage imagen = hs.obtenerSprite(0, 0).obtenerImagen();
        g.drawImage(imagen, 100, 100, null);
    }
    
}
