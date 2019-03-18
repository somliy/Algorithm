package jisuanke.Simulation_problem__2019_Group_B_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/3/18 20:17
 * @Description:
 */
public class H_程序设计_轻重搭配 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        Arrays.sort(a);
        int l = 0, r = n >> 1, ans = 0;
        while (r < n && l < n >> 1) {
            if (2 * a[l] <= a[r]) {
                l++;r++;ans++;
            }else {
                r++;
            }
        }
        System.out.println(n - ans);
    }
}
