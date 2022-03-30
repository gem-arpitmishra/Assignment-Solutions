//Assigment No. 2
// Sort an array in ascending order whose elements are in a range of -100 to 100

public class ArraySorting {
    public static void main(String[] args) {
        int[] intArray = new int[] { -99, -88, -73, -22, -22, 0, 10, 20, 30, 40, 50 };
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        for (int i : intArray) {
            System.out.print(i + " ");

        }
    }

}
