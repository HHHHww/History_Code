public class Code05_string {


        public static void main(String[] args) {
            System.out.println(solution7("ABCABCAABCABCD","ABCABCD"));
        }

        public static int solution7(String a,String b){
           if (a.contains(b)){
               return a.indexOf(b);
           }
           return -1;
        }




}
