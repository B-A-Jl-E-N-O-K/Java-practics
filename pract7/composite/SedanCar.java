package pract7.composite;


class SedanCar implements Car {
    @Override
    public void draw(String color) {
        System.out.println("Седан цвета: " + color);
    }
}
