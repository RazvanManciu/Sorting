public class MyBubbleSort {

    public static void sort(int[] a) {
        boolean isSorted = false;
        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int aux = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = aux;
                    isSorted = false;
                }
            }
            ArrayUtils.show(a);
        }
    }


    public static void main(String[] args) {
        int[] a = new int[]{6, 8, 1, 2, 4, 5, 7, 3};  //defining the array "a"
        ArrayUtils.show(a);  // calling "show" method from ArrayUtils class
        sort(a);
        ArrayUtils.show(a);
    }
}