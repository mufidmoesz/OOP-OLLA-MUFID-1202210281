package MODUL2_MUFID;

public class Kapal extends TransportasiAir {
    protected String mesin;

    //constructor
    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi() {
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah "+jumlahKursi+" ditetapkan dengan biaya sebesar Rp. "+biaya);
    }
    public void berlayar() {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan "+mesin+" dengan kecepatan yang tidak stabil");
    }
    
    public void berlayar(int kecepatan) {
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan "+mesin+" dengan kecepatan "+kecepatan+" knot");
    }
    public void berlabuh() {
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai\n");
    }
}
