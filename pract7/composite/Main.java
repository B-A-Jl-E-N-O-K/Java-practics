package pract7.composite;


public class Main {
    public static void main(String[] args) {
        Car sport = new SportCar();
        Car sedan = new SedanCar();
        Drawing drawing = new Drawing();
        drawing.add(sport);
        drawing.add(sedan);
        drawing.draw("красный");
        drawing.clear();
        drawing.add(sport);
        drawing.add(sedan);
        drawing.draw("желтый");
    }
}
