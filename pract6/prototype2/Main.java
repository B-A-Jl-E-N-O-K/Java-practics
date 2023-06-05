package pract6.prototype2;

public class Main {

    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
        System.out.println("Клонирование выполнено");
    }
}
