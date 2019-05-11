public class MyQuickSort {
    public static void sort(int[] a, int l, int r) {
        int pivot = a[(l + r) / 2];
        int i = l;
        int j = r;
        while (a[i] < pivot) {
            i++;
        }
        while (a[j] > pivot) {
            j--;
        }
        if (i < j) {
            int aux = a[i];
            a[i] = a[j];
            a[j] = aux;
        }
        i++;
        j--;
        if(i < r){
            sort(a, i ,r);
        }
        if (j > l) {
            sort(a, l, j);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{6, 8, 1, 2, 4, 5, 7, 3};  //defining the array "a"
        ArrayUtils.show(a);  // calling "show" method from ArrayUtils class
        sort(a, 0, a.length - 1);
        ArrayUtils.show(a);
    }
}






