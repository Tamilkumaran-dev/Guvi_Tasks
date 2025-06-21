public class BellowedPattern {

        public static void main(String[] args){
        for(int i=5;i>=1;i--){
            for(int j=5;j>=1;j--){
                if(i<=j){
                    System.out.print(j);
                }
                else{
                    System.out.print(i);
                }
            }
                    System.out.println();
        }
    }
}
