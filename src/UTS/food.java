package UTS;

public class food {

    String nama;
    int biayaservice = 3000;
    int harga,total;



    food(String Makanan,int HargaMakan ){
        this.harga=HargaMakan;
        this.nama =Makanan;


        total=biayaservice+harga;
    }


    void rincianfood(){
        System.out.println("Makanan Pilihan Anda    :  "+nama);
        System.out.println("Biaya Service           :  Rp. 3000 ");
        System.out.println("Total Biaya             :  Rp. "+total);
    }
}