package ra.searching;

public class LinearSearch {
    public int linearSearch(int[] arr, int value) {

        // nếu như giá trị value được tìm thấy trong mảng arr thì trả về vị trí index của phần tử trong maảng
        // nếu ko tìm thấy th trả về -1
        // duyệt qua các phần tử của mảng bằng vòng lợp fori
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return  i;
            }
        }
        return -1;
    }
}
