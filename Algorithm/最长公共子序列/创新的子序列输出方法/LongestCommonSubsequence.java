public class LongestCommonSubsequence {
    static int sum=1;
    public static void main(String[] args) {
        int i=7;
        int j=6;
        int c[][]={{0,0,0,0,0,0,0},{0,0,0,0,1,1,1},{0,1,1,1,1,2,2},{0,1,1,2,2,2,2},{0,1,1,2,2,3,3},{0,1,2,2,2,3,3},{0,1,2,2,3,3,4},{0,1,2,2,3,4,4}};
        char a[]={'0','b','d','c','a','b','a'};


        lcsNew(i,j,c,a);
        System.out.println(sum);
    }


    public static void lcsNew(int i,int j,int c[][],char a[]){

        if(i==0||j==0) return;
        if(c[i-1][j-1]==c[i-1][j]&&c[i-1][j-1]==c[i][j-1]){
            lcsNew(i-1,j-1,c,a);
            System.out.println(a[j]);
            sum++;
        }
        else if (c[i-1][j]>=c[i][j-1]){
            lcsNew(i-1,j,c,a);
            sum++;
        }
        else{
            lcsNew(i,j-1,c,a);
            sum++;
        }

    }
}
