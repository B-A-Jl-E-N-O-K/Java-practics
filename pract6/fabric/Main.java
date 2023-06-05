package pract6.fabric;


public class Main {
    public static void main(String[] args) {
        System.out.println("Фабрика: ");
        CarBuilder[] factories = { new CoupeCarBuilder(), new SedanCarBuilder() };
        for (CarBuilder factory : factories) {
            Car car = factory.factoryMethod();
            car.print();
        }
    }
}
