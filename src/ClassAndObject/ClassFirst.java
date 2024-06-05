package ClassAndObject;

class AddDemo {
    int Add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

public class ClassFirst {
    public static void main(String[] args) {
        AddDemo Obj = new AddDemo();
        int result = Obj.Add(12, 13);
        System.out.println("Sum: " + result);
    }
}
