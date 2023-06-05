package pract7.composite;


class CoupeCar implements Car {
    @Override
    public void draw(String color) {
        System.out.println("Купе цвета: " + color);
    }
}
