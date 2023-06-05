package pract8.comand;


class Stop implements Command {
    Car car;
    public Stop(Car car) {
        this.car = car;
    }
    public void execute() {
        car.stopEngine();
    }
}
