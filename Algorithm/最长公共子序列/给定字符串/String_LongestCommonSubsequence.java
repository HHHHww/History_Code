public class String_LongestCommonSubsequence {
    public static void main(String[] args) {
        String A="HelloWorld";
        String B="loop";
        char[] a = A.toCharArray();

        char[] b = B.toCharArray();
        int table[][]=new int[a.length+1][b.length+1];
        System.out.println(LongestCommonSubsequence(a,b,table));
        for(int i=0;i<a.length+1;i++){
            for(int j=0;j<b.length+1;j++){
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    output(table,a,b);
    }
    public static int LongestCommonSubsequence(char[] A,char[] B,int[][] table){
        int num=0;
        for(int i=0;i<A.length+1;i++){
            table[i][0]=0;
        }
        for(int i=0;i<B.length+1;i++){
            table[0][i]=0;
        }
        for(int i=1;i<A.length+1;i++){
            for(int j=1;j<B.length+1;j++){
                if (A[i-1]==B[j-1]){
                    table[i][j]=table[i-1][j-1]+1;
                    if (table[i][j]>num){
                        num=table[i][j];
                    }
                }
                else{table[i][j]=Math.max(table[i-1][j],table[i][j-1]);}
            }
        }
        return num;


    }
    public static void output(int[][] table,char[] A,char[] B){
        int i=A.length;
        int j=B.length;
        for (int o=0;o<100;o++){
        if(A[i-1]==B[j-1]){
            System.out.print(A[i-1]);
            i-=1;
            j-=1;

        }
        else{
            if(table[i-1][j]>table[i][j-1]){
                i-=1;
            }
            else{
                j-=1;
            }
        }
            if (table[i][j] == 0) {
                return;

            }
    }
        }
}
