package Basic_question.rectangle;

public class pattern3 {

    public static void main(String[] args) {
        int r = 5;
        int c = 5;

        for(int i = 1; i<=r; i++){
            for(int j =i; j<=c ; j++) System.out.print(j);
            for(int k = 1; k<=i-1; k++) System.out.print(k);

            System.out.println();
        }
    }
}
