public static void main (String[]args) throws IOException{
  
        byte tujuan;
        int jrkpilihan = 0;
        int hrgpilihan = 0;
        int totalbayar=0;
        int hrgbrtbrg =6000;
        
        
        double beratbrg =0;
        double totalbrtbrg=0;
        double subtotal = 0;
        double diskon = 0;
        double hrgdiskon=0;
        double totalfix=0;
        
         String inputbaru = "";
         String inputbarubrg = "";
        String gantiongkostotbayar = "";
        String gantisubtotal = "";
        String gantitotalfix = "";
        String gantibrtbrg = "";
        String gantidiskon = "";
        String kotapilihan="";
       
        
       do{ 
         String kota [][]={
            {"1","SURABAYA","169","2500"},
                            {"2","BANDUNG","452","4000"},
                            {"3","SEMARANG","300","4500"},
                            {"4","BOGOR","350","5000"},
                            {"5","SALATIGA","250","5500"},
                            {"6","DENPASAR","500","6000"},
        };
        System.out.println((char)27+"[01;35m--------------------------------------------------"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;31m-          Perusahaan             -"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;31m-    Ekspedisi Lorena Malang      -"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;35m--------------------------------------------------"+(char)27+"[00;00m");
        System.out.println((char)27+"[01;34m Kode    | TUJUAN     |  jarak/km  | ONGKIR/km  "+(char)27+"[00;00m");
        System.out.println((char)27+"[01;35m--------------------------------------------------"+(char)27+"[00;00m");

       
        
        for (int baris = 0;baris < 6;baris++){
            for(int kolom = 0;kolom < 4;kolom++){
                System.out.print(kota[baris][kolom]+" - ");
            }
            System.out.println("");
        }
        
        Scanner inputtujuan = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);// input transaksi baru
        Scanner dialogberatbaru = new Scanner(System.in);// input transaksi berat barang baru
        
       System.out.print("Pilih Tujuan : ");
       tujuan = inputtujuan.nextByte();
        
       switch(tujuan){
           case 1:
               break;
               
           case 2:
               break;
               
           case 3:
               break;
               
           case 4:
               break;
               
           case 5:
               break;
               
           case 6:
               break;
            default:
                System.out.println("Pilihan Anda Tidak ada Lur !");
                break;
            
        }
       
        //ambil data array
        //kota[baris][kolom]
        kotapilihan = kota[tujuan-1][1];
        jrkpilihan = Integer.parseInt(kota[tujuan-1][2]);
        hrgpilihan = Integer.parseInt(kota[tujuan-1][3]);
        
        totalbayar = hrgpilihan * jrkpilihan;//total bayar jarak
        
        gantiongkostotbayar = NumberFormat.getNumberInstance(Locale.US).format(totalbayar);
           gantiongkostotbayar = gantiongkostotbayar.replace(',', '.');
        //report
        System.out.println("-------------------------------------");
        System.out.println("Anda Memilih       : " + kotapilihan);
        System.out.println("Biaya Pengiriman   : " + jrkpilihan + " km * " + hrgpilihan);
        System.out.println("                   : Rp." + gantiongkostotbayar);
        System.out.println("-------------------------------------");
    
        do{
            Scanner inputberatbrg = new Scanner(System.in);
        
        
        System.out.print("Masukkan Berat Barang(tarif per kg Rp.6000)(kg) :");
        beratbrg = inputberatbrg.nextDouble();
        
        
        totalbrtbrg=beratbrg*hrgbrtbrg;// total berat barang
        
        gantibrtbrg = NumberFormat.getNumberInstance(Locale.US).format(totalbrtbrg);
           gantibrtbrg = gantibrtbrg.replace(',', '.');
           
        System.out.println("-------------------------------------");
        System.out.println("Berat Barang          : " + beratbrg+" kg");
        System.out.println("Biaya Berat Barang    : " + beratbrg+" kg * "+hrgbrtbrg);
        System.out.println("                      : " + gantibrtbrg);
        System.out.println("-------------------------------------");
        
        subtotal = totalbayar+totalbrtbrg;
        gantisubtotal = NumberFormat.getNumberInstance(Locale.US).format(subtotal);
           gantisubtotal = gantisubtotal.replace(',', '.');
        
        System.out.println("Total Sementara       : " + gantiongkostotbayar+" + "+gantibrtbrg);
        System.out.println("                      : Rp." + gantisubtotal);
        System.out.println("---------------------------------------------");
        System.out.println("|  NB : Diskon 5% Untuk total > Rp. 750000  |");
        System.out.println("---------------------------------------------");
        
        
        if (subtotal>750000){
            diskon = 0.05;
            System.out.println("++++|||||||||||||||||||||||||||||||||||+++++");
            System.out.println("+   Selamat Anda Mendapat Diskon 5% Lur    +");
            System.out.println("++++|||||||||||||||||||||||||||||||||||+++++");
        }else{
            diskon = 0;
             System.out.println("++++++|||||||||||||||||||||||||||++++++++");
             System.out.println("+        Anda Ti Dapat Diskon ee        +");
             System.out.println("++++++|||||||||||||||||||||||||||++++++++");
        }
        hrgdiskon = diskon * subtotal;
        totalfix = subtotal-hrgdiskon;
        
        gantidiskon = NumberFormat.getNumberInstance(Locale.US).format(hrgdiskon);
           gantidiskon = gantidiskon.replace(',', '.');
        
        gantitotalfix = NumberFormat.getNumberInstance(Locale.US).format(totalfix);
           gantitotalfix = gantitotalfix.replace(',', '.');
        
        System.out.println("Diskon                  : Rp."+gantidiskon);
        System.out.println("Grand Total             : "+gantisubtotal+" - "+gantidiskon);
        System.out.println("                        : Rp." + gantitotalfix);
        
        System.out.print("Apakah Anda Ingin Input Berat Barang Baru ? y/t = ");
        inputbarubrg = dialogberatbaru.next();
        }while(!inputbarubrg.equals("t"));
    System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");
        
        inputbaru = dialogbaru.next();
        }while(!inputbaru.equals("t"));

        System.out.println((char)27+"[01;35mTERIMAKASIEEHH !"+(char)27+"[00;00m");
         
    
    }
    
    
public static void clrscr(){
    //Clears Screen in java
    try {

  if( System.getProperty( "os.name" ).startsWith( "Window" ) ) {
      Process exitCode = Runtime.getRuntime().exec("cls");
  } else {
      Process exitCode = Runtime.getRuntime().exec("clear");
  }


} catch (IOException e) {

  for(int i = 0; i < 500; i++) {
    System.out.println();
  }

}
}
}
