package Arrays;

 class Largest_in_the_Array  {

    public static int GetLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<=number.length-1; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {5,34,5,6,3,67,2,56,88};
        System.out.println("The largest in the array is : " + GetLargest(numbers));
    }
}

