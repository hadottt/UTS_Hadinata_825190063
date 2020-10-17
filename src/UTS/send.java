package UTS;

public class send {
    String nama;
    double jarak,berat,biaya;

    send (String namabarang,double jarakpengiriman,double beratbarang){
        this.nama = namabarang;
        this.berat= beratbarang;
        this.jarak = jarakpengiriman;

        biaya=(berat*2000)+(jarak*1000)+4000;
    }

    void rinciansend (){
        System.out.println("Jenis Barang         :      "+nama);
        System.out.println("Berat Barang         :      "+berat+" kg");
        System.out.println("Jarak Pengiriman     :      "+jarak+" km");
        System.out.println("Biaya service        :      Rp. 4000      ");
        System.out.println("Biaya Total          :      Rp. "+biaya);
    }
}
