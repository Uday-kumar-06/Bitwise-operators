public class Test {
    public static void main(String [] args){
        // operands --> byte short int long
        // and operator &
        // or operator |
        // xor ^
        // not ~
        // left shift <<
        // right shift >>
        // unsigned right shift >>>
        int a = 5;
        int b = 5 & 4;
        // for & operator we get binary 1 if both bits are 1
        System.out.println(b);


        int c = 5 | 4;
        // for | operator we get binary 1, if either of the both bits are 1
        System.out.println(c);

        int d = 5 ^ 4;
        // for ^ operator we get binary 1, if both bits are not same
        System.out.println(d);

        int e = ~a;
        // for ~ operator we change 1 to 0 and 0 to 1
        System.out.println(e);

        int f = a << 1;
        System.out.println("5 -->" + Integer.toBinaryString(a));
        System.out.println(f);
        System.out.println("{\f} -->" + Integer.toBinaryString(f));

        int g = a >> 1;
        System.out.println("5 -->" + Integer.toBinaryString(a));
        System.out.println(f);
        System.out.println("{\f} -->" + Integer.toBinaryString(g));
    }
}
