import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long occurances = 0;
        // total a's found
        long totalCount = 0;
        // Determines how many substrings we need to check
        long divisor = (n / s.length());
        // This returns the partial value of the string divided by number of repeats
        long remainder = (n % s.length());

        // find amount of a's in first instance of the string
        for (int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) == 'a') {
                occurances++;
            }
        }

        // adds all substrings for each repeated string
        // does not include the last potentially partial string
        totalCount += (divisor * occurances);

        // Add a's from last remaining string
        for (int i =0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                totalCount++;
            }
        }

        System.out.println(divisor);

        return totalCount;

    }
}