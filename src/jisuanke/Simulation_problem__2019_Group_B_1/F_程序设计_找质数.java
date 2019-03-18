package jisuanke.Simulation_problem__2019_Group_B_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/2/9 21:43
 * @Description:
 */
public class F_程序设计_找质数 {

    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        Scanner cin = new Scanner(System.in);

        int MAX_N = 1000000, num = 1;
        boolean[] vis = new boolean[MAX_N + 10];
        int[] isprime = new int[MAX_N / 10];
        Arrays.fill(vis, true);
        for (int i = 2; i <= MAX_N; i++) {
            if (vis[i]) isprime[num++] = i;
            for (int j = 1; j < num; j++) {
                if (i * isprime[j] > MAX_N) break;
                vis[i * isprime[j]] = false;
                if (i % isprime[j] == 0) break;
            }
//            if (vis[i]) {
//                for (int j = i + i; j <= MAX_N; j += i) {
//                    vis[j] = false;
//                }
//            }
        }

        int t = cin.nextInt();
        for (int ca = 1; ca <= t; ca++) {

            int x = cin.nextInt();
            for(int i = 1; i < num; i++) {
                if(vis[isprime[i]] && vis[x - isprime[i]]) {
                    System.out.println(isprime[i] + " " + (x - isprime[i]));
                    break;
                }
            }
//            for (int i = 2; ; i++) {
//                if (vis[i] && vis[x - i]) {
//                    System.out.println(i + " " + (x - i));
//                    break;
//                }
//            }
            long endTime=System.currentTimeMillis();
            System.out.println("run time is "+(endTime-startTime)+"ms");
        }
        return;
    }

}
