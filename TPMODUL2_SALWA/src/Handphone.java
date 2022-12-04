public class Handphone extends Perangkat {
    protected boolean fingerprint;
    String f_print;
    
    //constructor
    Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    
   public String telfon(int no_hp){
       String informasi = "Handphone berhasil menyambungkan telfon ke No "+no_hp;
       return informasi;
   }
   
   public String kirimSMS(int no_hp){
       String informasi = "Handphone berhasil mengirim SMS ke No "+no_hp;
       return informasi;
   }
   
   public String kirimSMS(int no_hp1, int no_hp2){
       String informasi = "Handphone berhasil mengirim SMS ke No "+ no_hp1 + " dan ke No "+ no_hp2;
       return informasi;
       
   }
    
    @Override
    public String informasi(){
        if(fingerprint == true){
           f_print = "juga memiliki";
        }else {
            f_print = "tidak memiliki";
        }
        
        return "Handphone memiliki drive tipe "+ drive + " ram sebesar "+ ram + " GB dan processor secepat " + processor + " Ghz." +
                "Selain itu handphone ini "+ f_print +" fingerprint";
    }  
}
