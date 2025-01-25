public class EvenNumberSum {
    public static void main(String[] args) {
        int sum = 0;
        int number = 2; 
        while (number <= 100) {
            sum += number; 
            number += 2;   
        }

        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}
