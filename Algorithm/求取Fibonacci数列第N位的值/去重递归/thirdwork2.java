import java.util.HashMap;
import java.util.Map;

public class thirdwork2 {
	static Map<Integer,Integer> map=new HashMap<>();//用额外的集合存储计算过的Fibonacci数
	public static void main(String[] args) {
		
		System.out.println(recursion(7));
	}
	public static int recursion(int parameter) {
		//首先做判断，如果集合中key已包含某位Fibonacci数，则直接返回
		if(map.containsKey(parameter)) {
				return map.get(parameter);

			}

		else if(parameter==1) {
			//F(1)=0，将（1，0）存进集合，返回0
			map.put(1,0);
			return 0;
		}
		else if(parameter==2) {
			//F(1)=0，将（1，0）存进集合，返回1
			map.put(2, 1);
			return 1;
		}
		else{
			//递归实现F(n)=F(n-1)+F(n-2)，并将key和value存在集合，返回F(n)
			int num= recursion(parameter-1)+recursion(parameter-2);
			map.put(parameter, num);
			return num;
		}

	}

}
