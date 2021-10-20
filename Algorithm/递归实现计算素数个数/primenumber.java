import java.util.Scanner;

public class primenumber {

    private static int num = 0;

    public static void main(String[] args) {
        //在控制台输入a和b
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数(a)：");
        int a = sc.nextInt();
        System.out.print("请输入第二个数(b)：");
        int b = sc.nextInt();
        System.out.println(findprimenumber(a, b));//递归实现计算素数个数
    }

    public static int findprimenumber(int a, int b) {

        int count = 0;
        if (a == 0) {//如果a是0,0不算素数，a++
            a++;
            return findprimenumber(a, b);
        } else if (a == 1 || a == 2) {//如果a是1或2,1和2都是素数，素数个数+1
            a++;
            num++;
            return findprimenumber(a, b);
        } else if (a <= b) {
            for (int j = 2; j < a; j++) {//让a除以2到(a-1),如果a被整除，则跳出循环，a++
                if (a % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {//如果a未被整除，则素数个数+1
                num++;
            }

            a++;
            return findprimenumber(a, b);
        }//递归实现
        else {
            return num;
        }//如果a>b,则退出递归，返回素数个数
    }
}
