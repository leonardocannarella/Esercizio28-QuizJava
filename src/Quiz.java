public class Quiz //di cultura generale
{
    private String domande[];
    private String risposteA[], risposteB[], risposteC[], risposteD[];
    private String risposteGiuste[];

    public Quiz()
    {
        setDomande();
    }

    public void setDomande() {
        this.domande = new String[10];
            caricaDomande();
        this.risposteA = new String[10];
            caricaRisposteA();
        this.risposteB = new String[10];
            caricaRisposteB();
        this.risposteC = new String[10];
            caricaRisposteC();
        this.risposteD = new String[10];
            caricaRisposteD();
        this.risposteGiuste = new String[10];
            caricaRisposteGiuste();
    }

    public void caricaDomande() {
        domande[0] = "Qual'è la capitale degli Stati Uniti d'America?"; //TODO Risposta: Washington
        domande[1] = "Quando avvenne il Sacco di Roma? "; //TODO Risposta: 410 d.C.
        domande[2] = "Chi inventò la radio?"; //TODO Risposta: Guglielmo Marconi
        domande[3] = "In che anno affondò il Titanic?"; //TODO Risposta: 1912
        domande[4] = ""; //TODO Risposta:
        domande[5] = ""; //TODO Risposta:
        domande[6] = ""; //TODO Risposta:
        domande[7] = "Quando venne fondato la Scuola del Libro di Urbino?"; //TODO Risposta: 1861
        domande[8] = ""; //TODO Risposta:
        domande[9] = "Quale dei seguenti animali appartiene alla famiglia dei Bovidi?";
    }

    public void caricaRisposteA() {
        risposteA[0] = "Washington";
    }

    public void caricaRisposteB() {
        risposteB[0] = "New York";
    }

    public void caricaRisposteC() {
        risposteC[0] = "California";
    }

    public void caricaRisposteD() {
        risposteD[0] = "Manhattan";
    }

    public void caricaRisposteGiuste() {
        risposteGiuste[0] = risposteA[0];
    }
}