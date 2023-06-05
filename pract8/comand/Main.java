package pract8.comand;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Start startCar = new Start(car);
        Stop stopCar = new Stop(car);
        Executer carInvoker = new Executer(stopCar);
        carInvoker.execute();
    }
}
