package pract6.abstract_fabric;

public class Main {
    public static void main(String[] args) {

        System.out.println("Абстрактная фабрика: ");
        CarFactory[] factories = {new BmvFactory(), new ToyotaFactory()};
        for (CarFactory factory : factories) {
            Diler diler = new Diler(factory);
            diler.execute();
        }
    }
}


