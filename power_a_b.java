package Basic_question;

public class power_a_b {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int ans = 1;
        for(int i = 1; i<=b; i++){
            ans *= a;
        }
        System.out.println(ans);
    }
}
