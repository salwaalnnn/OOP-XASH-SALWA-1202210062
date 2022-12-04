public class Laptop extends Perangkat{
    protected boolean webcam;
    String webcam0;

    //constructor
    Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    
    public String bukaGame(String nama_game){
        String informasi = ("Laptop berhasil membuka game "+ nama_game);
        return informasi;
    }
    
    public String kirimEmail(String email){
        String informasi = ("Laptop berhasil mengirim email ke "+ email);
        return informasi;
    }
    
    public String kirimEmail(String email1, String email2){
        String informasi = ("Laptop berhasil mengirim email "+ email1+" dan ke "+email2);
        return informasi;
    }
    
    @Override
    public String informasi(){
        if(webcam == true){
           webcam0 = "juga memiliki";
        }else{
            webcam0 = "TIDAK cmemiliki";
        }
        
        return "Laptop ini memiliki drive tipe "+drive+" ram sebesar "+ram+" GB dan processor secepat "+processor+" Ghz."+
                " Selain itu Laptop ini "+ webcam0 +" webcam";
    }
}
