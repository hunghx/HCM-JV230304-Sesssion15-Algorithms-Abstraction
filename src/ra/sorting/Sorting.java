package ra.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

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

    public static <T extends Comparable<T>> void bubbleSort(T[] arr){
        // tối ưu thuật toán
        boolean isNext = true;

        for(int i=0; i< arr.length-1 && isNext; i++){ // duyệt đến phần tử gần cuối
            System.out.println("Vòng lặp i : "+i);
            isNext = false;
            for (int j = 0; j< arr.length-1-i; j++){
                System.out.println("\tvòng lặp j :"+j);
                if (arr[j].compareTo(arr[j+1]) > 0){
                    // đổi vị trí 2 phần tử
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isNext = true; // nếu như có sự đổi chỗ 2 phâ ử thì mảng vẫn cần được sắp xếp
                }
            }
        }

    }
    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator){
        // tối ưu thuật toán
        boolean isNext = true;

        for(int i=0; i< arr.length-1 && isNext; i++){ // duyệt đến phần tử gần cuối
            System.out.println("Vòng lặp i : "+i);
            isNext = false;
            for (int j = 0; j< arr.length-1-i; j++){
                System.out.println("\tvòng lặp j :"+j);
                if (comparator.compare(arr[j],arr[j+1]) > 0 ){
                    // đổi vị trí 2 phần tử
                    T temp = arr[j];
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
        String[] arr = {"hung", "anh", "nam"};
        Integer[] arrInt = {3,4,5,2,0,1};
        bubbleSort(arrInt);
        System.out.println(Arrays.toString(arrInt));
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));

        Person[] people = {new Person(1,"nam"),new Person(2,"hùng"),new Person(3,"khánh")};
        bubbleSort(people,(o1, o2) -> o2.getId()-o1.getId());
        System.out.println(Arrays.toString(people));
    }
}
