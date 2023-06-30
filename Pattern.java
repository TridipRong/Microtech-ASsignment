import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        int numSpaces = n - 1; // Initialize the number of spaces in each row
        int numAlphabets = 1; // Initialize the number of alphabets in each row

        for (int i = 0; i < n; i++) {
            // Loop for each row
            
            // Print the required number of spaces before the alphabets
            for (int j = 0; j < numSpaces; j++) {
                System.out.print("  ");
            }

            // Print the alphabets in increasing order
            for (int j = 0; j < numAlphabets; j++) {
                char alphabet = (char) ('A' + i - j); // Calculate the alphabet to be printed
                System.out.print(alphabet + " ");
            }

            // Print the alphabets in decreasing order, excluding the middle one
            for (int j = numAlphabets - 2; j >= 0; j--) {
                char alphabet = (char) ('A' + i - j); // Calculate the alphabet to be printed
                System.out.print(alphabet + " ");
            }

            System.out.println(); // Move to the next line after printing each row
            numSpaces--; // Decrease the number of spaces for the next row
            numAlphabets++; // Increase the number of alphabets for the next row
        }
    }
}
