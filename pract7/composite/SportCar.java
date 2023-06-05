package pract7.composite;


class SportCar implements Car {
    @Override
    public void draw(String color) {
        System.out.println("Спорткар цвета: " + color);
    }
}
