package com.clouway.intro;

import com.clouway.intro.arrays.Array;
import com.clouway.intro.arrays.QuickSort;

import java.util.Arrays;

/**
 * Created by Krasimir Raikov(raikov.krasimir@gmail.com)on 7/27/15.
 */
class FirstSetOfExercises {

  public static void main(String[] args) {
    int[] array = {10, 13, 11, 25};
    Array arrOp = new Array();
    System.out.print("The array is ");
    arrOp.printAll(array);

    array = arrOp.arrRevert(array);
    System.out.print("\nThe reverted array is ");
    arrOp.printAll(array);

    QuickSort sArr= new QuickSort();
    sArr.sorting(array, 0, array.length-1);
    System.out.println("\nSorted" + Arrays.toString(array));

    System.out.println("\nMinimal element of the array is " + arrOp.getMin(array));
    System.out.println("The sum of the array is " + arrOp.getSum(array));

    TwoNumberOperator tn = new TwoNumberOperator();
    System.out.println("Smallest common dividable of 3 and 9 is " + tn.getSD(3, 9));
    System.out.println("Biggest common divider of 12 and 7 is " + tn.getBigCD(12, 7));


    RandomStringGenerator randStr = new RandomStringGenerator();
    String rS;
    rS = randStr.getRandString(9, 73, 122);
    System.out.println("\n Your string is " + rS);

  }

}



