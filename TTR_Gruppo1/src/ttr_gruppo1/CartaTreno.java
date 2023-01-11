
package ttr_gruppo1;


public class CartaTreno extends Carta{
    
    private String colore;
    private boolean jolly;
    
    

public CartaTreno(){


}

public CartaTreno(String colore, boolean jolly){ 
    
    this.colore=colore;
    this.jolly=jolly;
    
    
}

public String getColore() {
    return colore;
}

public void setColore(String colore) {
    this.colore=colore;
}

public boolean getJolly() {
    return jolly;
}

public void setJolly() {
    this.jolly=jolly;
}



}

