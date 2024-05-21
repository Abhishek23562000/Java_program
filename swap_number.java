package Basic_question;

public class swap_number {
    public static void main(String[] args) {
      int a = 13;
        int b = 23;
     // using xor bitwise operator
       a = a^b;
       b = a^b;
       a = a^b;

        System.out.println(a);
        System.out.println(b);

        int c = 12;
        int d = 21;
        
        //simple taking third variable
        int temp = c;
        c = d;
        d = temp;
        System.out.println(c);
        System.out.println(d);

        int e =20;
        int f =15;
   // using arithmetic operators
        e = e+f;
        f = e-f;
        e = e-f;
        System.out.println(e);
        System.out.println(f);
    }
}
