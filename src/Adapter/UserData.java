package Adapter;

public class UserData {
    public String nomeCompleto;
    public int eta;

    private String cognome;
    private DataSource dataSource;

    public void getData(DataSource dS){
        nomeCompleto = dS.getNomeCompleto();
        eta = dS.getEta();
    }

    public String getNomeCompleto() {
        return dataSource.getNomeCompleto();
    }

    public int getEta() {
        return dataSource.getEta();
    }

    public void setData(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
