package jisuanke.Simulation_problem__2019_Group_B_2;

/**
 * @Auther: zhaodong
 * @Date: 2019/3/23 14:21
 * @Description:
 */
public class C_结果填空_充话费 {
    /**
     * 4156
     * 因为模数小，考虑循环周期。首先计算 \sum\limits_{i=1}^{mod} i^{2019}
     * i=1
     * ∑
     * mod
     * ​
     *  i
     * 2019
     *  ，在 [1,10^{12}][1,10
     * 12
     *  ] 里有 \frac{10^{12}}{10086}
     * 10086
     * 10
     * 12
     *
     * ​
     *   个完整的周期，在加上剩余的部分就得到答案 41564156。
     *
     * @param args
     */
    public static void main(String[] args) {
        int mod = 10086;
        long t = (long) 1e12;
        int ans = 0, sum = 0;
        for (int i = 1; i <= mod; i++) {
            sum = sum % mod + powMod(i, 2019, mod);
        }
        System.out.println(sum % mod);
        sum = (int) (sum * (t / mod)) % mod;
        System.out.println(sum);


        int n = (int) (t % mod);
        for (int i = 1; i <= n; i++) {
            ans = (powMod(i, 2019, mod) + ans) % mod;
        }
        System.out.println(ans);
    }

    public static int powMod(int a, int n, int mod) {
        if (n == 0) return 1 % mod;
        long ans = 1l;
        long base = a % mod;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans = (ans * base) % mod;
            }
            base = (base % mod) * (base % mod) % mod;
            n >>= 1;
        }
        return (int) ans;
    }
}


