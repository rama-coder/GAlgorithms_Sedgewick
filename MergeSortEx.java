/**
 * Created with IntelliJ IDEA.
 * User: RAMA KRISHNA LINGA
 * Date: 3/19/14
 * Time: 8:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortEx {


    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        isSorted(a, lo, mid);
        isSorted(a, mid+1, hi);

        for (int i = lo; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                a[k] = aux[j++];
            else if (j > hi)
                a[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];

        }
        assert isSorted(a, lo, hi);

    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        return true;
    }
    private static boolean less(Comparable i, Comparable j) {
        return true;
    }

    public static void main(String[] args) {

    }
}
