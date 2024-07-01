package ra.searching;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // có mảng
        int[] array = {1,3,5,7,9,2,4,6,8,10};
        // tìm kiếm tuyến tính
        LinearSearch linearSearch = new LinearSearch();
        int index = linearSearch.linearSearch(array, 50);
        System.out.println("index "+ index);

        // tìm kiếm nhị phân
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        BinarySearch binarySearch
                 = new BinarySearch();
        int index2 = binarySearch.binarySearch(array,7);
        System.out.println("index 2 "+index2);
    }
}
