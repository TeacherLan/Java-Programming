
public class Lesson7 {
    // public static void main(String[] args) {

    //     //widening Cast (Smaller to bigger data type)
    //         int age = 9; 
    //         double studentAge = age; 
    //         System.out.println(myInt);  // prints 9 that is a integer
    //         System.out.println(myShort);   // prints 9.0 that is a double
    // }

    //public static void main(String[] args) {
        //Arithmetic Operators


        // System.out.println("Addition " + (x + y)); //addition
        // System.out.println("Subtraction " + (x - y)); //subtraction
        // System.out.println("Division " + (x / y)); //division
        // System.out.println("Multiplication " + (x * y)); //multiplication
        // System.out.println("Remainder " + (9 % y)); //modulus

        // System.out.println("Increment " + ++x);
        // System.out.println("Increment " + x++);
        // System.out.println("Decrement " + --y);
        // System.out.println("Decrement " + y--);

        //Assignment Operators
        // System.out.println(x+=y); //x+y
        // System.out.println(x-=y); //x-y
        // System.out.println(x/=y); //x/y
        // System.out.println(x*=y); //x*y
        // System.out.println(x%=y); //x%y

        //Comparison Operators
       

        //  System.out.println(x == y); // result false
        //  System.out.println(x>y);   // result true
        //  System.out.println(x<y);   // result false
        //  System.out.println(x>=y);  // result true
        //  System.out.println(x<=y);  // result false 
        //  System.out.println(x!=y);  // result true
        // int x = 8;
        // int y = 2;

        // System.out.println(x == 8 && y ==2); // true
        // System.out.println(x >2 || x < y); //true
        // System.out.println(!(x>y)); //false
    //}   

}

// class Narrowing{
//     public static void main(String[] args) {
//         //Narrowing
//         double myDouble = 9.78d;
//         int myInt = (int)myDouble;

//         System.out.println(myDouble); //result is = 9.78
//         System.out.println(myInt);  //result is = 9
//      }
// }

class Payroll{
    public static void main(String[] args) {
        String employeeName = "Juan Dela Cruz";
        double dailyRate = 875.50;
        int daysWorked = 22;
        int monthlyAllowance = 1500;

        double grossPay = ((dailyRate * daysWorked) + monthlyAllowance);
        double tax = grossPay * 0.10;
        double netPay = grossPay - tax;
        int wholeSalary = (int)netPay;
        
        System.out.println("NAME: " + employeeName);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Tax: " + tax);
        System.out.println("Net Pay: " + netPay);
        System.out.println("Whole Number: " + wholeSalary);
        System.out.println("Eligible For Bonus? " + (netPay > 15000));
    }

}
