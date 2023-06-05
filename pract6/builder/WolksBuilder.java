package pract6.builder;


public class WolksBuilder implements Builder {
    Car car = new Car();

    @Override
    public void BuildEngine() {
        car.buildEngine("Фольксваген двигатель");
    }

    @Override
    public void SetDirector() {
        car.setDirector("Фольксваген");
    }

    @Override
    public Car GetResult() {
        return car;
    }
}
