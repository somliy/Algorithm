package LanQiao.training;

import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/2/15 23:29
 * @Description:
 */
public class ex_training_核桃的数量 {
    /**
     * 历届试题 核桃的数量
     * 描述
     *
     * 小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是：
     *
     * 1. 各组的核桃数量必须相同
     *
     * 2. 各组内必须能平分核桃（当然是不能打碎的）
     *
     * 3. 尽量提供满足1,2条件的最小数量（节约闹革命嘛）
     *
     *
     * 输入
     *
     * 输入描述:
     *
     * 输入包含三个正整数a, b, c，表示每个组正在加班的人数，用空格分开（a,b,c<30）
     *
     * 输入样例:
     *
     * 2 4 5
     *
     *
     * 输出
     *
     * 输出描述:
     *
     * 输出一个正整数，表示每袋核桃的数量。
     *
     * 输出样例:
     *
     * 20
     *
     *
     * 思路： 最小公倍数模板题
     * @param args
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int ans = lcm(lcm(a, b), c);
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
