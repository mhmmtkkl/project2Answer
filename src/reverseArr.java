import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {

      /*
        Given String array

        reverse the String array

        print the reversed array

        NOTE: While printing the array dont use for loop
        Use Arrays.toString(your_array_name);


     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

//        code start here

        String[] reversed = new String[useThisArray.length];

        int counter = 0 ;

        for(int i = useThisArray.length-1 ; i >=0 ; i--){

            reversed[counter++] = useThisArray[i];

        }


        System.out.println(Arrays.toString(reversed));
    }

}
