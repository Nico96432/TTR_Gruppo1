
package ttr_gruppo1;

public class Mazzo {
    private String Carta[];

    public Mazzo() { //Costruttore vuoto
    }
    
    public Mazzo(String[] Carta) {
         for(int i=0;i<Carta.length;i++)
            this.Carta[i]=Carta[i];
        this.Carta=Carta;
    }

    public String[] getCarta() {
        return Carta;
    }

    public void setCarta(String Carta[]) {
        for(int i = 0; i<Carta.length;i++)
            this.Carta[i] = Carta[i];
    }
    
    
}
