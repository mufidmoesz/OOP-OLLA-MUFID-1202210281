package MODUL3_MUFID;

public class Calculation implements Runnable {
    private double radius, side, area;
    private final double phi = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double getArea() {
        return area;
    }

    public double getPhi() {
        return phi;
    }

    public void setSquare(double side) 
    throws IllegalArgumentException {
        if (side < 1) {
            throw new IllegalArgumentException("Side must be greater than 1");
        }
        this.area = side*side;
    }
    public double getSquare() {
        return this.area;
    }

    public void setCircle(double radius)
    throws IllegalArgumentException {
        if (radius < 1) {
            throw new IllegalArgumentException("Radius must be greater than 1");
        }
        this.area = phi*radius*radius;
    }
    public double getCircle() {
        return this.area;
    }

    public void setTrapezoid(double a, double b, double t)
    throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
            throw new IllegalArgumentException("Side must be greater than 1");
        }
        this.area = (a+b)*t/2;
    }
    public double getTrapezoid() {
        return this.area;
    }

    @Override
    public void run() {
        System.out.println("Program will start in");
        for (int i = 3; i>0; i--) {
            try {
                System.out.println("Running with thread "+ i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
