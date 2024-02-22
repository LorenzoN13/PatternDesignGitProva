package ChainOfResponsibility;

public interface Ufficiale {
    void setSuccessore(Ufficiale successore);
    void verificaStipendio(int importo);
}
