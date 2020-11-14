package tema.Clinica;
import java.util.ArrayList;

public class Clinica {
    private ArrayList<Medic> medici;
    private ArrayList<Pacient> pacienti;

    public Clinica() {
        medici = new ArrayList<>();
        pacienti = new ArrayList<>();
    }

    public void adaugareMedic( Medic m) {
        medici.add(m);
    }

    public void adaugarePacient( Pacient p ) { pacienti.add(p); }

}
