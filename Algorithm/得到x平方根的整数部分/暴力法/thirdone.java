public class thirdone {
    public static void main(String[] args) {
        int x=6;
        //暴力法得到x平方根的整数部分
        for (int i=1;i<x;i++){
            if (i*i<=x&&(i+1)*(i+1)>x){
                System.out.println(i);
            }
        }
    }
}
