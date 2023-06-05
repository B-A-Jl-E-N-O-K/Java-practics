package pract6.abstract_fabric;


public class ToyotaFactory implements CarFactory {
    @Override
    public SedanCar createSedanCar() {
        return new SedanCarToyota();
    }

    @Override
    public CoupeCar createCoupeCar() {
        return new CoupeCarToyota();
    }
}