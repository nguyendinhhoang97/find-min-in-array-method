public class FindMinInArray {

    public static int findMin(int array[]) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 23, 1, 21, 66, 10,
        41};
        int index = findMin(arr);
        System.out.println("The smallest element in array is " + arr[index]);
    }
}
