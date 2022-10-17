
package prog21oop;

public class Point {
    
    int x;
    int y;
    
    public static void main(String[] args) {
        Point p = new Point();
        //Atribuiçao pelos atributos
        p.x = 1;
        p.y = 4;
        
        int pontoy = p.y;
        System.out.println("PontoY: "+pontoy);
        
        
    }
}
