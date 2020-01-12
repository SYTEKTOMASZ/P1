package SDA.P1;

public class Program2 {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;
        int c = 0;
        int res =0;

        while (c < x)
        {
            res = res + y;
            c=c+1;
        }

        System.out.println(x +" * "+ y + " = "+ res);
        }
}
