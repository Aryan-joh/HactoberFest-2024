public class Reverse_An_Array{
    
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverseArray(int[] number, int start, int end){
        while(start<end){
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println("Original Array");
        printArray(arr);

        System.out.println("Reversed Array");
        reverseArray(arr, 0, arr.length-1);
        printArray(arr);

    }
}