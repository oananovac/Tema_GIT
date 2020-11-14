package tema.Clinica;

import java.util.ArrayList;

public class Medic {
    private String NumeMedic;
    private String PrenumeMedic;
    private String Specialitate;
    private ArrayList<Programare> ListaProgramari;

    public Medic(String numeMedic, String prenumeMedic, String specialitate, ArrayList<Programare> listaProgramari) {
        NumeMedic = numeMedic;
        PrenumeMedic = prenumeMedic;
        Specialitate = specialitate;
        ListaProgramari = listaProgramari;
    }
}
