package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonello colonnello = new Colonello();
        Generale generale = new Generale();

        tenente.setSuccessore(capitano);
        capitano.setSuccessore(maggiore);
        maggiore.setSuccessore(colonnello);
        colonnello.setSuccessore(generale);

        int importoDaVerificare = 2500;
        System.out.println("Verifica dello stipendio per almeno " + importoDaVerificare + ":");
        tenente.verificaStipendio(importoDaVerificare);
    }
}
