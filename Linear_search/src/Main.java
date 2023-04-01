public class Main {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // return index of the key if found
            }
        }
        return -1; // return -1 if key is not found
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 9, 1, 4, 6};
        int key = 4;
        int index = linearSearch(arr, key);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found.");
        }
    }
}