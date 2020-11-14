package tema.Clinica;
import java.util.ArrayList;

class Clinica {

    private static Clinica single_instance = null;
    private ArrayList<Medic> medici;
    private ArrayList<Pacient> pacienti;

    private Clinica() {
        medici = new ArrayList<>();
        pacienti = new ArrayList<>();
    }

    public void adaugareMedic( Medic m) {
        medici.add(m);
    }

    public void adaugarePacient( Pacient p ) { pacienti.add(p); }

    public static Clinica getInstance(){
        if (single_instance == null)
            single_instance = new Clinica();

        return single_instance;
    }


}
