package pract6.prototype1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Prototype: ");
        SimpleCloneable original = new SimpleCloneable();
        SimpleCloneable[] arr = new SimpleCloneable[5];
        for (int i = 0; i < 5; i++) {
            try {
                arr[i] = original.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            arr[i].print();
        }
    }
}
