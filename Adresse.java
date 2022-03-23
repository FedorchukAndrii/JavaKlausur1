import java.util.ArrayList;

public class Adresse {

    public static void main(String[] args) {
        
        ArrayList<Adress> list = new ArrayList<>();

        for (int i = 0; i<5; i++) {
            Adress adress = new Adress("name"+i, "strasse"+i, "ort"+i); 
            list.add(adress);
        }
        
        for (Adress adress : list) {
            System.out.println(adress.toString(adress));
        }

    }

}
