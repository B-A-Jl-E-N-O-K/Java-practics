package pract6.abstract_fabric;


public class BmvFactory implements CarFactory {
    @Override
    public SedanCar createSedanCar() {
        return new SedanCarBmv();
    }

    @Override
    public CoupeCar createCoupeCar() {
        return new CoupeCarBmv();
    }
}
