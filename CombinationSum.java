import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] arr, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(result, combination, arr, targetSum, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> combination, int[] arr, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
        } else if (target > 0) {
            for (int i = start; i < arr.length; i++) {
                combination.add(arr[i]);
                backtrack(result, combination, arr, target - arr[i], i);
                combination.remove(combination.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int targetSum = 8;
        List<List<Integer>> combinations = combinationSum(arr, targetSum);

        if (combinations.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (List<Integer> combination : combinations) {
                System.out.println(combination);
            }
        }
    }
}