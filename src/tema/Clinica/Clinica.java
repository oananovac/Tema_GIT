package tema.Clinica;
import java.util.ArrayList;

public class Clinica {
    private ArrayList<Medic> medici;

    public Clinica() {
        medici = new ArrayList<>();
    }

    public Clinica(ArrayList<Medic> medici) {
        this.medici = medici;
    }

    public void addMedic( Medic m) {
        medici.add(m);
    }

}
