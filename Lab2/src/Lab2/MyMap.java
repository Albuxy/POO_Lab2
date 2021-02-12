package Lab2;

import java.util.LinkedList;

    
public class MyMap extends javax.swing.JPanel {
    
    //Regiones
    private PolygonalRegion region1;
    private PolygonalRegion region2;
    private PolygonalRegion region3;
    private PolygonalRegion region4;
    //Continentes
    private Continent continente1;
    private Continent continente2;
    //Mundo
    private World mundo;
    
    // <editor-fold defaultstate="collapsed" desc="MyMap"> 
    public MyMap() {
        
        initComponents();
        //Tamaño maximo sera de 600 ya que tenemos un punto en 500
        setSize(600, 600);
        
        //Creamos las 4 listas de puntos para cada poligono
        LinkedList<Point> poligono1 = new LinkedList <Point>();   
        LinkedList<Point> poligono2 = new LinkedList <Point>(); 
        LinkedList<Point> poligono3 = new LinkedList <Point>();   
        LinkedList<Point> poligono4 = new LinkedList <Point>(); 
        
        //Añadimos los puntos de la primera región
        poligono1.add(new Point(0, 0));
        poligono1.add(new Point(0, 100));
        poligono1.add(new Point(200, 100));
        poligono1.add(new Point(200, 0)); 
        //Añadimos los puntos de la segunda región
        poligono2.add(new Point(0, 200));
        poligono2.add(new Point(0, 300));
        poligono2.add(new Point(200, 300));
        poligono2.add(new Point(200, 200)); 
        //Añadimos los puntos de la tercera región
        poligono3.add(new Point(300, 0));
        poligono3.add(new Point(300, 100));
        poligono3.add(new Point(500, 100));
        poligono3.add(new Point(500, 0)); 
        //Añadimos los puntos de la cuarta región
        poligono4.add(new Point(300, 200));
        poligono4.add(new Point(300, 300));
        poligono4.add(new Point(500, 300));
        poligono4.add(new Point(500, 200)); 
        
        //Establecemos que cada poligono sera una region de la clase PolygonalRegion
        region1 = new PolygonalRegion(poligono1);
        region2 = new PolygonalRegion(poligono2);
        region3 = new PolygonalRegion(poligono3);
        region4 = new PolygonalRegion(poligono4);
        
        //Creamos las listas de regiones para los dos continentes
        LinkedList<PolygonalRegion> zona1 = new LinkedList <PolygonalRegion>();
        LinkedList<PolygonalRegion> zona2 = new LinkedList <PolygonalRegion>();  
        
        //Añadimos al primer continent las dos primeras regiones
        zona1.add(region1);
        zona1.add(region2);
        //Añadimos al segundo continent las dos primeras regiones
        zona2.add(region3);
        zona2.add(region4);
        
        //Establecemos que cada zona sera un conntienente
        continente1 = new Continent (zona1);
        continente2 = new Continent (zona2);
        
        //Creamos la lista de continentes denominada worldl
        LinkedList<Continent> mundo1 = new LinkedList<Continent>();   
        
        //Añadimos al mundo los dos continentes
        mundo1.add(continente1);
        mundo1.add(continente2);
        
        //Establecemos el mundo como el tipo de clase de World
        mundo = new World (mundo1);
        
        //Imprimimos las areas de los poligonos y continentes
        System.out.printf("----Areas poligonos----\n");
        System.out.printf("Poligono 1: %d\n",region1.getArea());
        System.out.printf("Poligono 2: %d\n",region2.getArea());
        System.out.printf("Poligono 3: %d\n",region3.getArea());
        System.out.printf("Poligono 4: %d\n",region4.getArea());
        System.out.printf("-----------------------\n\n");
        System.out.printf("----Areas total poligonos----\n");
        System.out.printf("Continente 1: %d\n",continente1.getTotalArea());
        System.out.printf("Continente 2: %d\n",continente2.getTotalArea());
        System.out.printf("-----------------------------\n");
        
        
    }
    // </editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Paint">  
    public void paint(java.awt.Graphics g) {
        
        super.paint(g);
        
        mundo.draw(g, 10, 10);
    }
    // </editor-fold> 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
