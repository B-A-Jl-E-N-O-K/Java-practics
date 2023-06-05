package pract5;

public class FirstSingleton {
    private static final FirstSingleton INSTANCE = new FirstSingleton();

    private FirstSingleton() {}

    public static FirstSingleton getInstance() {
        return INSTANCE;
    }
}
