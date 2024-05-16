package Basic_question;

public class perfect_number {
    public static void main(String[] args) {
        // perfect means all divisible sum are equal to number

        int n = 28;
        int sum = 1;
        for( int i = 2; i<=n/2; i++){
            if(n%i == 0) sum += i;
        }
        if(n == sum) System.out.println("perfect number");
        else System.out.println("not");
    }
}
