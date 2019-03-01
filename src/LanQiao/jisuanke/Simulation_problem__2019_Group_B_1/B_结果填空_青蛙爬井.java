package LanQiao.jisuanke.Simulation_problem__2019_Group_B_1;

/**
 * @Auther: zhaodong
 * @Date: 2019/2/9 20:15
 * @Description:
 */
public class B_结果填空_青蛙爬井 {
    public static void main(String[] args) {
        /**
         * (int)((high - up) / (up - down) + 0.9) + 1
         *
         * 除去最后一步出井， 剩下的是带有下滑的上升，出现小数要向上取整，最后加上最后一步
         */
        double high = 60405;
        double up = 105;
        double down = 35;
        System.out.println((int)((high - up) / (up - down) + 0.9) + 1);
    }
}
