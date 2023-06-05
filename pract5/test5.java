package pract5;

public class test5 {
    public static void main(String[] args) {

        FirstSingleton singleton_1 = FirstSingleton.getInstance();
        FirstSingleton singleton_1_2 = FirstSingleton.getInstance();

        SecondSingleton singleton_2 = SecondSingleton.getInstance();
        SecondSingleton singleton_2_2 = SecondSingleton.INSTANCE;

        ThirdSingleton singleton_3 = ThirdSingleton.getInstance();
        ThirdSingleton singleton_3_3 = ThirdSingleton.getInstance();

        System.out.print("FirstSingleton hash: ");
        System.out.print(singleton_1.hashCode() + " ");
        System.out.println(singleton_1_2.hashCode());

        System.out.print("Singleton2 hash: ");
        System.out.print(singleton_2.hashCode() + " ");
        System.out.println(singleton_2_2.hashCode());

        System.out.print("Singleton3 hash: ");
        System.out.print(singleton_3.hashCode() + " ");
        System.out.println(singleton_3_3.hashCode() + " ");
    }

}
