package sortings;

/**
 * Created by Vatsal on 27/08/16.
 */
public class HeapSort {

    public int[] sort(int arr[]) {

        int length = arr.length;
        for (int i = length / 2 - 1; i >= 0; i--)
            heapify(arr, length, i);

        for (int i = length - 1; i >= 0; i--) {

            arr[0] = arr[0] + arr[i];
            arr[i] = arr[0] - arr[i];
            arr[0] = arr[0] - arr[i];

            heapify(arr, i, 0);
        }
        return arr;
    }

    private void heapify(int[] arr, int length, int i) {

        int largest = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;

        if (leftIndex < length && arr[leftIndex] > arr[largest])
            largest = leftIndex;
        if (rightIndex < length && arr[rightIndex] > arr[largest])
            largest = rightIndex;

        if (largest != i) {
            arr[i] = arr[i] + arr[largest];
            arr[largest] = arr[i] - arr[largest];
            arr[i] = arr[i] - arr[largest];

            heapify(arr, length, largest);

        }
    }

}
