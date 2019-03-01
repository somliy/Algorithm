package LanQiao.jisuanke.Simulation_problem__2019_Group_B_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/2/9 21:43
 * @Description:
 */
public class F_程序设计_找质数 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int MAX_N = 1000000;
        boolean[] check = new boolean[MAX_N + 10];
        Arrays.fill(check, true);

        for (int i = 2; i <= MAX_N; i++) {
            if (check[i]) {
                for (int j = i + i; j <= MAX_N; j += i) {
                    check[j] = false;
                }
            }
        }

        int t = cin.nextInt();
        for(int ca = 1; ca <= t; ca++) {
            long startTime=System.currentTimeMillis();
            int x = cin.nextInt();
            for (int i = 2; ; i++) {
                if (check[i] && check[x - i]) {
                    System.out.println(i + " " + (x - i));
                    break;
                }
            }
            long endTime=System.currentTimeMillis();
            System.out.println("run time is "+(endTime-startTime)+"ms");
        }

        return;
    }
}
