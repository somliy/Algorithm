package jisuanke.Simulation_problem__2019_Group_B_2;

/**
 * @Auther: zhaodong
 * @Date: 2019/3/22 16:34
 * @Description:
 */
public class B_结果填空_十万火急 {
    public static void main(String[] args) {
        double ans = 100000000, t, t_ad, t_bd;
        for (int a = 0; a < 1000; a++) {
            t_ad = a / 5.0;
            t_bd = Math.sqrt((1000 - a) * (1000 - a) + 800.0 * 800.0) / 2.0;
            t = t_ad + t_bd;
            if (t < ans) {
                ans = t;
            }
        }
        System.out.println(ans);
    }
}
