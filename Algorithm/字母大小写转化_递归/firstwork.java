
public class firstwork {
	static String s = "abcde";
	//将字符串s转为字符数组
	static char a[]=s.toCharArray();
	public static void main(String[] args) {
		//调用toUpCase方面并打印
		System.out.println(toUpCase(a,0));
	}
	

	public  static char toUpCaseUnit(char c){
		int n=c;
		if(n<97||n>122){
			//如果字符是大写字母，则返回原字母
			return (char)n;
		}
		//如果字符是小写字母，则字母对应ascii码减去32，得到对应大写字母
		return (char)Integer.parseInt(String.valueOf(n-32));

	}

	public static char[] toUpCase(char[] chs,int i){
		//如果数组已经递归到最后一个，则返回整个数组
		if(i==chs.length){
			return chs;
		}
		//调用toUpCaseUnit处理小写字母
		chs[i]=toUpCaseUnit(chs[i]);
		//实现递归处理字符数组
		return toUpCase(chs, i+1);
	}
}