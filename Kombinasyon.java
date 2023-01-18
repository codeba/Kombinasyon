package patika;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, fak = 1,fak1=1,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("*****Kombinasyon hesabı******");
        System.out.print("n değerini giriniz:");
        n = sc.nextInt();
        System.out.print("r değerini giriniz:");
        r = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fak *= i;
        }
        for (int i = 1; i <=n-r ; i++) {
             fak1*= i;

        }
        total=fak/fak1;
        System.out.println("Toplam:"+total);
    }
}
