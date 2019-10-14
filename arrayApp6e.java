/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava1_0043;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Aspire
 */
public class arrayApp6e {

    public static void main(String[] args) {
        byte tujuan;
        int ongkosarray[] = {2500, 4000, 3000};
        int jarakarray[] = {169, 452, 234};
        String kotaarray[] = {"Surabaya", "Bandung", "Malang",""};

        int ongkoskirim1 = 0;
        int ongkoskirim2 = 0;
        int ongkoskirim3 = 0;

        int ongkoskirimfix = 0;

        int total = 0;
        int jarakfix = 0;
          
        String inputbaru = "";
        String gantiongkos = "";

        Scanner inputtujuan = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);

        do {
            System.out.println("-----------------------------------");
            System.out.println("-          Perusahaan             -");
            System.out.println("-    Ekspedisi Lorena Malang      -");
            System.out.println("-----------------------------------");
            System.out.println("            List Tujuan            ");
            System.out.println("-----------------------------------");
            System.out.println("1. Surabaya (Jarak 169 km) ongkos kirim per km Rp 2500");
            System.out.println("2. Bandung (Jarak 452 km) ongkos kirim per km Rp 4000");
            System.out.println("3. Malang (Jarak 234 km) ongkos kirim per km Rp 3000");
            System.out.println("-----------------------------------");

            System.out.print("Pilih tujuan(1,2,atau 3) = ");
            tujuan = inputtujuan.nextByte();

           
            switch(tujuan){
            case 1:
                
                break;
            case 2:
                
                break;
                case 3:
                
                break;
            default:
                System.out.println("Pilihan Anda Tidak ada Lur !");
                break;
            
        }
            int ongkos = ongkosarray[tujuan - 1];
           int jarak = jarakarray[tujuan - 1];
           String kota = kotaarray[tujuan-1];
 //kota = kotaarray[tujuan - 1];
           total = ongkosarray[tujuan - 1] * jarakarray[tujuan - 1];
           jarakfix = jarakarray[tujuan - 1];
           ongkoskirimfix = ongkosarray[tujuan - 1];
          
           
            
            

            System.out.println("Anda Memilih Kota = " + kota);
            System.out.println("Ongkos Kirim = Rp." + ongkoskirimfix);
            System.out.println("Jarak Pengiriman = " + jarakfix);
            gantiongkos = NumberFormat.getNumberInstance(Locale.US).format(total);
            gantiongkos = gantiongkos.replace(',', '.');
            System.out.println("Rincian Biaya = " + jarakfix + " * " + ongkoskirimfix + " = Rp." + gantiongkos);

               //System.out.println("Biaya Pengiriman : 452 x 4000= Rp."+gantiongkos);
            System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");

            inputbaru = dialogbaru.next();
        } while (!inputbaru.equals("t"));

        System.out.println("Terimakasih!");
    }
    
    
}
