package newJava1;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.function.Predicate;


public class PredicateTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Test Predicate");


        Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");

        Predicate<String> isMail = str -> pattern.matcher(str).matches();

        int isWorkin = 1;

        while (isWorkin == 1)
        {
            String src = sc.nextLine();
            if(isMail.test(src))
            {
                System.out.println("This is email adress: " + src);
            }
            else {
                System.out.println("This is NOT email adress: " + src);
            }

            System.out.println("Continue?");
            isWorkin = sc.nextInt();
            sc.nextLine();
        }




    }
/*
    public static boolean isMail(String str)
    {


        Matcher matcher = pattern.matcher(src);

        return matcher.matches();
    }*/
}
