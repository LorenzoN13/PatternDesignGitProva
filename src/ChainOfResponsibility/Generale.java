package ChainOfResponsibility;

public class Generale extends UfficialeBase{
    private static final int STIPENDIO = 5000;

    @Override
    public void verificaStipendio(int importo) {
        if (importo >= STIPENDIO) {
            System.out.println("Il generale percepisce almeno " + importo + " di stipendio.");
        } else {
            System.out.println("Nessun ufficiale percepisce almeno " + importo + " di stipendio.");
        }
    }
}
