package jisuanke.Simulation_problem__2019_Group_B_1;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/2/9 20:30
 * @Description:
 */
public class E_代码填空_LIS {
    public static final int N = (int) 1e5 + 9;
    public static int n = 0;
    public static int[] f = new int[N];
    public static int[] a = new int[N];

    public static int find(int l, int r, int x) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (f[mid] < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    /**
     * 7
     * 2 5 3 4 1 7 6
     *
     * @return
     */

    public static int lis() {
        int len = 0;
        for (int i = 0; i < n; i++) {
            /**
             * f数组存储最大上升子序列 是有序的
             *
             * 这道题是通过二分查找f数组，判断当前a[i]是否 添加/替换 到数组f，来维护f数组
             * 添加： a[i]比f中所有的数字都大
             * 替换： f[len-1] > a[i] （len-1是f最后一个数字）
             */
            /*--------------------------*/

            int k = find(0, len, a[i]);
            /* 不如上面的好
            int k;
            if (len == 0) {//若f数组无数字，直接添加
                k = i;
            } else {
                k = find(0, len - 1, a[i]);//查找a[i]在f数组中大小位置
                if (k == len - 1) {//二分查找到了末尾，说明f[k]<=a[k]
                    if (f[len - 1] > a[i]) k = len - 1;//替换
                    else k = len;//添加
                }
            }
            */
            /*--------------------------*/
            f[k] = a[i];
            if (k == len) {
                len++;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();
        }
        System.out.println(lis());
    }

}
