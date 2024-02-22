package Adapter;

import java.time.LocalDate;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Info info = new Info();
        info.setNome("Lorenzo");
        info.setCognome("Rossi");
        info.setDataDiNascita(LocalDate.of(2003,01,23));

        InfoAdapter infoAdapter = new InfoAdapter(info);

        UserData userData = new UserData();

        userData.setData(infoAdapter);

        System.out.println("Nome Completo: "  + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}
