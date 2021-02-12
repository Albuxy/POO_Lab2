package Lab2;

import java.util.LinkedList;
import java.awt.Graphics;

public class World {
    
    //Creamos la lista de continentes que habran en el mundo
    private LinkedList<Continent> conts;
    
    // <editor-fold defaultstate="collapsed" desc="World">
    public World(LinkedList<Continent> l) {
        
        conts = l;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="draw">
    public void draw(Graphics g, double x, double y) {
        int max_size= this.conts.size();
        //Lo mismo que con las regiones, en este caso entrara en el bucle para dibujar los 2 continentes
        for (int i = 0; i < max_size; i++) {
            
            //Solo entrara dos veces en este bucle
            this.conts.get(i).draw(g, x, y);
        }

    }
    // </editor-fold>

}
