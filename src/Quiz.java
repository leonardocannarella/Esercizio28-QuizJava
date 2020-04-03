public class Quiz //di cultura generale
{
    private String nome;
    private String domande[];
    private String risposteA[], risposteB[], risposteC[], risposteD[];
    private String risposteGiuste[];

    public Quiz()
    {
        setNome("Giocatore");
        setDomande();
    }

    public void setNome(String nome)
    {
        this.nome = nome;
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

    public void caricaDomande() {       /
        domande[0] = "Qual'è la capitale degli Stati Uniti d'America?"; // Risposta: Washington
        domande[1] = "Quando avvenne il Sacco di Roma? "; // Risposta: 410 d.C.
        domande[2] = "Nel 1901, chi effettuò la prima trasmissione radio?"; // Risposta: Guglielmo Marconi
        domande[3] = "In che anno affondò il Titanic?"; // Risposta: 1912
        domande[4] = "Che azione compie la combinazione di tasti CTRL+Y"; // Risposta: Ripristina modifica
        domande[5] = "Qual è il simbolo del Magnesio?"; // Risposta: Mg
        domande[6] = "Qual è il nome del servitore di Robinson Crusoe?"; // Risposta: Venerdì
        domande[7] = "Quando venne fondato la Scuola del Libro di Urbino?"; // Risposta: 1861
        domande[8] = "In un giorno di 24 ore (compresa la ventiquattresima), quante volte si sovrappongono la lancetta delle ore e dei minuti in un orologio?"; // Risposta: 22
        domande[9] = "Quale dei seguenti animali appartiene alla famiglia dei Bovidi?"; // Risposta: Muflone
    }

    public void caricaRisposteA() {
        risposteA[0] = "Washington";
        risposteA[1] = "410 a.C.";
        risposteA[2] = "Nicolas Tesla";
        risposteA[3] = "1912";
        risposteA[4] = "Corsivo";
        risposteA[5] = "Mg";
        risposteA[6] = "Mercoledì";
        risposteA[7] = "1902";
        risposteA[8] = "23";
        risposteA[9] = "Balena";
    }

    public void caricaRisposteB() {
        risposteB[0] = "New York";
        risposteB[1] = "607 a.C.";
        risposteB[2] = "Guglielmo Marconi";
        risposteB[3] = "1914";
        risposteB[4] = "Grassetto";
        risposteB[5] = "M";
        risposteB[6] = "Martedì";
        risposteB[7] = "1861";
        risposteB[8] = "22";
        risposteB[9] = "Elefante";
    }

    public void caricaRisposteC() {
        risposteC[0] = "California";
        risposteC[1] = "410 d.C.";
        risposteC[2] = "Thomas Edison";
        risposteC[3] = "1899";
        risposteC[4] = "Annulla modifica";
        risposteC[5] = "Ma";
        risposteC[6] = "Venerdì";
        risposteC[7] = "1917";
        risposteC[8] = "12";
        risposteC[9] = "Cinghiale";
    }

    public void caricaRisposteD() {
        risposteD[0] = "Manhattan";
        risposteD[1] = "607 d.C.";
        risposteD[2] = "George Westinghouse";
        risposteD[3] = "1975";
        risposteD[4] = "Ripristina modifica";
        risposteD[5] = "Ms";
        risposteD[6] = "Lunedì";
        risposteD[7] = "1933";
        risposteD[8] = "24";
        risposteD[9] = "Muflone";
    }

    public void caricaRisposteGiuste() {
        risposteGiuste[0] = risposteA[0];
        risposteGiuste[1] = risposteC[1];
        risposteGiuste[2] = risposteB[2];
        risposteGiuste[3] = risposteA[3];
        risposteGiuste[4] = risposteD[4];
        risposteGiuste[5] = risposteA[5];
        risposteGiuste[6] = risposteC[6];
        risposteGiuste[7] = risposteB[7];
        risposteGiuste[8] = risposteB[8];
        risposteGiuste[9] = risposteD[9];
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