package Sorts;

public class HeapSort extends SortingAlg
{
    /// https://www.geeksforgeeks.org/dsa/heap-sort/

    // To heapify a subtree rooted with node i
    private void heapify(int[] arr, int n, int i) {

        // Initialize largest as root
        int largest = i;

        // left index = 2*i + 1
        int l = 2 * i + 1;

        // right index = 2*i + 2
        int r = 2 * i + 2;

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    // Main function to do heap sort
    public void sort(int[] list) {
        int n = list.length;

        // Build heap (rearrange vector)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {

            // Move current root to end
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;

            // Call max heapify on the reduced heap
            heapify(list, i, 0);
        }
    }

}
