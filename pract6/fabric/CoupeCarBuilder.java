package pract6.fabric;


public class CoupeCarBuilder implements CarBuilder {
    @Override
    public Car factoryMethod() {
        return new CoupeCar();
    }
}
