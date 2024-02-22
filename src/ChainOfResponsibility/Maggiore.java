package ChainOfResponsibility;

public class Maggiore extends UfficialeBase{
    private static final int STIPENDIO = 3000;

    @Override
    public void verificaStipendio(int importo) {
        if (importo >= STIPENDIO) {
            System.out.println("Il maggiore percepisce almeno " + importo + " di stipendio.");
        } else if (successore != null) {
            successore.verificaStipendio(importo);
        }
    }
}
