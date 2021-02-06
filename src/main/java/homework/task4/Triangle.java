package homework.task4;

public class Triangle extends Shape{
    private  final double AB, BC , AC;

    protected Triangle(Point A, Point B, Point C) {
        super(new Point[]  {
               new Point(A.x,A.y),
                new Point(B.x,B.y),
                new Point(C.x, C.y)});
        this.AB = countDistance(A, B);
        this.BC = countDistance(B, C);
        this.AC = countDistance(A, C);

    }
    //metoda która wyliczy strony trójkota na podstawie zdefiniowanych punktów
    private double countDistance(Point A, Point B){
        return Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
    }


    @Override
    double area() {
        double p = (AB+BC+AC)/2;
        return Math.sqrt((p*(p-AB)*(p-BC)*(p-AC)));
    }
}
