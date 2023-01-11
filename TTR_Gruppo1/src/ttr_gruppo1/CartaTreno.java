package ttr_gruppo1;

public class CartaTreno extends Sprite{
    private String colore;

    public CartaTreno() {
        super(20,20);/*
        loadImage("Treno.png");*/
    }

    public CartaTreno(String colore) {
        super(20,20);
        loadImage("Treno.png");
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
    
}
