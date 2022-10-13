import java.io.*;

public class Main {
    public static void StarTriangle(int n)
    {
        int a, b;
        for (a = 0; a < n; a++) {
            for (b = 0; b <= a; b++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
    public static void main(String arg[])
    {
        int k = 5;
        StarTriangle(k);
    }        
}


//int x = 1000, y = 2000, z =3000;
//System.out.println(x * y * z);
 