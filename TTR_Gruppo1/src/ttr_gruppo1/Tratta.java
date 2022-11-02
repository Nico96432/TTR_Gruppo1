   
package ttr_gruppo1;

public class Tratta {
    private int lunghezza;
    private String colore;
    private String inizio;
    private String fine;
    private boolean occupata;
    
    public Tratta(){}
    
    public Tratta(int lunghezza,String colore,String inizio,String fine,boolean occupata)
    {
        this.lunghezza=lunghezza;
        this.colore=colore;
        this.inizio=inizio;
        this.fine=fine;
        this.occupata=occupata;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
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

    public boolean isOccupata() {
        return occupata;
    }

    public void setOccupata(boolean occupata) {
        this.occupata = occupata;
    }
}
    