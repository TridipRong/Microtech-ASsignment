import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] arr, int targetSum) {
        List<List<Integer>> result = new ArrayList<>(); // List to store combinations
        List<Integer> combination = new ArrayList<>(); // Current combination being built
        Arrays.sort(arr); // Sort the input array in ascending order
        backtrack(result, combination, arr, targetSum, 0); // Call the helper function
        return result; // Return the list of combinations
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> combination, int[] arr, int target, int start) {
        if (target == 0) {
            // If target sum becomes zero, add the combination to the result list
            result.add(new ArrayList<>(combination));
        } else if (target > 0) {
            // If target sum is still positive, continue building combinations
            for (int i = start; i < arr.length; i++) {
                combination.add(arr[i]); // Add current element to the combination
                backtrack(result, combination, arr, target - arr[i], i); // Recursively call with updated target and start index
                combination.remove(combination.size() - 1); // Remove last element for backtracking
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int targetSum = 8;
        List<List<Integer>> combinations = combinationSum(arr, targetSum);

        if (combinations.isEmpty()) {
            System.out.println("Empty"); // No combinations found
        } else {
            for (List<Integer> combination : combinations) {
                System.out.println(combination); // Print each combination
            }
        }
    }
}
