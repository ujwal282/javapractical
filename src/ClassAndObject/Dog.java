package ClassAndObject;
//Creating a class Dog with properties (name,age,color). Provide a separate functions
class DogMan {
    private String name;
    private int age;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printAll() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}

public class Dog {
    public static void main(String[] args) {
        DogMan myDog = new DogMan();
        myDog.setName("Buddy");
        myDog.setAge(5);
        myDog.setColor("Brown");
        myDog.printAll();
    }
}

