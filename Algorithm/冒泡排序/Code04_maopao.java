import java.util.Arrays;

public class Code04_maopao {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution5(new int[]{2,4,1,3,6,5,8,7,15,13,14,10,11,12})));
    }

    public static int[] solution5(int[] arrays){
        for (int j=0;j<arrays.length-1;j++){
        for (int i=0;i<arrays.length-1-j;i++){
            if (arrays[i]>arrays[i+1]){
                int num1=arrays[i];
                arrays[i]=arrays[i+1];
                arrays[i+1]=num1;
            }
        }}
        return arrays;
    }
}
