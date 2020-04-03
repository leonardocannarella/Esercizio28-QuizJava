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

    public void caricaDomande() {       //TODO Finisci di scrivere le domande
        domande[0] = "Qual'è la capitale degli Stati Uniti d'America?"; // Risposta: Washington
        domande[1] = "Quando avvenne il Sacco di Roma? "; // Risposta: 410 d.C.
        domande[2] = "Chi inventò la radio?"; // Risposta: Guglielmo Marconi
        domande[3] = "In che anno affondò il Titanic?"; // Risposta: 1912
        domande[4] = ""; // Risposta:
        domande[5] = ""; // Risposta:
        domande[6] = ""; // Risposta:
        domande[7] = "Quando venne fondato la Scuola del Libro di Urbino?"; // Risposta: 1861
        domande[8] = ""; // Risposta:
        domande[9] = "Quale dei seguenti animali appartiene alla famiglia dei Bovidi?"; // Risposta:
    }

    public void caricaRisposteA() {     //TODO Finisci di scrivere le risposte
        risposteA[0] = "Washington";
    }

    public void caricaRisposteB() {     //TODO Finisci di scrivere le risposte
        risposteB[0] = "New York";
    }

    public void caricaRisposteC() {     //TODO Finisci di scrivere le risposte
        risposteC[0] = "California";
    }

    public void caricaRisposteD() {     //TODO Finisci di scrivere le risposte
        risposteD[0] = "Manhattan";
    }

    public void caricaRisposteGiuste() {    //TODO Finisci di scrivere le risposte
        risposteGiuste[0] = risposteA[0];
    }

    public boolean verificaCorretta(String a, int index)
    {
        if(risposteGiuste[index]==a)
            return true;
        else
            return false;
    }

    public String visualizzaDomanda(int index)
    {
        return domande[index];
    }
}