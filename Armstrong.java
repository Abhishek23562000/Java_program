package Basic_question;

public class Armstrong {
    public static void main(String[] args) {


        int n = 153;
        int temp = n;

        String s = Integer.toString(n);
        int d = s.length();
        int sum = 0;

        while(n>0){
            int r = n%10;
            sum = sum + (int)Math.pow(r, d);
            n /= 10;
        }
        if(sum == temp) System.out.println("Armstrong number");
        else System.out.println("not a armstrong number");
    }
}
