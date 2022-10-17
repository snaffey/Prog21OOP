
package prog21oop;

public class Point2 {
    
    int x;
    int y;
    //Construtore por omissão
    public Point2(){
        
        this.x = 10;
        this.y = 0;
    }
    //Construtore por atribuição
    public Point2(int v_x){
        
        this.x = v_x;
        this.y = 0;
    }
    //Construtore por atribuição
    public Point2(int v_x, int v_y){
        
        this.x = v_x;
        this.y = v_y;
    }
    public static void main(String[] args) {
        Point2 p = new Point2();
        //System.out.println("PontoX: "+p.x);
        Point2 p1 = new Point2(40);
        //System.out.println("PontoX: "+p1.x);
        Point2 p2 = new Point2(50,25);
        System.out.println("PontoX: "+p2.x);
        
        
    }
}
