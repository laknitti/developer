import java.io.*;
import java.util.*;
public class Approach2 {
    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
    }

    public static void main(String[] args) throws IOException {
        Approach2 approach2 = new Approach2();
        int n, k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();

        }
        approach2.rotate(a, k);
    }
}