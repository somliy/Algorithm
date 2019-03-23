
import java.util.*;

public class Main {
    public static int[] pre = null;
    public static int[] a = null;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int line = cin.nextInt();
        pre = new int[n + 1];
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            pre[i] = i;
            a[i] = cin.nextInt();
        }
        for (int i = 1; i <= line; i++) {
            int x = cin.nextInt();
            int y = cin.nextInt();
            if (find(x) != find(y)) {
                if ((a[x] > a[y])) {
                    pre[x] = y;
                } else {
                    pre[y] = x;
                }
            }
        }
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            if(pre[i] == i) {
                ans += a[i];
            }
        }
        System.out.println(ans);
    }

    public static int find(int x) {
        if (pre[x] == x) return x;
        return pre[x] = find(pre[x]);
    }
}