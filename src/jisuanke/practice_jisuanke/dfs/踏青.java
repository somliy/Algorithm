package jisuanke.practice_jisuanke.dfs;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/3/15 16:06
 * @Description:
 */
public class 踏青 {
    /**
     *<p>蒜头君和他的朋友周末相约去召唤师峡谷踏青。他们发现召唤师峡谷的地图是由一块一块格子组成的，有的格子上是草丛，有的是空地。草丛通过上下左右 $4$ 个方向扩展其他草丛形成一片草地，任何一片草地中的格子都是草丛，并且所有格子之间都能通过上下左右连通。如果用<code>'#'</code>代表草丛，<code>'.'</code>代表空地，下面的峡谷中有 $2$ 片草地。</p><pre><code>##..
     * ..##</code></pre><p>处在同一个草地的 $2$ 个人可以相互看到，空地看不到草地里面的人。他们发现有一个朋友不见了，现在需要分头去找，每个人负责一片草地，蒜头君想知道他们至少需要多少人。</p><h3>输入格式</h3><p>第一行输入 $n$, $m$ $(1 \le n,m \le 100)$ 表示峡谷大小。</p><p>接下来输入 $n$ 行字符串表示峡谷的地形。</p><h3>输入格式</h3><p>输出至少需要多少人。</p>
     */
    static char[][] map = null;
    static int n, m;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        cin.nextLine();
        map = new char[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = cin.nextLine().toCharArray();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == '#') {
                    dfs(i, j);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    public static void dfs(int x, int y) {
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
