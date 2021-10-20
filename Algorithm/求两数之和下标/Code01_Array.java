
import java.util.Arrays;

public class Code01_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{1,2,3,4,5,6},10)));
    }

    // ��һ�ַ�ʽ�����������
    public static int[] solution1(int[] arrays, int target){
        int shuzu[]=new int[2];
        for(int i=0;i<arrays.length;i++) {
            for(int j=i+1;j<arrays.length;j++) {
                if((arrays[i]+arrays[j])==target) {
                    shuzu[0]=i;
                    shuzu[1]=j;
                }
            }
        }
        return new int[] {shuzu[0],shuzu[1]};   }}
