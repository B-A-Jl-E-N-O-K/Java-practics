package pract6.builder;

public class Main {
    public static void main(String[] args) {


        System.out.println("Builder: ");
        Builder[] builders = {new KiaBuilder(), new WolksBuilder()};
        for (Builder builder : builders) {
            Director director = new Director(builder);
            director.Construct();
            Car car = builder.GetResult();
            car.print();
        }
    }
}
