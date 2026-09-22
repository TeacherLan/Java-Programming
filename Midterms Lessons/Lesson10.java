import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please Enter Age: ");
        int age = scn.nextInt();
        

        // System.out.println((age>=18)? (age>=21)? "You are 21 or older.": "You are between 18 and 20." :"You are a minor.");
        
        

        if (age >=18)
        {
            if(age>=21)
            {
                System.out.println("You are 21 or older.");
            }
            else
            {
                System.out.println("You are between 18 and 20.");
            }
        }

        else
        {
            System.out.println("You are a minor.");
        }


        /*
        System.out.println("ARE YOU A FILIPINO CITIZEN? (Y/N): ");
        char nationality = scn.next().charAt(0);
        System.out.println("PLEASE ENTER AGE: ");
        int age = scn.nextInt();

        if(age >= 18 && nationality == 'Y'){
            System.out.println("YOU CAN VOTE!!");
        }

        else if (age<=17 && nationality == 'Y'){
            System.out.println("YOU ARE UNDERAGE, YOU CAN'T VOTE!");
        }

        else if(age >=18 && nationality == 'N'){
            System.out.println("ALIEN!, YOU CAN'T VOTE!");
        } 
         
        scn.close();
        */


        /*    
        
        if(num1 >=0)
        {
            System.out.println(num1 + ": THIS IS A POSITIVE NUMBER");
        }

        else
        {
            System.out.println(num1 + ": THIS IS A NEGATIVE NUMBER");
        }
        scn.close();
        
        */

    }
}