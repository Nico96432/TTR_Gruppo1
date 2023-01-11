package ttr_gruppo1;


public class Stazione extends Sprite {
    
    private String città;
    
  
   public Stazione(){
    super(20,20);
        loadImage("Stazzione.png");
}

    public Stazione(String città) {
        super(20,20);
        loadImage("Stazzione.png");
        this.città = città;
    }
   
   

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }
    
    

}
