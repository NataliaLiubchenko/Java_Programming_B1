package day36_inheritance.shapes;

public class Shape {
    String name;

    public Shape(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape name: " + name;
    }

    public double are(){
        return 0.0;
    }

    public double perimeter(){
        return  0.0;
    }
}
