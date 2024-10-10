package Arrays;

import java.util.Scanner;

/**
 * Reverse_String
 */
public class Reverse_String {
    public static String Reverse_String(String str){
    
        char[] charArray = str.toCharArray();

        int First = 0, Last = charArray.length-1;
        while (First<Last) {
            //swap
            char temp = charArray[Last];
            charArray[Last] = charArray[First];
            charArray[First] = temp;

            First++;
            Last--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String revered = Reverse_String(str);
        System.out.println(revered);
        sc.close();
    }
}