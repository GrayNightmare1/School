//By Jacob Murray jacobmurray@malad.us
//For CTE software development 1
//Instructor Mr Gross
public class BubbleSort {
    //This function swaps two out-of-order elements in an array
    public static int[] swapTwoArrayElements(int[] arrayToSort, int lowerIndex) {
        int temp = arrayToSort[lowerIndex];
        arrayToSort[lowerIndex] = arrayToSort[lowerIndex + 1];
        arrayToSort[lowerIndex + 1] = temp;
        return arrayToSort;
    }
    //This will create an array, print it unsorted, sort it, and then print it sorted
    public static void main(String[] args) {
        int[] arrayToSort = {7, 8, 15, 2, 44, 1, 102, 19, 10, 5, 2, 60, 32, 6, 12, 8};
        System.out.println("Unsorted Array: ");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
        System.out.println();
        checkTwoArrayElements(arrayToSort);
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        }
    }
    //This function checks two elements in an array and swaps them if they are out of order. It will continue to check the array until it is sorted.
    public static void checkTwoArrayElements(int[] arrayToSort) {
        int runLength = arrayToSort.length - 1;
        boolean swapped = false;
        while (!swapped) {
            swapped = true;
            for (int lowerIndex = 0; lowerIndex < runLength; lowerIndex++) {
                if (arrayToSort[lowerIndex] > arrayToSort[lowerIndex + 1]) {
                    swapTwoArrayElements(arrayToSort, lowerIndex);
                    swapped = false;
                }
            }
            runLength--;
        }
    }
}