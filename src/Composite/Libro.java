package Composite;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private List<Pagina> pagine;
    private List<Autore> autori;
    private double prezzo;

    public Libro(){
        pagine = new ArrayList<>();
        autori = new ArrayList<>();
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void aggiungiPagina(Pagina pagina){
        pagine.add(pagina);
    }

    public void aggiungiAutore(Autore autore){
        autori.add(autore);
    }

    public int numeroPagineTotali(){
        int numeroPagine = 0;

        for (Pagina pagina : pagine){
            numeroPagine += pagina.numeroPagine();
        }
        return numeroPagine;
    }

    public void stampaPaginaSingola(int numeroPagina){
        if (numeroPagina > 1 && numeroPagina <= pagine.size()){
            Pagina pagina = pagine.get(numeroPagina - 1);

            pagina.stampa();
        } else {
            System.out.println("La pagina richiesta non esiste nel libro.");
        }
    }

    public void stampaLibro(){
        for (Pagina pagina : pagine){
            pagina.stampa();
        }
    }

    public void stampaSezione(int numeroSezione){
        for (Pagina pagina : pagine) {
            if (pagina instanceof Sezione && ((Sezione) pagina).getNumeroSezione() == numeroSezione) {
                pagina.stampa();
            }
        }
    }
    public List<Autore> getAutori() {
        return autori;
    }
}
