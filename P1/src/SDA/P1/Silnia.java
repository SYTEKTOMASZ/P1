package SDA.P1;

public class Silnia {
    public static void main(String[] args)  {
        int c=1;
        int n=10;
        int wynik1=1;
        int wynik2=1;

        while(c<n+1)
        {
            wynik1 = wynik1*c;
            c++;
        }
        for(int i = 1; i < n + 1 ; ++i) {

            wynik2 = wynik2 * i;

        }
        System.out.println("wynik n! z pętli while = "+wynik1);
        System.out.println("wynik n! z pętli for = "+wynik2);
    }

}
