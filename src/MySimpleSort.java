public class MySimpleSort {
    public static void sort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i; //valoarea minima din aray este la pozitia lui i
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {   //
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                int aux = a[i];
                a[i] = a[minIndex];
                a[minIndex] = aux;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{6,8,1,2,4,5,7,3};  //defining the array "a"
        ArrayUtils.show(a);  // calling "show" method from ArrayUtils class
        sort(a);
        ArrayUtils.show(a);
    }
}
