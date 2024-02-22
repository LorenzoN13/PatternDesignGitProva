package Composite;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Autore autore1 = new Autore("Autore 1");
        Autore autore2 = new Autore("Autore 2");

        Pagina pagina1 = new PaginaSemplice();
        Pagina pagina2 = new PaginaSemplice();
        Pagina pagina3 = new PaginaSemplice();
        Pagina pagina4 = new PaginaSemplice();


        Sezione sezione1 = new Sezione(1);
        Sezione sezione2 = new Sezione(2);


        sezione1.aggiungiPagina(pagina1);
        sezione1.aggiungiPagina(pagina2);
        sezione2.aggiungiPagina(pagina3);
        sezione2.aggiungiPagina(pagina4);


        Libro libro = new Libro();

        libro.aggiungiPagina(sezione1);
        libro.aggiungiPagina(sezione2);


        libro.aggiungiAutore(autore1);
        libro.aggiungiAutore(autore2);


        libro.setPrezzo(29.99);


        System.out.println("Numero totale di pagine del libro: " + libro.numeroPagineTotali());
        System.out.println("Autori del libro:");

        List<Autore> autoriDelLibro = libro.getAutori();

        for (Autore autore : autoriDelLibro) {
            System.out.println("- " + autore.getNome());
        }
        System.out.println("Prezzo del libro: $" + libro.getPrezzo());

        System.out.println("Contenuto del libro:");
        libro.stampaLibro();
    }
}
