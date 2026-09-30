package Finals_Lesson;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        String password = "123"; 
        Scanner scn = new Scanner(System.in);

        System.out.println("PLEASE ENTER PASSWORD: ");
        String pInput = scn.nextLine();

        do { 
            if(!pInput.equals(password)){
                System.out.println("WRONG PASSWORD!");
            }
            else{
                System.out.println("ACCESS GRANTED!");
                break;
            }

            System.out.println("PLEASE ENTER PASSWORD: ");
            pInput = scn.nextLine();
        } 
        while (!pInput.equals(password));

        
    }
}
