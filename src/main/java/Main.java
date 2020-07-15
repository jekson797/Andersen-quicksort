import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] ints = {5, 18, 54, 82, 4, 32, 12, 45, 11};
        ints = quickSort.sort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
