package newJava2;
import java.util.Comparator;
public class HumanComparator implements Comparator<Human>{

    public int compare(Human a, Human b){

        if (a.getFirstName().charAt(1) > b.getFirstName().charAt(1)) return 1;
        else if (a.getFirstName().charAt(1) < b.getFirstName().charAt(1)) return -1;
        else return 0;
    }
}
