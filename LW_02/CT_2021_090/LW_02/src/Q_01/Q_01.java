package Q_01;

public class Q_01 {
    public static void main(String[] args) {

    // This is a part a
    int A = 5;
    int B = 10;
    int C = 15;

    double answer_a = Math.sqrt( Math.pow(B,2) + (4 * A * C) );
    System.out.println(answer_a);

    // This is a part b
    int X =200;
    int Y =5;

    double answer_b = Math.sqrt( X+(4*(Math.pow(Y,3))));
    System.out.println(answer_b);

    // This is a part c
    double answer_c = Math.cbrt(X*Y);
    System.out.println(answer_c);

    // This is a part d
    int Radius = 21;
    double answer_d = Math.PI*Math.pow(Radius, 2);
    System.out.println(answer_d);

    }
}
