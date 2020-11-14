package tema.Clinica;

import java.text.DateFormat;

public class Programare {
    private Pacient pacient;
    private DateFormat data;
    private String tip_serviciu;
    private String status;

    public Programare(Pacient pacient, DateFormat data, String tip_serviciu) {
        this.pacient = pacient;
        this.data = data;
        this.tip_serviciu = tip_serviciu;
        this.status = "in asteptare";
    }

    public Programare() {
    }

    public void modificaStatus(String status) {
        this.status = status;
    }
}
