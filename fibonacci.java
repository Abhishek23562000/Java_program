package Basic_question;

public class fibonacci {
    public static void main(String[] args) {
        int f = 0;
        int s = 1;
        int lower = 10;
        int upper= 100;
        while(lower>f){
            int next = f+s;
            f = s;
            s = next;
        }

        while(upper>f){
            System.out.print(f+" ");
            int next = f+s;
            f = s;
            s = next;

        }

    }
}
