package pract8.comand;


class Start implements Command {
    Car car;
    public Start(Car car) {
        this.car = car;
    }
    public void execute() {
        car.startEngine();
    }
}
