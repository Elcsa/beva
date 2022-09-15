package bevaa;

import java.util.Scanner;

public class feladat1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("kérem adja meg a medence atmerojét meterbe:");
        double atmero= sc.nextDouble();
        System.out.print("kerem adja meg a medence melyseget meterbe");
        double melyseg= sc.nextDouble();
        double sugar=atmero/2;
        double alapterulet=sugar*sugar*Math.PI;
        double terfogat=alapterulet*melyseg;
        System.out.printf("a medence %.2f kobmeter viz fer",terfogat);
    }
}
