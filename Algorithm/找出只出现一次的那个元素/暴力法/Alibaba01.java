public class Alibaba01 {
    public static void main(String[] args) {
        int x[]={3,3,7,7,10,11,11};
        int i=0;
        boolean a;
        //暴力法得到只出现一次的元素
        while(true){
            //数组从下标i=0开始遍历，如果x[i]不等于x[i+1],则此元素只出现过一次，若x[i]等于x[i+1],则下标i+2继续遍历
            //在判断x[i]是否等于x[i+1]时可能出现数组越界，若数组越界，则判断为不相等
            try {
                a = x[i]!=x[i+1];
            }catch (ArrayIndexOutOfBoundsException e){
                a = true;
            }
            if(a){
                System.out.println(x[i]);
                break;
            }
            else{
                i+=2;
            }
        }
    }
}
