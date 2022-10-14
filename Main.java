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

// just added a comment. Will need to learn more. 