package Basic_question;

public class swap_number {
    public static void main(String[] args) {
        int a = 13;
        int b = 23;

       a = a^b;
       b = a^b;
       a = a^b;

        System.out.println(a);
        System.out.println(b);
    }
}
