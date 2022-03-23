public class Gruess {
     
    public static void main(String[] args) {
        String[] gruesse = {"Hallo", "Guten Tag", "Servus", "Moin Moin"};

        int x = (int) (Math.random()*4);  

        System.out.println(gruesse[x]);
    }
}