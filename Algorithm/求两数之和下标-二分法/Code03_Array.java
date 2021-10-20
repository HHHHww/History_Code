import java.util.Arrays;
import java.util.logging.Level;

public class Code03_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution3(new int[]{1,2,3,4,5,6},10)));   }

//  思考：二分法
  public static int[] solution3(int[] arrays, int target){
        int xiabiao1=0;
        int xiabiao2=arrays.length-1;
        for (int i=0;i<arrays.length;i++){
        int sum=arrays[xiabiao1]+arrays[xiabiao2];
        if(sum==target){
            return new int[]{xiabiao1,xiabiao2};
        }
        else{
            if(sum>target){
                xiabiao2-=1;
            }
            else{
                xiabiao1+=1;
            }
        }}
return new int[0];    }}
