package buildquadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.sqrt(getDiscriminant())) / 2 * a;
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.sqrt(getDiscriminant())) / 2 * a;
        return r2;
    }

    public void check() {
        if (getDiscriminant() > 0) {
            System.out.println("The equation has two roots " + getRoot1() + " and " + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("The equation has one root " + getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}