package jisuanke.Simulation_problem__2019_Group_B_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Auther: zhaodong
 * @Date: 2019/3/18 19:28
 * @Description:
 */
public class G_程序设计_后缀字符串 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        cin.nextLine();
        String[] strings = new String[n];
        Map<String, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i++) {
            strings[i] = cin.nextLine();
            for(int j = 0; j < strings[i].length(); j++) {
                String str = strings[i].substring(j);
                if(mp.containsKey(str)) mp.put(str, mp.get(str)+1);
                else mp.put(str, 1);
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.println(mp.get(strings[i]));
        }
    }
}
