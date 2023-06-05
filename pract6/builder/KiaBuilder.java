package pract6.builder;


public class KiaBuilder implements Builder {
    Car car = new Car();

    @Override
    public void BuildEngine() {
        car.buildEngine("Киа двигатель");
    }

    @Override
    public void SetDirector() {
        car.setDirector("Киа");
    }

    @Override
    public Car GetResult() {
        return car;
    }
}
