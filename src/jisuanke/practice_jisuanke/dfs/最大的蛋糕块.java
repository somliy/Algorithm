package jisuanke.practice_jisuanke.dfs;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/3/15 16:49
 * @Description:
 */
public class 最大的蛋糕块 {
    /**
     * <p>这一天蒜头君生日，他的朋友们一起来给蒜头君买一个大的蛋糕过生日。游戏做完后到了切蛋糕的时刻了，朋友们知道蒜头君喜欢吃蛋糕，便让蒜头君自己给自己切一块最大的。蒜头君看朋友们这么热情也就不客气了。</p><p>这块蛋糕是由 $R \times C$ 的网格构成，每个网格上面都放有不同的水果。蒜头君把这些水果分为两类，一类是自己喜欢吃的水果，用<code>'#'</code>来表示；一类是自己不喜欢吃的水果，用<code>'.'</code>来表示。</p><p>蒜头君对切出的蛋糕有如下要求：</p><ul><li>切出的蛋糕连成一块（可以不为矩形，但必须在网格上连通）</li><li>切出的蛋糕只包含自己喜欢吃的水果</li></ul><p>请问，蒜头君最大可以吃到多大的蛋糕？</p><h3>输入格式</h3><p>第一行输入两个被空格隔开的整数 $R(1 \le R \le 1000)$ 和 $C(1 \le C \le 1000)$。</p><p>然后会有一个 $R \times C$ 的网格，由<code>'#'</code>和<code>'.'</code>组成。</p><h3>输出格式</h3><p>输出一个整数，表示蒜头君可以吃到的蛋糕最大是多少（即对应到网格中的格子数）。</p>
     */
    static char[][] map = null;
    static int n, m,step;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        cin.nextLine();
        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = cin.nextLine().toCharArray();
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == '#') {
                    dfs(i, j);
                    ans = Math.max(ans, step);
                    step = 0;
                }
            }
        }
        System.out.println(ans);
    }

    public static void dfs(int x, int y) {
        step ++;
        map[x][y] = '.';
        if (check(x + 1, y)) dfs(x + 1, y);
        if (check(x - 1, y)) dfs(x - 1, y);
        if (check(x, y + 1)) dfs(x, y + 1);
        if (check(x, y - 1)) dfs(x, y - 1);
        return;
    }

    public static Boolean check(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= m) return false;
        else if(map[x][y] == '.') return false;
        else return true;
    }
}
