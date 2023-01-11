
package ttr_gruppo1;


public class CartaObiettivo extends Sprite{
    
   private String partenza;
   private String arrivo;
   private int punteggio;

public CartaObiettivo(){
    super(50,50);
    loadImage("cartaObiettivo.png");
}

public CartaObiettivo(String partenza,String arrivo,int punteggio){ 
    super(50,50);
    loadImage("cartaObiettivo.png");
    this.partenza=partenza;
    this.arrivo=arrivo;
    this.punteggio=punteggio;
    
}

public String getPartenza() {
    return partenza;
}

public void setPartenza(String partenza) {
    this.partenza=partenza;
}

public String getArrivo() {
    return arrivo;
}

public void setArrivo(String arrivo) {
    this.arrivo=arrivo;
}

public int getPunteggio() {
    return punteggio;
}

public void setPunteggio(int punteggio) {
    this.punteggio=punteggio;
}



}



