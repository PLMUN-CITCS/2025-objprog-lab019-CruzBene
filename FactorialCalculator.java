import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        int p = getNonNegativeIntegerNumber();
        long a =calculateFactorial(p);

        System.out.println("The factorial of " + p + " is: " + a);
    }
    public static int getNonNegativeIntegerNumber(){
        Scanner scan = new Scanner(System.in);
        int num = -1;

        while (num < 0){
        System.out.print("Enter Non-negative integer: ");
        if(scan.hasNextInt()){
            num = scan.nextInt();
            if (num < 0){
                System.out.println("Error: Please enter a non-negative integer.");
            }
           
        }else {
            System.out.println("Error: Invalid input. Please enter a valid integer.");
            scan.next();    
        }
        
      } 
      return num;
     
    }
    public static long calculateFactorial(int n){
        if (n == 0){
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n ;i++){
            factorial *= i;
        }
        return factorial;
    }

}
