package finderror;

import java.util.Scanner;

/**
 * Find and repair the following 3 errors:
 * 1) It doesn't print days in week at all
 * 2) Explain, why week[0] doesn't print "Monday"
 * 3) Never prints "SUCCESS!"
 * @author Kokes
 */
public class FindError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"};
        
        
        for (int i=0; i<7; i++){
            System.out.println(week[i]);
        }
        
        System.out.println("------------------------------------------------");
        String pattern;
        Scanner scanner = new Scanner(System.in);
        pattern = scanner.nextLine(); // input from keyboard
        for (int i=0; i<7; i++) {
            if (pattern.equals(week[i])){
                System.out.println("SUCCESS!");
                System.out.println(i);
                System.exit(0);  // exit the application
            }
        }
        System.out.println("NOT FOUND");
    }
}