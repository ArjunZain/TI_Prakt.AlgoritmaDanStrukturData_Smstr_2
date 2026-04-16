package JobSheet5;

public class SortingMain {
    public static void main(String[] args) {

        int a[] = {34, 7, 23, 32, 5, 62};
        Sorting dataurut1 = new Sorting(a, a.length);
        dataurut1.bubbleSort();
        dataurut1.tampil();

        int b[] = {34, 7, 23, 32, 5, 62};
        Sorting dataurut2 = new Sorting(b, b.length);
        dataurut2.selectionSort();
        dataurut2.tampil();

        int c[] = {34, 7, 23, 32, 5, 62};
        Sorting dataurut3 = new Sorting(c, c.length);
        dataurut3.insertionSort();
        dataurut3.tampil();
    }
}