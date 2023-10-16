import java.util.Random;

class ArrayShuffiling {
    public static void main(String args[]) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        shuffelArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void shuffelArray(int[] arr) {
        Random random = new Random();
        for (int i = arr.length - 1; i >= 0; i--) {
            int j = random.nextInt(i + 1);

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}