package ChainOfResponsibility;

public class Tenente extends UfficialeBase{
    private static final int STIPENDIO = 1000;

    @Override
    public void verificaStipendio(int importo) {
        if (importo >= STIPENDIO) {
            System.out.println("Il tenente percepisce almeno " + importo + " di stipendio.");
        } else if (successore != null) {
            successore.verificaStipendio(importo);
        }
    }
}
