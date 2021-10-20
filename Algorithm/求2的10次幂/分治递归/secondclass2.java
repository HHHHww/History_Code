
public class secondclass2 {

	public static void main(String[] args) {
		System.out.println(recursion(2,10));
	}
	
	public static int recursion(int x,int parameter) {
		//判断幂次数能不能整除2
		int a=parameter%2;
		//如果整除并幂次数大于1，则将幂次数/2，然后递归递归recursion方法实现分治递归
		if(a==0&&parameter>1) {
			return recursion(x,parameter/2)*recursion(x,parameter/2);
		}
		//如果不能整除并幂次数大于1，则将幂次数/2，然后递归递归recursion方法实现分治递归并乘2
		else if(a==1&&parameter>1) {
			return recursion(x,parameter/2)*recursion(x,parameter/2)*2;
		}
		//如果幂次数等于1，则返回2
		else {
			return x;
		}
	}
}
