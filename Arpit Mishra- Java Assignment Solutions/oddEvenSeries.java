// Assignment 1
//14feb 2022

class oddEvenSeries {
    public static void main(String[] args) {

        System.out.print("\nEven Series: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");

            }
        }
        System.out.print("\nOdd Series: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }
        }
    }
}