

public class Pattern  {
    public static void main(String[] args) {
		
        int n = 5;
        int numSpaces = n - 1;
        int numAlphabets = 1;

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < numSpaces; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < numAlphabets; j++) {
                char alphabet = (char) ('A' + i - j);
                System.out.print(alphabet + " ");
            }

            for (int j = numAlphabets - 2; j >= 0; j--) {
                char alphabet = (char) ('A' + i - j);
                System.out.print(alphabet + " ");
            }

            System.out.println();
            numSpaces--;
            numAlphabets++;
        }
    }
}