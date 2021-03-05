/**
 * @program: Data-Structures
 * @description: 斐波那契数列
 * @author: Wangly
 * @create: 2021-03-05 09:24
 *
 * 求 0，- n 的和
 */
public class FibDemo {
    /**
     * 原始想法 这是0 -n的和 并不是斐波那契数列
     *
     *  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……
     * */
    public static int fib1(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static int fib2(int n){
       if (n <= 1) {
           return n;
       }
        return fib2(n - 1) + fib2(n - 2);
    }
    public static int fib3(int n){
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        for (int i = 0; i < n - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
    public static void main(String[] args) {
        int n = 20;
        Times.test("fib2", new Times.Task() {
            @Override
            public void execute() {
                System.out.println(fib2(n));
            }
        });
        Times.test("fib2", new Times.Task() {
            @Override
            public void execute() {
                System.out.println(fib3(n));
            }
        });
    }
}