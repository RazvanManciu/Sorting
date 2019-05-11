public class MyMergeSort {
    public static void merge(int[] a, int l, int m, int r) {
        int sizeL = m - l + 1;
        int sizeR = r - m;
        int[] valuesL = new int[sizeL];  //defining arrays
        int[] valuesR = new int[sizeR];  //
        for (int i = 0; i < sizeL; i++) {
            valuesL[i] = a[i + l];
        }
        for (int i = 0; i < sizeR; i++) {
            valuesR[i] = a[i + m + 1];
        }
        int k = l;
        int i = 0;
        int j = 0;
        while (i < sizeL && j < sizeR) {
            if (valuesL[i] < valuesR[j]) {
                a[k] = valuesL[i];
                i++;
            } else {
                a[k] = valuesR[j];
                j++;
            }
            k++;
        }
        while (i < sizeL) {
            a[k] = valuesL[i];
            k++;
            i++;
        }
        while (j < sizeR) {
            a[k] = valuesR[j];
            k++;
            j++;
        }
    }

    public static void sort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(a, l, m);
            sort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{6, 8, 1, 2, 4, 5, 7, 3};  //defining the array "a"
        ArrayUtils.show(a);  // calling "show" method from ArrayUtils class
        sort(a, 0, a.length-1);
        ArrayUtils.show(a);
    }
}
