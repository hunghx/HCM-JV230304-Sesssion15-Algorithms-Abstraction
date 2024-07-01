package ra.sorting;

import java.util.Arrays;

public class Sorting {
    // thuật toán sắp xêp nổi bọt
    public static void bubbleSort(int[] arr){
        // tối ưu thuật toán
        boolean isNext = true;

        for(int i=0; i< arr.length-1 && isNext; i++){ // duyệt đến phần tử gần cuối
            System.out.println("Vòng lặp i : "+i);
            isNext = false;
            for (int j = 0; j< arr.length-1-i; j++){
                System.out.println("\tvòng lặp j :"+j);
                if (arr[j] > arr[j+1]){
                    // đổi vị trí 2 phần tử
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isNext = true; // nếu như có sự đổi chỗ 2 phâ ử thì mảng vẫn cần được sắp xếp
                }
            }
        }
    }

    // Thuat toán sắp xếp chọn
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i++) {
            // giả sử giá trị min là pần tử đầu tiên của mảng cần duyệt
            int minValue = arr[i];
            int indexMin = i;
            for(int j = i +1; j< arr.length; j++){ // tìm phần tử nho nhất trong mảng
                if (arr[j] < minValue){
                    minValue = arr[j];
                    indexMin = j;
                }
            }
            // đổi chỗ với phần tử đầu tiên nếu như vị trí khác vị trí đầu tiên
            if (indexMin != i){
                arr[indexMin] = arr[i];
                arr[i] = minValue;
            }
        }

    }


    // Sắp xếp chèn
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length  ; i++) {
            System.out.println("Vòng lặp i :" +i +" Giá trị curent : " +arr[i] );
            int currentValue = arr[i];
            int indexInsert = i;
            for (int k = i-1 ; k >= 0 && currentValue < arr[k]; k--){
                System.out.println("So sách 2 giá trị "+currentValue +" và "+arr[k]);
                arr[k+1] = arr[k];
                indexInsert = k;
                System.out.println("Mảng sau khi dịch phần tử "+Arrays.toString(arr));
                System.out.println("Vị trí cần chèn "+indexInsert);
            }
            arr[indexInsert] = currentValue;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,9,3,8,5,2,7};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
