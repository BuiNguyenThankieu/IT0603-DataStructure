package Exercise.Array;
import java.util.*;

public class week3 {
  public static void computeAverage(String score) {
    score = "6054101234, 9, 8.5, 10, 10, 7, 9, 9.5, 10 ";
    String[] arr = score.split(",");
    float sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += Float.parseFloat(arr[i]);
      }
      System.out.println(Arrays.toString(arr));
    System.out.println("Sinh vien: " + arr[0] + "diemTB: " + sum/(arr.length));
    }
  }

