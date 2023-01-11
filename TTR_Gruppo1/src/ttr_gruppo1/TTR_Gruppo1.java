
package ttr_gruppo1;


public class TTR_Gruppo1 {

    public static Mazzo mazzoObiettivi;
    public static Mazzo mazzoTreni;
    
    public static void main(String[] args) {
        
        mazzoObiettivi=new Mazzo("Obiettivi");
        mazzoTreni=new Mazzo("Treni");
        
      
        //110 carte Treno: 12 di ogni colore: Viola, Bianco, Blu, Giallo, Arancio, Nero, Rosso e Verde, più 14 Locomotive
        
        Tabellone s= new Tabellone();
        
        
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
        /*
        Stazzioni
        Vancouver
    1. Seattle
    2. Portland
    3. San Francisco
    4. Los Angeles
    5. Las Vegas
    6. Salt Lake City
    7. Phoenix
    8. Calgary
    9. Helena
    10. Denver
    11. Santa Fe
    12. El Paso
    13. Oklahoma City
    14. Kansas City
    15. Omaha
    16. Duluth
    17. Winnipeg
    18. Dalla
    19. Houston
    20. Little Rock
    21. Saint Louis
    22. Chicago
    23. Sault St. Marie
    24. New Orleans
    25. Nashville
    26. Pittsburgh
    27. Toronto
    28. Montreal
    29. Boston
    30. New York
    31. Washington
    32. Raleigh
    33. Atlanta
    34. Charleston
    35. Miami

        */
        
    }
    
}
