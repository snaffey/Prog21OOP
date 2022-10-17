
package prog21oop;

public class Point1 {
    
    int x = 10;
    int y;
    
    public static void main(String[] args) {
        Point1 p = new Point1();
        //Atribuiçao pelos atributos
        p.y = 4;
        p.x = 12;
        int pontoy = p.y;
        System.out.println("PontoY: "+p.x);
        
        
    }
}
