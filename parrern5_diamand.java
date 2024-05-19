package Basic_question.rectangle;

public class parrern5_diamand {
    public static void main(String[] args) {
        int r  = 5;

        for(int i = 1; i<=r; i++){
            for(int j =1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k = 1;k<= 2*i-1; k++){
                if(k == 1 || k == 2*i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = r; i>=1; i--){
            for(int j =1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k = 1;k<= 2*i-1; k++){
                if(k == 1 || k == 2*i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
