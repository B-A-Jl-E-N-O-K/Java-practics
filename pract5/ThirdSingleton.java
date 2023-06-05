package pract5;

public class ThirdSingleton {
    private static ThirdSingleton INSTANCE = null;
    private ThirdSingleton() {}

    public static synchronized ThirdSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThirdSingleton();
        }
        return INSTANCE;
    }
}
