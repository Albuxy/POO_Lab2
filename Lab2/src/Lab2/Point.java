package Lab2;

public class Point {
    
    private int x;
    private int y;
    
    // <editor-fold defaultstate="collapsed" desc="Point">
    public Point (int x1, int x2){
        this.x = x1;
        this.y = x2;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Getters">
     public int getX (){
         return this.x;     
    }
     
     public int getY (){
         return this.y;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
     // </editor-fold>
     
}

