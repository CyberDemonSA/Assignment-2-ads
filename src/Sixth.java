public class Sixth {
    public static void main(String[] args)
    {
        int[] a = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        int N = a.length;
        int star = (N / 2) - 1;

        for (int i = star; i >= 0; i--) {
            heapify(a, N, i);
        }
        for (int i = 0; i < N; ++i)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void heapify(int[] arr, int N, int i)
    {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && arr[l] > arr[largest])
            largest = l;

        if (r < N && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, N, largest);
        }
    }
}
