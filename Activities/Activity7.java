package Activities;
import java.util.Scanner;

public class Activity7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER EMAIL: ");
        String email = scn.nextLine();
        
        int atPoint = email.indexOf("@");

        String username = email.substring(0,atPoint);
        String domain = email.substring(atPoint +1);
        System.out.println(username);
        System.out.println(domain);

    }
}
