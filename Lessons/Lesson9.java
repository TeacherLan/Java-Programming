
import java.util.Random;



public class Lesson9 {

    public static void main(String[] args) {
        int x = 9;
        double a = 2.5;
        int y = 8;
        int z = 25;
        
        Random rand = new Random();
        int random = rand.nextInt(1,100); 
        //int random = (int)(Math.Random()*100);


        //Math.max
        System.out.println(Math.max(x, Math.max(y, z)));

        //Math.min
        System.out.println(Math.min(x, y)); 

        //Math.sqrt
        System.out.println(Math.sqrt(y));

        //Math.abs
        System.out.println(Math.abs(x));

        //Math.pow
        System.out.println(Math.pow(9, 2));

        //Math.round
        System.out.println(Math.round(a));

        //Math.ceil
        System.out.println(Math.ceil(a));

        //Math.floor
        System.out.println(Math.floor(a));

        System.out.println(random);
    }
}

class BooleanLesson{
    public static void main(String[] args) {
        boolean isRaining = false;
        int x = 9;
        int y = 5;
        int z = 18;


       // System.out.println( "Is it raining? " + isRaining);
        System.out.println(x > y); //true
        System.out.println(x < y); // false
        System.out.println(x > y && y > x);
        System.out.println(x < y || y > x);
    }
}
