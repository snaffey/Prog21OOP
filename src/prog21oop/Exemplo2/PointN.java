package prog21oop.Exemplo2;

public class PointN {
    final int y = 1;
    int x;

    public PointN() {
        this.x = 10;
    }

    // Não altera porque é constante
    /*
     * void setY(int y) {
     * this.y = y;
     * }
     */
    /*
     * public static void main(String[] args) {
     * PointN p = new PointN();
     * p.y = 12;
     * System.out.println("x = " + p.x + " y = " + p.y);
     * }
     */
}
