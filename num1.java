import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 6, 7, 3, 5, 7, 3};
        ArrayList<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                if (!duplicates.contains(num)) {
                    duplicates.add(num);
                }
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}

