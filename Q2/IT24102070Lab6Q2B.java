import java.util.Scanner; 
 
public class IT24102070Lab6Q2B { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
         
        int[] numbers = new int[10]; 
        System.out.println("Please enter 10 numbers:"); 
         
        for (int i = 0; i < numbers.length; i++) { 
            System.out.print("Number " + (i + 1) + ": "); 
            numbers[i] = scanner.nextInt(); 
        } 
                
        System.out.println("\nThe numbers you entered are:"); 
        for (int i = 0; i < numbers.length; i++) { 
            System.out.print(numbers[i] + " "); 
        } 
    } 
}