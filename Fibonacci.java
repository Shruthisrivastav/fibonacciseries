public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms in Fibonacci series
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series up to 10 numbers:");
        
        // Print the first 10 numbers of the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            // Update the values for next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

