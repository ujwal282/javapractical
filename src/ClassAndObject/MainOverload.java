package ClassAndObject;
class Overload {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class MainOverload {
    public static void main(String[] args) {
        Overload overload = new Overload();
        int sum1 = overload.sum(1, 2);
        int sum2 = overload.sum(1, 2, 3);
        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
    }
}
