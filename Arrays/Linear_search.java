package Arrays;
import java.util.* ;
class Linear_search {


    public static int Linear_search(int numbers[], int Key){
        for(int i=0; i<=numbers.length-1; i++){
            if(numbers[i] == Key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int[] numbers = {2,4,5,67,78,9,3,33};
        int index = Linear_search(numbers, key);
        if (index == -1){
            System.out.println("not found");

        }else{
            System.out.println(index);
        }

    }
}