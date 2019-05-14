package tugas01;

import java.util.Scanner;

/**
 *
 * @author Arif
 */
public class Tugas01 {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int[] nilai = new int[7];
        int kecil=999,besar=0,jumlah=0;
		
        for (int i=1; i<=nilai.length; i++)
        {
          System.out.print("Masukkan Praktikum ke-"+i+" = ");
          nilai[i-1] = inputUser.nextInt();
		  
          if(nilai[i-1]<kecil)
              kecil=nilai[i-1];
		  
          if(nilai[i-1]>besar)
              besar=nilai[i-1];
		  
          jumlah+=nilai[i-1];

        }
        float rata=jumlah/nilai.length;
	
        System.out.println(" ");
        System.out.println("Rata-rata nilai praktikum anda adalah: "+rata);
        System.out.println("Nilai tertinggi anda adalah: "+besar);
        System.out.println("Nilai terrendah anda adalah: "+kecil);
        
		
        for (int i=1; i<=nilai.length; i++)
        {  
          System.out.print(nilai[i-1]+" ");
        }
        System.out.println(" ");
    }
    
}
