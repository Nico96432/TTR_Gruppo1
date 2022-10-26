
public class Tabellone {
    
    private int stazione[];
    private int tratta[];

    public Tabellone() {
    }

    
   
    public Tabellone(int[] stazione, int[] tratta) {
        for(int i=0;i<stazione.length;i++)
            this.stazione[i]=stazione[i];
        this.stazione = stazione;
        for(int i=0;i<tratta.length;i++)
            this.tratta[i]=tratta[i];
        this.tratta = tratta;
    }

    public int[] getStazione() {
        return stazione;
    }

    public void setStazione(int[] stazione) {
        this.stazione = stazione;
    }

    public int[] getTratta() {
        return tratta;
    }

    public void setTratta(int[] tratta) {
        this.tratta = tratta;
    }
    
    
    
}
