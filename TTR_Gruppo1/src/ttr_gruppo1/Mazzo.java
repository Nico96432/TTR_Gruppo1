
package ttr_gruppo1;

public class Mazzo extends Sprite{
    private String Carta[];

    public Mazzo() { //Costruttore vuoto
        super(20,20);/*
        loadImage("mazzoObiettivi.png");*/
    }
    
    public Mazzo(String[] Carta, String tipo) {
        super(20,20);/*
        if(tipo=="Obiettivi"){
        loadImage("mazzoObiettivi.png");
        }else loadImage("mazzoTreni.png");
         for(int i=0;i<Carta.length;i++)
            this.Carta[i]=Carta[i];*/
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
