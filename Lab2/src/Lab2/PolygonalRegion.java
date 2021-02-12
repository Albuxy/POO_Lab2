package Lab2;

import java.util.LinkedList;
import java.awt.Graphics;

public class PolygonalRegion {
    
    private LinkedList <Point> points;
    
    // <editor-fold defaultstate="collapsed" desc="PolygonalRegion">
    public PolygonalRegion(LinkedList <Point> l){
        
       points=l;
   }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="getArea">
    public int getArea(){
        
        int max_size=this.points.size();
        int Area1 = 0;
        int Area2 = 0;
        
        //Calculará el Area1, sumando cada vez la multiplicacion entre el punto "x" de un poligono por el punto "y" del siguiente poligono 
        for (int i = 0; i < max_size-1 ; i++) {
            
            Area1 = Area1 + (this.points.get(i).getX() * this.points.get(i+1).getY());            
            
        }
        
        //Calculará el Area2, sumando cada vez la multiplicacion entre el punto "x" de un poligono por el punto "y" del anterior poligono 
        for (int i = 0; i < max_size-1 ; i++) {
            
            Area2 = Area2 + (this.points.get(i).getY() * this.points.get(i+1).getX());            
            
        }
        
        //Sumara los puntos finales de cada uno de las areas
        Area1 = Area1 + (this.points.get(this.points.size()-1).getX() * this.points.get(0).getY());
        Area2 = Area2 + (this.points.get(this.points.size()-1).getY() * this.points.get(0).getX());
        
        //Devolvera la area total
        return -(Area1-Area2)/2;

    }
    // </editor-fold>
      
    // <editor-fold defaultstate="collapsed" desc="draw">  
      public void draw(Graphics g,double x, double y){
          int max_size=this.points.size();
          
          //Entrara en el bucle para dibujar las 4 regiones existentes
           for (int i = 0; i < max_size-1; i++) {
             //Entrara 4 veces en este bucle
              g.drawLine((int)(points.get(i).getX()+x),(int)(points.get(i).getY()+y), (int)(points.get(i+1).getX()+x), (int)(points.get(i+1).getY()+y));
          }
        g.drawLine((int)(points.get(this.points.size()-1).getX()+x),(int)(points.get(this.points.size()-1).getY()+y), (int)(points.get(0).getX()+x), (int)(points.get(0).getY()+y));
      }
    // </editor-fold>  
}
