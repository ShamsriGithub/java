import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String [] sle = s.split("[PA]");
    String [] a=sle[0].split(":");
    char index= s.charAt(s.toCharArray().length-2); 
    if (index == 'P'){
        if(!a[0].equals("12")){
            a[0]=String.valueOf(Integer.parseInt(a[0])+12);
        }
    }
        else if(index == 'A'){
            if(a[0].equals("12")){
                a[0]="00";
            }
        }
        return a[0] + ":" + a[1] + ":" + a[2];
    }

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
