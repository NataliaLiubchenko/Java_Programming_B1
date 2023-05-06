package day39_a_polymorphism.car;

public class Car {

}
class BMW extends Car{
    @Override
    public String toString(){
        return "BMW";
    }


}
class Tesla extends Car{
    @Override
    public String toString(){
        return "Tesla";
    }

}
class Toyota extends Car{
    @Override
    public String toString(){
        return "Toyota";
    }
}
class Ford extends Car{
    @Override
    public String toString(){
        return "Ford";
    }
}
class Landrover extends Car{
    @Override
    public String toString(){
        return "Landrover";
    }
}
class Dealership{
    public static void lease(int i){
        System.out.println("Leasing a car: "+getCar(i));

    }
    public static void lease(Car car){
        System.out.println("Leasing a car: "+car.getClass().getName());

    }
    public static Car getCar(int option){
        switch (option){
            case 1:
                return new Tesla();

            case 2:
                return new Landrover();

            case 3:
                return new Toyota();

            case 4:
                return new BMW();

            default:
                return new Car();
        }

    }
}
//runner2 class
class Runner{
    public static void main(String[] args) {
        Car car = new Car();
        Dealership.lease(1);
        Dealership.lease(car);
        Tesla tesla = new Tesla();
        Dealership.lease(2);
        Dealership.lease(tesla);
        Dealership.lease(new Landrover());
        Dealership.lease(new Toyota());
        Dealership.lease(new Ford());




    }
}
