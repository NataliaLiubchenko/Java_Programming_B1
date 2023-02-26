package day06_a_arithmetic_operators;

public class TypeCastihg {

    public static void main(String[] args) {

        byte b = 40;
        int i = b; //the byte value is automatically (implicitly) converted to int, because byte is smaller then int

        int i2 = 100;
        //byte b2 = i2; // Re-assigning checks data type first
        byte b2 = (byte)i2; //with CASTING

        byte b3 = 100; // Putting value directly gives a data type declaered

        System.out.println("b2: "+b2);
        System.out.println("b3: "+b3);

        int i3 = 130;
        byte b4= (byte)i3;//130 is out of the range,so after casting data lost -128 to 126 only

        System.out.println("b4: "+b4);

        char letter1 = 65;
        char letter2 = 'A';
        System.out.println("letter1: "+letter1);
        System.out.println("letter2: "+letter2);

        byte b5 ='B';
        char letter3 = (char)b5;
        System.out.println("letter3: "+letter3);

        byte aa=5;
        char bb=(char)aa;
        System.out.println("bb"+bb);

        int i10 = 500;
        long l1 =i10; //int is smaler then long, so it will automatically cast

        long l2 = 200;
        int i11 =(int)l2; //explicit  casting is needed;


        double d =50.5;
        System.out.println("d: "+d);
        int i13 =(int)d;
        System.out.println("i13: "+i13);




    }
}
