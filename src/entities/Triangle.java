package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    // metodo
    // parmetros dentro ()
    // metodo
    public  double area () {
        double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));

        // outra forma de fazer
        // double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        //return result;

    }
}