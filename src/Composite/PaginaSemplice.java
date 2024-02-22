package Composite;

public class PaginaSemplice extends Pagina{
    @Override
    int numeroPagine() {
        return 1;
    }

    @Override
    void stampa() {
        System.out.println("Contenuto della pagina semplice");
    }
}
