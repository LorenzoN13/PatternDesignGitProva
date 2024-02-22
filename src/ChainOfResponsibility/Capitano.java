package ChainOfResponsibility;

public class Capitano extends UfficialeBase{
    private static final int STIPENDIO = 2000;

    @Override
    public void verificaStipendio(int importo) {
        if (importo >= STIPENDIO) {
            System.out.println("Il capitano percepisce almeno " + importo + " di stipendio.");
        } else if (successore != null) {
            successore.verificaStipendio(importo);
        }
    }
}
