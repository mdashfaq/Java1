import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int p = 1;
        while (p<=10){
            System.out.println(p);
            p++;
        }

        int q = 1;
        do {
            System.out.println(q);
            q++;}
         while (q<=10);


         int r = 0;
         for (r=0; r<=15; r++){
             System.out.println("r = " + r);
         }
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("What is your age?");
        Integer userAge = scanner.nextInt();
        int year = LocalDate.now().minusYears(userAge).getYear();
        System.out.println("You were born in " +   year);
    }
}