package bevaa;

import java.util.Scanner;

public class feladat8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("fej vagy iras? (0-fej 1-iras)");
        int tipp= sc.nextInt();
        int dobas=(int)(Math.random()*2);
        /* egesz szam generalasa min es max kozott
        (int)(Math.random()*(max-min+1))+min
         */
        System.out.printf("dobas eredmenye:%s",dobas==0?"fej":"iras");
        /*haromlabu operator:
        (logikai feltetel)? ertekha a feltetel igaz:ertek ha feltetel hamis
         */
        if (dobas==tipp){
            System.out.println("gratulalok on nyert");
        }else{
            System.out.println("most nem nyert probalkozon ujra");
        }
    }
}
