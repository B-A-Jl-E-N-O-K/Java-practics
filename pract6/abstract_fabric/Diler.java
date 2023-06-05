package pract6.abstract_fabric;


public class Diler {
    private final SedanCar sedan;
    private final CoupeCar coupe;

    public Diler(CarFactory factory) {
        sedan = factory.createSedanCar();
        coupe = factory.createCoupeCar();
    }

    public void execute() {
        sedan.print();
        coupe.print();
    }
}
