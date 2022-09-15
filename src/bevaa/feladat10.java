package bevaa;

import java.util.Scanner;

public class feladat10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oszeg=0;
        int paros=0;
        int paratlan=0;

        System.out.println("kerem adjonmeg egesz szamokat: ");
        while (oszeg<=100){
            int szam=sc.nextInt();
            oszeg+=szam;
            if (szam%2==0){
                paros++;
            }else{
                paratlan++;
            }
        }
        System.out.printf("a megadot szamok kozul %d volt paros es %d volt paratlan",paros,paratlan);
    }
}
