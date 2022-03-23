public class Adress {
    private String name;
    private String strasse; 
    private String ort;


    public Adress(String name, String strasse, String ort) {
        this.name = name;
        this.strasse = strasse;
        this.ort = ort;
    }


    public String getName() {
        return name;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getOrt() {
        return ort;
    }

    public String toString(Adress adress){
        String drei =  adress.name + "  " + adress.ort + "  " + adress.strasse;
        return drei;
    }
       
}
