package Finals_Lesson;

import java.util.Scanner;

public class ArrayLesson {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];

        Scanner scn = new Scanner(System.in);
        

        for (int i =0; i<numbers.length; i++){
            System.out.print("ENTER A NUMBER FOR INDEX " + i + " :");    
            numbers[i] = scn.nextInt();
        }

        for (int i =0; i<numbers.length; i++){
            System.out.println("INDEX " +i + " = " + numbers[i]);
        }


    }
}
