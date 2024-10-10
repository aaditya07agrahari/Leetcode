package Arrays;

public class Reverse_of_an_Array {
    public static void Reverse_Array(int numbers[]){
        int First = 0, Last = numbers.length-1;
        while (First<Last) {
            //swap
            int temp = numbers[Last];
            numbers[Last] = numbers[First];
            numbers[First] = temp;
            First++;
            Last--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        Reverse_Array(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
    }
}
