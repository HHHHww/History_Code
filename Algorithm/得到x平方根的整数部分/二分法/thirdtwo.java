public class thirdtwo {
    public static void main(String[] args) {
        int n=10;
        //调用方法，输出n平方根的整数部分
        System.out.println(bsearchUnit(1,n,n));
    }

    public static int bsearchUnit(int low,int high,int n){
        //取中间数
        int mid=(low+high)/2;
        //如果mid^2小于目标数并且(mid+1)^2大于目标数，则返回mid
        if(mid*mid<=n&&(mid+1)*(mid+1)>n){
            return mid;
        }
        //如果mid^2大于目标数，则递归，并把high参数设为mid-1
        else if(mid*mid>n){
            return bsearchUnit(low, mid-1, n);
        }
        //如果mid^2小于目标数且(mid+1)^2小于目标数，则递归，并把low参数设为mid+1
        else{
            return bsearchUnit(mid+1, high, n);
        }
    }
}
