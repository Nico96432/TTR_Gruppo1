
package ttr_gruppo1;

public class Carta {
    
//CartaTreno
        private String colore;
        private boolean jolly;
//CartaObbiettivo
        private String inizio;
        private String fine;
        private int punteggio;

    
    public Carta(){
    }
    
    public Carta(String colore,int punteggio){
        this.colore=colore;
        this.punteggio=punteggio;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public String getInizio() {
        return inizio;
    }

    public void setInizio(String inizio) {
        this.inizio = inizio;
    }

    public String getFine() {
        return fine;
    }

    public void setFine(String fine) {
        this.fine = fine;
    }

    public String isJolly() {
        if(jolly=true)
        return "jolly";
        else return "non è un jolly";
    }
    
    

    }