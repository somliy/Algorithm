package jisuanke.Simulation_problem__2019_Group_B_1;

import java.math.BigInteger;

/**
 * @Auther: zhaodong
 * @Date: 2019/2/9 20:21
 * @Description:
 */
public class C_结果填空_倍数 {
    public static void main(String args[]) {
        /**
         * r / d - l / d
         *
         * 52573230519
         */
        BigInteger a = new BigInteger("234");
        BigInteger b = new BigInteger("12302135942453");
        System.out.println(b.divide(a).subtract(new BigInteger("4")));
    }
}
