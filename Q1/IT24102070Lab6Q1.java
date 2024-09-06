import java.util.Scanner; 
 
public class IT24102070Lab6Q1 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        double num = sc.nextDouble(); 

        double square = num * num; 
        System.out.println("Square of " + num + " is: " + square); 
 
        double squareRoot = Math.sqrt(num); 
        System.out.println("Square root of " + num + " is: " + squareRoot); 
    } 
}