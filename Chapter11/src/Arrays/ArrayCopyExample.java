package Arrays;

import java.util.Arrays;

/**
 * Created by jusk2 on 2017-02-02.
 */
public class ArrayCopyExample {
  public static void main(String[] args) {
    char[] arr1 = {'J', 'A', 'V', 'A'};

    //방법1
    char[] arr2 = Arrays.copyOf(arr1, arr1.length);
    System.out.println(arr2);

    //방법2
    char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
    System.out.println(arr3);

    //방법3
    char[] arr4 = new char[arr1.length];
    System.arraycopy(arr1, 0, arr4, 0, arr1.length);
    for (int i=0; i<arr4.length; i++) {
      System.out.println("arr4[" + i + "] = " + arr4[i]);
    }
  }
}
