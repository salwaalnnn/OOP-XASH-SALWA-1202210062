public class Perangkat {
    //inisiasi variable
    protected String drive;
    protected int ram;
    protected float processor;
    
    //constructor
    Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    
    //method informasi
    public String informasi(){
        String informasi = "Perangkat tidak diketahui memiliki drive tipe "+ drive + " ram sebesar " + ram + " GB dan processor secepat " + processor + " Ghz";
        return informasi;
    }
    
}

