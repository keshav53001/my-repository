public class DSA {
    public static void main(String[] args) {
        int number = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        rotating_array(number, arr);
        System.out.println(Arrays.toString(arr));
    }
        public static void rotating_array(int number, int[] arr){
        int size=arr.length-1;
        for (int j = 0; j < number; j++) {
            int firstElement = arr[0];
            for (int i = 0; i <size; i++){
                arr[i] = arr[i + 1];
            }
            arr[size] = firstElement;
        }
    }
}
