package jisuanke.practice_jisuanke.dfs;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/3/15 16:43
 * @Description:
 */
public class 迷宫解的方案数 {
    /**
     * <p>蒜头君是一个玩迷宫的高手，天下还没有能难住他的迷宫。但是总有人喜欢刁难蒜头君，不停的给蒜头君出难题。这个出题的人很聪明，他知道天下还没有能难住蒜头君的迷宫。</p><p>所以他便转换思维问蒜头君，在<strong>不走重复路径</strong>的情况下，总共有多少不同可以到达终点的路径呢？蒜头君稍加思索便给出了答案，你要不要也来挑战一下？</p><h3>输入格式</h3><p>第一行输入两个整数 $n(1 \le n \le 11),$ $m(1 \le m \le 11)$，表示迷宫的行和列。</p><p>然后有一个 $n \times m$ 的地图，地图由<code>'.'</code>、<code>'#'</code>、<code>'s'</code>、<code>'e'</code>这四个部分组成。<code>'.'</code>表示可以通行的路，<code>'#'</code>表示迷宫的墙，<code>'s'</code>表示起始点，<code>'e'</code>表示终点。</p><h3>输出格式</h3><p>输出一个整数，表示从<code>'s'</code>到达<code>'e'</code>的所有方案数。</p>
     */
    static int n, m, sx, sy, ex, ey, ans;
    static char[][] map = null;
    static int[][] vis = null;
    static int[][] to = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        map = new char[n][m];
        vis = new int[n][m];

        cin.nextLine();

        for (int i = 0; i < n; i++) {
            map[i] = cin.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 's') {
                    sx = i;
                    sy = j;
                } else if (map[i][j] == 'e') {
                    ex = i;
                    ey = j;
                }
                vis[i][j] = 0;
            }
        }
        ans = 0;
        vis[sx][sy] = 1;
        dfs(sx, sy);
        System.out.println(ans);
    }

    public static void dfs(int x, int y) {
        if (x == ex && y == ey) {
            ans++;
            return;
        }
        for (int i = 0; i < 4; i++) {
            int dx = x + to[i][0], dy = y + to[i][1];
            if (check(dx, dy)) {
                vis[dx][dy] = 1;
                dfs(dx, dy);
                vis[dx][dy] = 0;
            }
        }
    }

    public static Boolean check(int x, int y) {
        if (x < 0 || y < 0 || x >= n || y >= m) return false;
        else if (vis[x][y] == 1 || map[x][y] == '#') return false;
        else return true;
    }
}
