package ChainOfResponsibility;

public class Colonello extends UfficialeBase{
    private static final int STIPENDIO = 4000;

    @Override
    public void verificaStipendio(int importo) {
        if (importo >= STIPENDIO) {
            System.out.println("Il colonnello percepisce almeno " + importo + " di stipendio.");
        } else if (successore != null) {
            successore.verificaStipendio(importo);
        }
    }
}
