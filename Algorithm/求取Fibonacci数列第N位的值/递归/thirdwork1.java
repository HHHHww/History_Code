
public class thirdwork1 {

	public static void main(String[] args) {
		System.out.println(recursion(7));
	}
	public static int recursion(int parameter) {
		if(parameter==1) {//F(1)=0
			return 0;
		}
		else if(parameter==2) {//F(2)=1
			return 1;
		}
		else {
			return recursion(parameter-1)+recursion(parameter-2);//递归实现F(n)=F(n-1)+F(n-2)
		}
	}

}
