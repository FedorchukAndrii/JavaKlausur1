public class MetallPlatte {
    double laenge; 
    double breite;
    double flaeche = laenge*breite;

    public MetallPlatte(double d, double e) {
        this.laenge = d;
        this.breite = e;
    }

    public double berechneFlaeche () {
        double flaeche = this.breite * this.laenge;

        return flaeche;
    }

    public void vergleicheMit(MetallPlatte platte){
        if (this.berechneFlaeche() > platte.berechneFlaeche()) {
            System.out.println("größer als");
        } else if (this.flaeche < platte.berechneFlaeche()) {
            System.out.println("kleiner als");
        } else {
            System.out.println("gleich");
        }
    }
    
}
