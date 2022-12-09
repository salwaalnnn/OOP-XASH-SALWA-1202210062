public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir pr = new TransportasiAir(4,20000,);
        pr.informasi();
        pr.berlayar();
        pr.berlabuh();
        Kapal lp = new Kapal(20,50000,2);
        lp.informasi();
        lp.berlayar();
        lp.berlabuh();
        Sampan hp = new Sampan(100000,20);
        hp.informasi();
        hp.berlayar();
        hp.berlabuh();
    }
}
