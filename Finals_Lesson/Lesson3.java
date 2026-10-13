package Finals_Lesson;

public class Lesson3 {
    public static void main(String[] args) {
        
        // String[] cars = {
        //     "BMW", //0
        //     "Volvo", //1
        //     "Jeep", //2
        //     "BYD" //3
        // } ;

        // cars[2] = "Honda";

        // System.out.println(cars[2]);
        // System.out.println(cars.length);

        //for loop
        // for (int i = 0; i < cars.length; i++) {
        //     System.out.println(cars[i]);
        // }

        //for each 
        // for(String jace: cars){
        //     System.out.println(jace);
        // }
        
        //sum of numbers
        // int[] numbers = { 10, 20, 30, 40, 50 };
        // int sum = 0;

        // for(int i = 0 ; i< 5; i++){
        //     sum  += numbers[i];
        // }

        // System.out.println("SUM OF ALL NUMBERS: " + sum);

        // int[] scores =
        // {
        //     85, 92, 76, 95, 88,
        //     79, 90, 84, 91, 87
        // };

        // int highest =0;
        // int lowest = scores[0];
        // for(int i =0; i<scores.length; i++){
        //     if(scores[i] > highest){
        //         highest=scores[i];
        //     }
        // }
        // System.out.println(highest);
    
        // for(int i =0; i<scores.length; i++){
        //     if(scores[i] > lowest){
        //         highest=scores[i];
        //     }
        // }
        // System.out.println(lowest);

        int[] numbers =
        {
            12, 7, 25, 40,
            18, 33, 50, 61
        };

        System.out.println("EVEN NUMBERS: ");

        for(int i =0; i<numbers.length; i++){
            if(numbers[i] %2 == 0){
                System.out.print(numbers[i] + ", ") ;
            }
        }
        System.out.println();

                System.out.println("ODD NUMBERS: ");

        for(int i =0; i<numbers.length; i++){
            if(numbers[i] %2 == 1){
                System.out.print(numbers[i] + ", ");
            }
        }

    }
}
