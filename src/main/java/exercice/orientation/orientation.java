package exercice.orientation;

public class orientation {

    public  static String tourner(int i) {
        String resultat="Nord";
        switch (i) {
            case 1: resultat="Est";
            break;
            case 2: resultat="Sud";
            break;
            case 3: resultat="Ouest";
            break;
            case 4: resultat="Nord";
            default: resultat="Nord";
        }
        return resultat;
    }
}
