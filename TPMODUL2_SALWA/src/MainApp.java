public class MainApp {
    public static void main(String[] args) throws Exception {
        // manggil constructor
        Perangkat pr = new Perangkat("HP", 2, (float) 1.00);
        Laptop lp = new Laptop("Macbook Air", 4, (float) 1.00, false);
        Handphone hp = new Handphone("Samsung Z Flip", 8, (float) 1.00, true);
        //print output
        System.out.println(pr.informasi() + "\n");
        System.out.println(lp.informasi());
        System.out.println(lp.bukaGame("Mobile Legend"));
        System.out.println(lp.kirimEmail("niceyuk@gmail.com"));
        System.out.println(lp.kirimEmail("doraemon@gmail.com", "barbie@gmail.com") + "\n");
        System.out.println(hp.informasi());
        System.out.println(hp.telfon(990));
        System.out.println(hp.kirimSMS(665));
        System.out.println(hp.kirimSMS(665, 771));
    }
}
