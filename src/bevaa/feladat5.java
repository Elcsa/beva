package bevaa;

import java.util.Scanner;

public class feladat5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("kerem adja meg az A oldalt");
        double a =sc.nextDouble();
        sc.nextLine();
        System.out.print("kerem adja meg az b oldalt");
        double b =Double.parseDouble(sc.nextLine());
        System.out.print("kerem adja meg az elvegyendo muveletet(k-kerulet t-terulet)");
        String muvelet=sc.nextLine();
        if (muvelet.equals("k")){
            double kerulet=2*(a+b);
            System.out.printf("a teglalap kerulete %f centimeter",kerulet);
        } else if (muvelet.equals("t")) {
            double terulet=a*b;
            System.out.printf("a teglalap terulete %f centimeter",terulet);
        }else{
            System.out.println("rosz muveletet adot meg");
        }
        if (a==b){
            System.out.println("ez egy negyzet");
        }
    }
}
