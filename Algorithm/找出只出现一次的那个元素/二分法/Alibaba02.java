public class Alibaba02 {
    public static void main(String[] args) {
        int a[]={3,3,7,7,10,11,11};
        //打印只出现一次的元素
        System.out.println(bsearchUnit(a,0,a.length-1));
    }

    public static int bsearchUnit(int nums[],int low,int high){
        //取中间数
       int mid=(low+high)/2;
       boolean b;
       boolean c;
       //判断中间数与前一个数是否相等，可能出现数组越界，若数组越界，则判断为不相等
       try {
           b=nums[mid]!=nums[mid-1];
       }catch (ArrayIndexOutOfBoundsException e){
           b=true;
       }
        //判断中间数与后一个数是否相等，可能出现数组越界，若数组越界，则判断为不相等
        try {
            c=nums[mid]!=nums[mid+1];
        }catch (ArrayIndexOutOfBoundsException e){
            c=true;
        }
        //判断中间数与前后的元素是否相等，若都不相等，则返回此元素。
        if (b&&c){
            return nums[mid];
        }
        //若中间数与后一个元素相等且中间数下标为偶数，或者中间数与前一个元素相等且中间数下标为奇数，
        //则采用二分递归，范围缩小至mid+1到high
        else if((mid%2==0&&nums[mid]==nums[mid+1])||mid%2==1&&nums[mid]==nums[mid-1]){
            return bsearchUnit(nums, mid+1, high);
        }
        //若中间数与后一个元素相等且中间数下标为奇数，或者中间数与前一个元素相等且中间数下标为偶数，
        //则采用二分递归，范围缩小至low到mid-1
        else{
            return bsearchUnit(nums, low, mid-1);
        }

    }
}
