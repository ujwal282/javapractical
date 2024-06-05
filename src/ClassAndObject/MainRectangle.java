package ClassAndObject;

class Rectangle {
    private double length;
    private double breadth;

    public void setData(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double computeArea() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("Area: " + computeArea());
    }
}

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect1.setData(5.0, 3.0);
        rect2.setData(7.0, 4.0);

        double area1 = rect1.computeArea();
        double area2 = rect2.computeArea();

        System.out.println("Area of first rectangle: " + area1);
        System.out.println("Area of second rectangle: " + area2);

        if(area1 > area2) {
            System.out.println("First rectangle has a larger area.");
        } else if(area2 > area1) {
            System.out.println("Second rectangle has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}

