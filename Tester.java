package pract1;
import java.lang.*;
public class Tester{

    public static void main(String[] args) {
        System.out.println("Test task №1: Dogs");
        Dog pup1 = new Dog("MyPup", 2, "The best owner");
        Dog pup2 = new Dog("BabyPup", "Zavodchik");
        Dog pup3 = new Dog("Bob");
        Dog pup4 = new Dog();
        pup3.setAge(1);
        pup3.setOwner("good person");
        System.out.println(pup1.toString());
        System.out.println(pup1.dogAgeIntoHumanAge());

        System.out.println(pup2.toString());

        System.out.println(pup3.toString());

        System.out.println(pup4.toString());
        System.out.println(pup4.isPupHasHome());


        System.out.println("Test task №2: Balls");
        Ball ball1 = new Ball("blue", 2, "volleyball", true);
        Ball ball2 = new Ball("green", 5);
        Ball ball3 = new Ball("black");
        Ball ball4 = new Ball();

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
        System.out.println(ball4.toString());

        ball4.setColor("red");
        ball4.setPurpose("football");

        System.out.println(ball4.toString());


        System.out.println("Test task №3: Books");
        Book book1 = new Book("George", 200, 1900);
        Book book2 = new Book("Mark", 360);
        Book book3 = new Book(17);
        Book book4 = new Book();

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());

        book4.setAuthor("Tom");
        book4.setNumberOfPages(150);
        book4.setYearOfRelease(2015);

        System.out.println(book4.toString());

    }
}
