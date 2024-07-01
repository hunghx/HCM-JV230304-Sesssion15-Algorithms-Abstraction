package ra.searching;

public class BinarySearch {
    public int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        // khi mà start < = end vẫn thực hiện tìm kiếm
        while (start <= end) {
            // giải thuật tìm kiếm nhị phân
            int mid = start + (end - start) / 2; // ko bị tràn giá trị
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public int binarySearchRecursive(int[] arr, int value, int start, int end) {
        if (start <= end) {
            // giải thuật tìm kiếm nhị phân
            int mid = start + (end - start) / 2; // ko bị tràn giá trị
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                // mangr been tay trais
                return binarySearchRecursive(arr, value, start, mid - 1);
            }
            return binarySearchRecursive(arr, value, mid + 1, end);
        }
        return -1;
    }
}
