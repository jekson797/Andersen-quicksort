import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {

    public int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        } else {
            int pivotIndex = findSupportingElement(array.length);
            int[] lessThenPivot = getNumbersLessThenPivot(array, pivotIndex);
            int[] greaterThenPivot = getNumbersGreaterThenPivot(array, pivotIndex);
            int pivot = array[pivotIndex];
            return connectArrays(sort(lessThenPivot), sort(greaterThenPivot), pivot);
        }
    }

    private int findSupportingElement(int arrayLength) {
        return new Random().nextInt(arrayLength);
    }

    private int[] getNumbersLessThenPivot(int[] array, int pivot) {
        List<Integer> numbersLessThenPivot = new ArrayList<>();
        for (int number : array) {
            if (number < array[pivot]) {
                numbersLessThenPivot.add(number);
            }
        }
        int[] primitiveNumbersLessThenPivot = new int[numbersLessThenPivot.size()];
        for (int i = 0; i < numbersLessThenPivot.size(); i++) {
            primitiveNumbersLessThenPivot[i] = numbersLessThenPivot.get(i);
        }
        return primitiveNumbersLessThenPivot;
    }

    private int[] getNumbersGreaterThenPivot(int[] array, int pivot) {
        List<Integer> numbersGreaterThenPivot = new ArrayList<>();
        for (int number : array) {
            if (number > array[pivot]) {
                numbersGreaterThenPivot.add(number);
            }
        }
        int[] primitiveNumbersGreaterThenPivot = new int[numbersGreaterThenPivot.size()];
        for (int i = 0; i < numbersGreaterThenPivot.size(); i++) {
            primitiveNumbersGreaterThenPivot[i] = numbersGreaterThenPivot.get(i);
        }
        return primitiveNumbersGreaterThenPivot;
    }

    private int[] connectArrays(int[] lessThenPivot, int[] greaterThenPivot, int pivot) {
        int[] lessThenPivotAndPivot = ArrayUtils.addAll(lessThenPivot, pivot);
        return ArrayUtils.addAll(lessThenPivotAndPivot, greaterThenPivot);
    }
}
