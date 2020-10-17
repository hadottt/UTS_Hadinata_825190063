package UTS;

public class ride {
    String tujuan;
    String lokasi;
    int jarak;
    int biaya;
    int total;
    int biayaservice=2500;

    public ride (String lokasiawal,String lokasitujuan,int biayaride,int totaljarak){
        this.tujuan = lokasitujuan;
        this.lokasi = lokasiawal;
        this.jarak =totaljarak;
        this.biaya = biayaride;

        total = (biaya*jarak)+biayaservice;
    }
    void  rincianride(){
        System.out.println("Lokasi Awal         :   "  +lokasi);
        System.out.println("Lokasi Tujuan       :   "  +tujuan);
        System.out.println("Biaya Service       :   Rp. 2500"  );
        System.out.println("Biaya Total         :   Rp. "  +total);
    }
}

