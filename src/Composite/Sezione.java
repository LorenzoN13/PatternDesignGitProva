package Composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione extends Pagina{
    private List<Pagina> pagine;
    private int numeroSezione;

    public Sezione(int numeroSezione) {
        this.numeroSezione = numeroSezione;
        pagine = new ArrayList<>();
    }

    public void aggiungiPagina(Pagina pagina) {
        pagine.add(pagina);
    }

    public int getNumeroSezione() {
        return numeroSezione;
    }


    @Override
    int numeroPagine() {
        int numeroPagine = 0;
        for (Pagina pagina : pagine) {
            numeroPagine += pagina.numeroPagine();
        }
        return numeroPagine;
    }

    @Override
    void stampa() {
        System.out.println("Contenuto della sezione " + numeroSezione);
        for (Pagina pagina : pagine) {
            pagina.stampa();
        }
    }
}
