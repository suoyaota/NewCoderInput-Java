/**
 *链接：https://ac.nowcoder.com/acm/contest/5652/E
 * 来源：牛客网
 *
 * 输入描述:
 * 输入的第一行包括一个正整数t(1 <= t <= 100), 表示数据组数。
 * 接下来t行, 每行一组数据。
 * 每行的第一个整数为整数的个数n(1 <= n <= 100)。
 * 接下来n个正整数, 即需要求和的每个正整数。
 * 输出描述:
 * 每组数据输出求和的结果
 * 示例1
 * 输入
 * 2
 * 4 1 2 3 4
 * 5 1 2 3 4 5
 * 输出
 * 10
 * 15
 *
 */


import java.util.*;

public class P5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNum = sc.nextInt();
        while (lineNum-- > 0) {
            int num = sc.nextInt();
            int sum = 0;
            while (num-- > 0) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
