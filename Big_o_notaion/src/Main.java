public class Main {

    //O(1) - Constant Time Complexity;
    //An algorithm with constant time complexity takes the same amount of time to run regardless of the input size. Here's an example of an algorithm with O(1) time complexity:
    //This algorithm simply prints the first element of an array. It doesn't matter how large the array is - it will always take the same amount of time to run.
    
    public void printFirstElement(int[] array) {
        System.out.println(array[0]);
    }

    //O(n) - Linear Time Complexity;
    //An algorithm with linear time complexity takes time proportional to the input size. Here's an example of an algorithm with O(n) time complexity:
    //This algorithm prints all the elements of an array. It takes time proportional to the length of the array - the more elements in the array, the longer it will take to run.
    
    public void printAllElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //O(n^2) - Quadratic Time Complexity;
    //An algorithm with quadratic time complexity takes time proportional to the square of the input size. Here's an example of an algorithm with O(n^2) time complexity:
    //This algorithm prints all pairs of elements in an array. It takes time proportional to the square of the length of the array - the more elements in the array, the longer it will take to run, and the longer it will take for nested loops to finish.

    public void printAllPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }


}
