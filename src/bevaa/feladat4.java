package bevaa;

import java.util.Scanner;

public class feladat4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("kerem adja meg a 3 szob A oldalat");
        double a = sc.nextDouble();
        System.out.print("kerem adja meg a 3 szob B oldalat");
        double b = sc.nextDouble();
        System.out.print("kerem adja meg a 3 szob C oldalat");
        double c = sc.nextDouble();
        if((a+b>c)&&(a+c>b)&&(b+c>a)) {
            double kerulet = a + b + c;
            System.out.printf("a haromszog:%.2f", kerulet);
        } else{
            System.out.println("hibas adatotadot mmeg");
        }
    }
}
