package newJava2;
import java.time.LocalDate;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

public class TestStream {
    public static void main(String[] args) {

        Human person1 = new Human("Vasiliy", "Vasilchuk", 42, LocalDate.of(1974, 12, 3), 96);
        Human person2 = new Human("Maksim", "Maksimov", 15, LocalDate.of(2005, 3, 15), 72);
        Human person3 = new Human("Rosa", "Tsvetkova", 27, LocalDate.of(1997, 5, 18), 63);
        Human person4 = new Human("Killian", "Rudi", 12, LocalDate.of(2010, 1, 1), 32);
        Human person5 = new Human("Nick", "Black", 35, LocalDate.of(1832, 6, 27), 50);
        List<Human> people = new ArrayList<>(List.of(person1, person2, person3, person4, person5));


        Stream<Human> stream1 = people.stream();
        System.out.println("1 задача: Сортировка по второй букве имени в обратном порядке");
        stream1.sorted(new HumanComparator().reversed()).forEach(a->System.out.println(a.toString()));

        Stream<Human> stream2 = people.stream();
        System.out.println("Second task: фильтрация по весу больше, чем 60");
        stream2.filter(a->a.getWeight()>60).forEach(a->System.out.println(a.toString()));

        Stream<Human> stream3 = people.stream();
        System.out.println("Third task: сортировка по возрасту");
        stream3.sorted(Comparator.comparingInt(Human::getAge)).forEach(a->System.out.println(a.toString()));

        Stream<Human> stream4 = people.stream();
        System.out.println("Fourth task: произведение всех возрастов");
        Optional<Integer> sum = stream4.map(a->a.getAge()).reduce((a,b) -> a*b);
        System.out.println("AgesxAges: " + sum.get());


    }
}
