package tema.Clinica;

import java.util.ArrayList;

public class Medic {
    private String NumeMedic;
    private String PrenumeMedic;
    private String Specialitate;
    private ArrayList<Programare> ListaProgramari;

    public Medic(String numeMedic, String prenumeMedic, String specialitate) {
        NumeMedic = numeMedic;
        PrenumeMedic = prenumeMedic;
        Specialitate = specialitate;
        ListaProgramari = new ArrayList<>();
    }

    public void adaugaProgramare(Programare p){
        ListaProgramari.add(p);
    }

    public void modificareStatus(Programare p, String status){
        p.modificaStatus(status);
    }
}
