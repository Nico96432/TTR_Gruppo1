
package ttr_gruppo1;

public class Mazzo {
    private int Carta[];

    public Mazzo() { //Costruttore vuoto
    }
    
    public Mazzo(int[] Carta) {
         for(int i=0;i<Carta.length;i++)
            this.Carta[i]=Carta[i];
        this.Carta=Carta;
    }

    public int[] getCarta() {
        return Carta;
    }

    public void setCarta(int Carta[]) {
        for(int i = 0; i<Carta.length;i++)
            this.Carta[i] = Carta[i];
    }
    
    
}
