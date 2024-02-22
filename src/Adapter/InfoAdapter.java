package Adapter;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class InfoAdapter implements DataSource{
    private Info info;

    public InfoAdapter(Info info){
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {

        LocalDate oggi = LocalDate.now();
        LocalDate dataDiNascita = info.getDataDiNascita();
        Period differenza = Period.between(dataDiNascita, oggi);
        int eta = differenza.getYears();

        return eta;
    }
}
