package tema.Clinica;


import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        Clinica c= Clinica.getInstance();

        Medic m1 = new Medic("Achim","Liviu", "medicina de familie");
        Medic m2 = new Medic("Gavrila", "Magdalena","dermatologie");

        Pacient p1 = new Pacient("Novac","Oana",22);
        Pacient p2 = new Pacient("Frincu","Andreea",22);

        SimpleDateFormat d = new SimpleDateFormat ("2012-01-31");

        Programare pr1 = new Programare(p1,d,"consultatie gripa");
        Programare pr2 = new Programare(p2,d,"dermacosmetica");

        m1.adaugaProgramare(pr1);
        m2.adaugaProgramare(pr2);

        c.adaugareMedic(m1);
        c.adaugareMedic(m2);
        c.adaugarePacient(p1);
        c.adaugarePacient(p2);
        
    }
}
