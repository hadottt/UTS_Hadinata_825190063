package UTS;

import java.util.Scanner;

public class mains {



    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Silahkan Memilih Layanan :");
        System.out.println("1.Ride");
        System.out.println("2.Food");
        System.out.println("3.Send Barang");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();

        switch(pilih){

            case 1:
                System.out.println("Anda memilih menu ride, silahkan memilih tujuan anda");
                System.out.println("1.Home - Untar ");
                System.out.println("2.Untar - Home ");
                System.out.println("3.Untar - CitraLand");
                System.out.println("4.CitraLand - Home");
                System.out.print("Masukkan pilihan : ");
                int pilih1=input.nextInt();
                switch(pilih1){
                    case 1:
                        ride a =new ride("Home","Untar",2000,7);
                        a.rincianride();
                        break;
                    case 2:
                        ride b =new ride("Untar","Home",2000,5);
                        b.rincianride();
                        break;
                    case 3:
                        ride c =new ride("Untar","CitraLand",2000,3);
                        c.rincianride();
                        break;
                    case 4:
                        ride d =new ride("CitraLand","Home",2000,7);
                        d.rincianride();
                        break;
                }
                break;

            case 2:
                System.out.println("Anda memilih menu Food, silahkan pilih makanan anda");
                System.out.println("1.Hotplate Kebi-Kebi");
                System.out.println("2.Soto Samping");
                System.out.println("3.Nasi Warteg");
                System.out.println("4.Kebab Monster");
                System.out.print("Masukkan pilihan : ");
                int pilih2=input.nextInt();
                switch(pilih2){
                    case 1:
                        food a =new food("Hotplate Kebi-Kebi",18000 );
                        a.rincianfood();
                        break;
                    case 2:
                        food b =new food("Soto Samping",8000);
                        b.rincianfood();
                        break;
                    case 3:
                        food c =new food("Nasi Warteg+Ayam",15000);
                        c.rincianfood();
                        break;
                    case 4:
                        food d =new food("Kebab Monster",20000);
                        d.rincianfood();
                        break;
                }
                break;

            case 3:
                System.out.println("Anda memilih menu send, silahkan pilih jenis paket anda");
                System.out.println("1.Barang Elektronik");
                System.out.println("2.Barang Organik");
                System.out.println("3.Barang Non-Organik");
                System.out.println("4.Barang Pecah-Belah");
                System.out.println("Harga berat perkilo adalah Rp 2000 serta Jarak perKM adalah Rp 1000");
                System.out.print("Masukkan pilihan : ");
                int pilih3=input.nextInt();
                switch(pilih3){
                    case 1:
                        send a =new send("Barang Elektronik",5.1,1.28);
                        a.rinciansend();
                        break;
                    case 2:
                        send b =new send("Barang Organik",5.2,2);
                        b.rinciansend();
                        break;
                    case 3:
                        send c =new send("Barang Non-Organik",5.3,3.5);
                        c.rinciansend();
                        break;
                    case 4:
                        send d = new send("Barang Pecah Belah",5.4,5);
                        d.rinciansend();
                        break;
                }
        }
    }
}

