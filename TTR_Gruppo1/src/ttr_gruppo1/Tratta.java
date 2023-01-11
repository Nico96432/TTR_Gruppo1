   
package ttr_gruppo1;

public class Tratta extends Sprite{
    private int lunghezza;
    private String colore;
    private String inizio;
    private String fine;
    private boolean occupata;
    
    public Tratta(){
        super(20,20);/*
        loadImage("Tratta.png");*/
    }
    
    public Tratta(int lunghezza,String colore,String inizio,String fine,boolean occupata)
    {
        super(20,20);/*
        loadImage("Tratta.png");*/
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
    
    /*
        	Tratte
    1. Vancouver - Seattle, 1, grigia
    2. Vancouver - Seattle, 1, grigia
    3. Vancouver-Calgary, 3, grigia
    4. Seattle-Portland, 1, grigia
    5. Seattle-Portland, 1, grigia
    6. Portland-San Francisco, 5, verde
    7. Portland-San Francisco, 5, rosa
    8. San Francisco-Los Angeles, 3, gialla
    9. San Francisco-Los Angeles, 3, rosa
    10. Los Angeles-Las Vegas, 2, grigia
    11. Las Vegas-Sault Lake City, 3, arancio
    12. Sault Lake City-San Francisco, 5, arancio
    13. Sault Lake City-San Francisco, 5, bianco
    14. Sault Lake City-Portland, 6, blu
    15. Seattle-Helena, 6, gialla
    16. Seattle-Calgary, 4, grigio
    17. Calgary-Helena, 4, grigio
    18. Helena-Sault Lake City, 3, rosa
    19. Sault Lake City-Denver, 3, rossa
    20. Sault Lake City-Denver, 3, gialla
    21. Denver-Phoenix, 5, bianca
    22. Phoenix-Los Angeles, 3, grigio
    23. Los Angeles-El Paso, 6, nera
    24. El Paso-Phoenix, 3, grigia
    25. Phoenix-Santa Fe, 3, grigia
    26. Santa Fe-Denver, 2, grigia
    27. Sanfa Fe-El Paso, 2, grigia
    28. Denver-Helena, 4, verde
    29. Calgary-Winnipeg, 6, bianca
    30. Winnipeg-Helena, 4, blu
    31. Helena-Duluth, 6, arancio
    32. Winnipeg-Duluth, 4, nera
    33. Helena-Omaha, 5, rosso
    34. Denver-Omaha, 4, rosa
    35. Denver-Kansas City, 4, nera
    36. Denver-Kansas City, 4, arancio
    37. Denver-Oklahoma City, 4, rossa
    38. Santa Fe-Oklahoma City, 3, blu
    39. El Paso-Oklahoma City, 5, giallo
    40. El Paso-Dallas, 4, rosso
    41. El Paso-Houston, 6, verde
    42. Houston-Dallas, 1, grigio
    43. Houston-Dallas, 1, grigio
    44. Dallas-Oklahoma City, 2, grigio
    45. Dallas-Oklahoma City, 2, grigio
    46. Oklahoma City-Kansas City, 2, grigio
    47. Oklahoma City-Kansas City, 2, grigio
    48. Kansas City-Omaha, 1, grigio
    49. Kansas City-Omaha, 1, grigio
    50. Omaha-Duluth, 2, grigio
    51. Omaha-Duluth, 2, grigio
    52. Winnipeg-Sault St. Marie, 6, grigio
    53. Duluth-Sault St.Marie, 3, grigio
    54. Kansas City-Saint Louis, 2, blu
    55. Kansas City-Saint Louis, 2, rosa
    56. Oklahoma City-Little Rock, 2, grigio
    57. Dallas-Little Rock, 2, grigio
    58. Houston-new Orleans, 2, grigio
    59. Little Rock-New Orleans, 3, verde
    60. Little Rock-Saint Louis, 2, grigio
    61. Saint Louis-Chicago, 2, verde
    62. Saint Louis-Chicago, 2, bianco
    63. Omaha-Chicago, 4, blu
    64. Chicago-Duluth, 3, rosso
    65. Little Rock-Nashville, 3, bianco
    66. Nashville-Saint Louis, 2, grigio
    67. Saint Louis-Pittsburgh, 5, verde
    68. Chicago-Toronto, 4, bianca
    69. Duluth-Toronto, 6, rosa
    70. Toronto-Sault St.Marie, 2, grigio
    71. Chicago-Pittsburgh, 3, nera
    72. Chicago-Pittsburgh, 3, arancio
    73. Nashville-Pittsburgh, 4, giallo
    74. Sault St. Marie-Montreal, 5, nero
    75. Montreal-Toronto, 3, grigio
    76. Toronto-Pittsburg, 2, grigio
    77. Pittsburgh-Ralegh, 2, grigio
    78. Nashville-Raleigh, 3, nero
    79. Nashville-Atlanta, 1, grigio
    80. Atlanta-New Orleans, 4, giallo
    81. Atlanta-New Orleans, 4, arancio
    82. Atlanta-Raleigh, 2, grigio
    83. Atlanta-Raleigh, 2, grigio
    84. Raleigh-Washington, 2, grigio
    85. Raleigh-Washington, 2, grigio
    86. Washington-New York, 2, arancio
    87. Washington-New York, 2, nero
    88. Pittsburgh-New York, 2, bianco
    89. Pittsburgh-New York, 2, verde
    90. Boston-Montreal, 2, grigio
    91. Boston-Montreal, 2, grigio
    92. Montreal-New York, 3, blu
    93. Boston-New York, 2, giallo
    94. Boston-New York, 2, rosso
    95. Pittsburgh-Washington, 2, grigio
    96. Raleigh-Charleston, 2, grigio
    97. Atlanta-Charleston, 2, grigio
    98. Charleston-Miami, 4, rosa
    99. Atlanta-Miami, 5, blu
    100. Miami-New Orleans, 6, rosso 

        */
    
}
    