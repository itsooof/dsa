/*Paul and Mary wants to send each other messages discretely, without anyone else knowing what they're talking about. 
So Poul came up with a plan and developed a certain algorithm which takes a large number and converts it to a meaningful message. 
But to determine this large number, Mary needs to decode a message which Paul will be sending before!

To convey his message, Paul will be sending a string of alphabets and a pattern. 
Mary needs to decode this string and pattern to form a large unique number so that she can put it up as an input 
to the defined algorithm to extract the secret message.

The starting index of the string is 1. The unique number is the list of all indices of the pattern found in the string. 
Unique number is a integer without any space or comma between the various indices.

To make it even more safe, Paul has Introduced wildcard characters(#) in the pattern. It stands for any one character. 
The character can be different in its occurrence i.e. 'a#' can be 'aa' or 'ab' or... az where # maps to a', 'b' or.. 'z' respectively.

You goal is to help Mary to find the Unique Number In case there is no pattern formed, return 0 as unique number. */

/*TESTCASES
---------------------------------
INPUT 1: 
abcdefabc
abc

OUTPUT 1: 17
---------------------------------
INPUT 2:
abcdabghabd
ab# 

OUTPUT 2: 159
---------------------------------

Constraints:
 * 0 < N < 10*3
 * 0 < M < 10*3
 */

 
import java.util.Scanner;

public class Main {
    public static String getUniqueLargeNumber(String a, String b) {
        StringBuilder c = new StringBuilder();
        int i = 0;
        while (i < a.length()) {
            if (a.charAt(i) == b.charAt(0)) {
                int j = 1;
                while (j < b.length() && i + j < a.length() && (a.charAt(i + j) == b.charAt(j) || b.charAt(j) == '#')) {
                    j++;
                }
                if (j == b.length()) {
                    c.append(i + 1);
                }
            }
            i++;
        }
        return c.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = getUniqueLargeNumber(a, b);
        if (c.equals("")) {
            System.out.println("0");
        } else {
            System.out.println(c);
        }
    }
}
