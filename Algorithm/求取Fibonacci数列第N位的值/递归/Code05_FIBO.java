import java.util.Arrays;

public class Code05_FIBO {

        public static void main(String[] args) {
            System.out.println(solution6(10));
        }

        public static int solution6(int a){
            int sum=0;
           if(a==1){
               return 1;
           }
           else if(a==0){
               return 0;
           }
           else{
               return solution6(a-2)+solution6(a-1);
           }
        }
    }


