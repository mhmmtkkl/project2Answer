import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {


      /*
        Given a String array

        Reverse the String array

        Print the reversed array

        NOTE: While printing the array don't use for loop

        Use Arrays.toString(your_array_name);

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

//        Code start here ignore the above codes, that is related to the test class.
//        You should use -> useThisArray

        String[] reversed = new String[useThisArray.length];

        int counter = 0 ;

        for(int i = useThisArray.length-1 ; i >=0 ; i--){

            reversed[counter++] = useThisArray[i];

        }


        System.out.println(Arrays.toString(reversed));
    }

}
