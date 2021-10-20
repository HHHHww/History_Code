import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code02_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2(new int[]{1,2,3,4,5,6},10)));
    }

// 第二种方式：提高时间复杂度，只遍历一次数组
    public static int[] solution2(int[] arrays, int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arrays.length;i++){
            if (map.containsKey(target-arrays[i])){
                return new int[]{map.get(target-arrays[i]),i};
            }
            else{
                map.put(arrays[i],i);
            }
        }
    return new int[0];    }}
