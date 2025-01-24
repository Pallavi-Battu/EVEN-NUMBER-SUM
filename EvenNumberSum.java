public class EvenNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        int number = 2; // Start with the first even number

        // Use a while loop to sum even numbers between 1 and 100
        while (number <= 100) {
            sum += number; // Add the even number to sum
            number += 2;   // Move to the next even number
        }

        // Display the result
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}
