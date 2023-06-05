package pract6.fabric;


public class SedanCarBuilder implements CarBuilder {
    @Override
    public Car factoryMethod() {
        return new SedanCar();
    }
}