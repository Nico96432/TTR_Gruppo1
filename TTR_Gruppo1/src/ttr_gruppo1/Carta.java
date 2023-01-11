
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
        if(jolly==true)
        return "jolly";
        else return "non è un jolly";
    }
    
        public String Obbiettivo() {
        if(jolly==true)
        return "jolly";
        else return "non è un jolly";
    }
        
         /*
        Obbiettivi
    1. Denver-Pittsburgh 11
    2. Winnipeg-Houston 12
    3. Chicago-Santa Fe 9
    4. Duluth-El Paso 10
    5. Sault San.Marie-Oklahoma City 9
    6. Calgary-Phoenix 13
    7. Los Angeles - New York 21
    8. Seattle-New York 22
    9. Vancouver-Montreal 20
    10. Montreal-New Orleans 13
    11. Boston-Miami 12
    12. Sault St.Marie-Nashville 8
    13. Kansas City - Houston 5
    14. Toronto-Miami 10
    15. Chicago-New Orleans 7
    16. Duluth-Houston 8
    17. Dallas-New York 11
    18. Winnipeg-Little Rock 11
    19. Denver-El Paso 4
    20. Portland-Phoenix 11
    21. Helena-Los Angeles 8
    22. New York-Atlanta 6
    23. Montreal-Atlanta 9
    24. Portland-Nashville 17
    25. Seattle-Los Angeles 9
    26. Vancouver-Santa Fe 13
    27. Calgary-Salt Lake City 7
    28. Los Angeles-Chicago 16
    29. Los Angeles-Miami 20
    30. San Francisco-Atlanta 17
*/

    }