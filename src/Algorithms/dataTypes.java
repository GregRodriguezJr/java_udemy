package Algorithms;

import java.util.Scanner;

public class dataTypes {
//    Input Format
//    The first line contains an integer t denoting the number of test cases.
//    Each test case, t , is comprised of a single line with an integer, n, which can be arbitrarily large or small.
//    Output Format
//    For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it.
//    If yes, then print:
//    n can be fitted in:
//    * dataType
//    n can't be fitted anywhere.
    public static void main(String[] args) {
        // short -32,768 - 32,767
        // int -2(31) - 2(31)
        // long -2(63) - 2(63)
        System.out.println("Enter a number of test cases: ");
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                System.out.println("Enter test number: ");
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x>=-32768 && x<=32767) System.out.println("* short");
                if(x>=-Math.pow(2,31) && x<=Math.pow(2,31) - 1) System.out.println("* int");
                if(x>=-Math.pow(2,63) && x<=Math.pow(2,63) - 1) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
