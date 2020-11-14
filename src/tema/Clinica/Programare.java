package tema.Clinica;

import java.text.DateFormat;

public class Programare {
    private Pacient pacient;
    private DateFormat data;
    private String tip_serviciu;

    public Programare(Pacient pacient, DateFormat data, String tip_serviciu) {
        this.pacient = pacient;
        this.data = data;
        this.tip_serviciu = tip_serviciu;
    }

    public Programare() {
    }
}
