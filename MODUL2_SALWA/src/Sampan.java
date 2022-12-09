public class Sampan extends TransportasiAir{
    protected int layar;
    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi air jenis tidak diketahui dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp." + biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi air dengan jenis yng tidak diketahui sedang berlayar menggunakan" + layar + "layar");
    }
    public void berlabuh(){
        System.out.println("Transportasi air dengan jenis yng tidak diketahui sedang berlabuh di pantai tanpa jankar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi air dengan jenis yng tidak diketahui sedang berlabuh di pantai menggunakan" + jangkar + "jankar");
    }

    
}
