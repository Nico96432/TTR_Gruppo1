package ttr_gruppo1;


public class Tabellone{
    
    private Stazione[] stazioni;
    private Tratta[] tratte;

    public Tabellone() {
Stazione s1= new Stazione("Vancouver") ;
Stazione s2= new Stazione("Seattle") ;
Stazione s3= new Stazione("Portland") ;
Stazione s4= new Stazione("San Francisco") ;
Stazione s5= new Stazione("Los Angeles") ;
Stazione s6= new Stazione(" Las Vegas") ;
Stazione s7= new Stazione("Salt Lake City") ;
Stazione s8= new Stazione("Phoenix") ;
Stazione s9= new Stazione("Calgary") ;
Stazione s10= new Stazione("Helena") ;
Stazione s11= new Stazione("Denver") ;
Stazione s12= new Stazione("Santa Fe") ;
Stazione s13= new Stazione("El Paso") ;
Stazione s14= new Stazione("Oklahoma City") ;
Stazione s15= new Stazione("Kansas City") ;
Stazione s16= new Stazione("Omaha") ;
Stazione s17= new Stazione("Duluth") ;
Stazione s18= new Stazione("Winnipeg") ;
Stazione s19= new Stazione("Dalla") ;
Stazione s20= new Stazione("Houston") ;
Stazione s21= new Stazione("Little Rock") ;
Stazione s22= new Stazione("Saint Louis") ;
Stazione s23= new Stazione("Chicago") ;
Stazione s24= new Stazione("Sault St. Marie") ;
Stazione s25= new Stazione("New Orleans") ;
Stazione s26= new Stazione("Nashville") ;
Stazione s27= new Stazione("Pittsburgh") ;
Stazione s28= new Stazione("Toronto") ;
Stazione s29= new Stazione("Montreal") ;
Stazione s30= new Stazione("Boston") ;
Stazione s31= new Stazione("New York") ;
Stazione s32= new Stazione("Washington") ;
Stazione s33= new Stazione("Raleigh") ;
Stazione s34= new Stazione("Atlanta") ;
Stazione s35= new Stazione("Charleston") ;
Stazione s36= new Stazione("Miami") ;
/*
Vancouver - Seattle, 1, grigia
Vancouver - Seattle, 1, grigia
Vancouver-Calgary, 3, grigia
Seattle-Portland, 1, grigia
Seattle-Portland, 1, grigia
Portland-San Francisco, 5, verde
Portland-San Francisco, 5, rosa
San Francisco-Los Angeles, 3, gialla
San Francisco-Los Angeles, 3, rosa
Los Angeles-Las Vegas, 2, grigia
Las Vegas-Sault Lake City, 3, arancio
Sault Lake City-San Francisco, 5, arancio
Sault Lake City-San Francisco, 5, bianco
Sault Lake City-Portland, 6, blu
Seattle-Helena, 6, gialla
Seattle-Calgary, 4, grigio
Calgary-Helena, 4, grigio
Helena-Sault Lake City, 3, rosa
Sault Lake City-Denver, 3, rossa
Sault Lake City-Denver, 3, gialla
Denver-Phoenix, 5, bianca
Phoenix-Los Angeles, 3, grigio
Los Angeles-El Paso, 6, nera
El Paso-Phoenix, 3, grigia
Phoenix-Santa Fe, 3, grigia
Santa Fe-Denver, 2, grigia
Sanfa Fe-El Paso, 2, grigia
Denver-Helena, 4, verde
Calgary-Winnipeg, 6, bianca
Winnipeg-Helena, 4, blu
Helena-Duluth, 6, arancio
Winnipeg-Duluth, 4, nera
Helena-Omaha, 5, rosso
Denver-Omaha, 4, rosa
Denver-Kansas City, 4, nera
Denver-Kansas City, 4, arancio
Denver-Oklahoma City, 4, rossa
Santa Fe-Oklahoma City, 3, blu
El Paso-Oklahoma City, 5, giallo
El Paso-Dallas, 4, rosso
El Paso-Houston, 6, verde
Houston-Dallas, 1, grigio
Houston-Dallas, 1, grigio
Dallas-Oklahoma City, 2, grigio
Dallas-Oklahoma City, 2, grigio
Oklahoma City-Kansas City, 2, grigio
Oklahoma City-Kansas City, 2, grigio
Kansas City-Omaha, 1, grigio
Kansas City-Omaha, 1, grigio
Omaha-Duluth, 2, grigio
Omaha-Duluth, 2, grigio
Winnipeg-Sault St. Marie, 6, grigio
Duluth-Sault St.Marie, 3, grigio
Kansas City-Saint Louis, 2, blu
Kansas City-Saint Louis, 2, rosa
Oklahoma City-Little Rock, 2, grigio
Dallas-Little Rock, 2, grigio
Houston-new Orleans, 2, grigio
Little Rock-New Orleans, 3, verde
Little Rock-Saint Louis, 2, grigio
Saint Louis-Chicago, 2, verde
Saint Louis-Chicago, 2, bianco
Omaha-Chicago, 4, blu
Chicago-Duluth, 3, rosso
Little Rock-Nashville, 3, bianco
Nashville-Saint Louis, 2, grigio
Saint Louis-Pittsburgh, 5, verde
Chicago-Toronto, 4, bianca
Duluth-Toronto, 6, rosa
Toronto-Sault St.Marie, 2, grigio
Chicago-Pittsburgh, 3, nera
Chicago-Pittsburgh, 3, arancio
Nashville-Pittsburgh, 4, giallo
Sault St. Marie-Montreal, 5, nero
Montreal-Toronto, 3, grigio
Toronto-Pittsburg, 2, grigio
Pittsburgh-Ralegh, 2, grigio
Nashville-Raleigh, 3, nero
Nashville-Atlanta, 1, grigio
Atlanta-New Orleans, 4, giallo
Atlanta-New Orleans, 4, arancio
Atlanta-Raleigh, 2, grigio
Atlanta-Raleigh, 2, grigio
Raleigh-Washington, 2, grigio
Raleigh-Washington, 2, grigio
Washington-New York, 2, arancio
Washington-New York, 2, nero
Pittsburgh-New York, 2, bianco
Pittsburgh-New York, 2, verde
Boston-Montreal, 2, grigio
Boston-Montreal, 2, grigio
Montreal-New York, 3, blu
Boston-New York, 2, giallo
Boston-New York, 2, rosso
Pittsburgh-Washington, 2, grigio
Raleigh-Charleston, 2, grigio
Atlanta-Charleston, 2, grigio
Charleston-Miami, 4, rosa
Atlanta-Miami, 5, blu
Miami-New Orleans, 6, rosso
*/

Tratta t1=new Tratta(1,"grigia","Vancouver","Seattle",false);
Tratta t2=new Tratta(1,"Vancouver", "Seattle", "grigia",false);
Tratta t3=new Tratta(3,"Vancouver", "Calgary", "3",false);
Tratta t4=new Tratta( 1, "Seattle","Portland" ,"grigia" ,false);
Tratta t5=new Tratta(1,"Seattle" , "Portland", "grigia",false);
Tratta t6=new Tratta(5, "Portland", "San Francisco", "verde",false);
Tratta t7=new Tratta(5 , "Portland","San Francisco" ,"rosa",false);
Tratta t8=new Tratta(3 , "San Francisco","Los Angeles" ,"gialla" ,false);
Tratta t9=new Tratta(3 ,"San Francisco" ,"Los Angeles" ,"rosa" ,false);
Tratta t10=new Tratta(2 ,"Los Angeles" ,"Las Vegas","grigia",false);
Tratta t11=new Tratta(3 ,"Las Vegas","Sault Lake City","arancio",false);
Tratta t12=new Tratta(5 ,"Sault Lake City","San Francisco","arancio",false);
Tratta t13=new Tratta(5 ,"Sault Lake City","San Francisco","bianco",false);
Tratta t14=new Tratta(6 ,"Sault Lake City","Portland","blu",false);
Tratta t15=new Tratta(6 ,"Seattle","Helena","gialla",false);
Tratta t16=new Tratta(4 ,"Seattle","Calgary","grigio",false);
Tratta t17=new Tratta(4 ,"Calgary","Helena","grigio",false);
Tratta t18=new Tratta(3 ,"Helena","Sault Lake City","rosa",false);
Tratta t19=new Tratta(3 ,"Sault Lake City","Denver","rossa",false);
Tratta t20=new Tratta(3 ,"Sault Lake City","Denver","gialla",false);
Tratta t21=new Tratta(5,"Denver","Phoenix","bianca",false);
Tratta t22=new Tratta(3,"Phoenix","Los Angeles","grigio",false);
Tratta t23=new Tratta(6,"Los Angeles","El Paso","nera",false);
Tratta t24=new Tratta(3,"El Paso","Phoenix","grigia",false);
Tratta t25=new Tratta(3,"Phoenix","Santa Fe","grigia",false);
Tratta t26=new Tratta(2,"Santa Fe","Denver","grigia",false);
Tratta t27=new Tratta(2,"Sanfa Fe","El Paso","grigia",false);
Tratta t28=new Tratta(4,"Denver","Helena","verde",false);
Tratta t29=new Tratta(6,"Calgary","Winnipeg","bianca",false);
Tratta t30=new Tratta(4,"Winnipeg","Helena","blu",false);
Tratta t31=new Tratta(6,"Helena","Duluth","arancio",false);
Tratta t32=new Tratta(4,"Winnipeg","Duluth","nera",false);
Tratta t33=new Tratta(5,"Helena","Omaha","rosso",false);
Tratta t34=new Tratta(4,"Denver","Omaha","rosa",false);
Tratta t35=new Tratta(4,"Denver","Kansas City","nera",false);
Tratta t36=new Tratta(4,"Denver","Kansas City","arancio",false);
Tratta t37=new Tratta(4,"Denver","Oklahoma City","rossa",false);
Tratta t38=new Tratta(3,"Santa Fe","Oklahoma","blu",false);
Tratta t39=new Tratta(5,"El Paso","Oklahoma City","giallo",false);
Tratta t40=new Tratta(4,"El Paso","Dallas","rosso",false);
Tratta t41=new Tratta(6,"El Paso","Houston","verde",false);
Tratta t42=new Tratta(1,"Houston","Dallas","grigio",false);
Tratta t43=new Tratta(1,"Houston","Dallas","grigio",false);
Tratta t44=new Tratta(2,"Dallas","Oklahoma City","grigio",false);
Tratta t45=new Tratta(2,"Dallas","Oklahoma City","grigio",false);
Tratta t46=new Tratta(2,"Oklahoma City","Kansas City","grigio",false);
Tratta t47=new Tratta(2,"Oklahoma City","Kansas City","grigio",false);
Tratta t48=new Tratta(1,"Kansas City","Omaha","grigio",false);
Tratta t49=new Tratta(1,"Kansas City","Omaha","grigio",false);
Tratta t50=new Tratta(2,"Omaha","Duluth","grigio",false);
Tratta t51=new Tratta(2,"Omaha","Duluth","grigio",false);
Tratta t52=new Tratta(6,"Winnipeg","Sault St. Marie","grigio",false);
Tratta t53=new Tratta(3,"Duluth","Sault St.Marie","grigio",false);
Tratta t54=new Tratta(2,"Kansas City","Saint Louis","blu",false);
Tratta t55=new Tratta(2,"Kansas City","Saint Louis","rosa",false);
Tratta t56=new Tratta(2,"Oklahoma City","Little Rock","grigio",false);
Tratta t57=new Tratta(2,"Dallas","Little Rock","grigio",false);
Tratta t58=new Tratta(2,"Houston","new Orleans","",false);
Tratta t59=new Tratta(3,"Little Rock","New Orleans","verde",false);
Tratta t60=new Tratta(2,"Little Rock","Saint Louis","grigio",false);
Tratta t61=new Tratta(2,"Saint Louis","Chicago","verde",false);
Tratta t62=new Tratta(2,"Saint Louis","Chicago","bianco",false);
Tratta t63=new Tratta(4,"Omaha","Chicago","blu",false);
Tratta t64=new Tratta(3,"Chicago","Duluth","rosso",false);
Tratta t65=new Tratta(3,"Little Rock","Nashville","bianco",false);
Tratta t66=new Tratta(2,"Nashville","Saint Louis","grigio",false);
Tratta t67=new Tratta(5,"Saint Louis","Pittsburgh","verde",false);
Tratta t68=new Tratta(4,"Chicago","Toronto","bianca",false);
Tratta t69=new Tratta(6,"Duluth","Toronto","rosa",false);
Tratta t70=new Tratta(2,"Toronto","Sault St.Marie","grigio",false);
Tratta t71=new Tratta(3,"Chicago","Pittsburgh","nera",false);
Tratta t72=new Tratta(3,"Chicago","Pittsburgh","arancio",false);
Tratta t73=new Tratta(4,"Nashville","Pittsburgh","giallo",false);
Tratta t74=new Tratta(5,"Sault St. Marie","Montreal","nero",false);
Tratta t75=new Tratta(3,"Montreal","Toronto","grigio",false);
Tratta t76=new Tratta(2,"Toronto","Pittsburg","grigio",false);
Tratta t77=new Tratta(2,"Pittsburgh","Ralegh","grigio",false);
Tratta t78=new Tratta(3,"Nashville","Raleigh","nero",false);
Tratta t79=new Tratta(1,"Nashville","Atlanta","grigio",false);
Tratta t80=new Tratta(4,"Atlanta","New Orleans","giallo",false);
Tratta t81=new Tratta(4,"Atlanta","New Orleans","arancio",false);
Tratta t82=new Tratta(2,"Atlanta","Raleigh","grigio",false);
Tratta t83=new Tratta(2,"Atlanta","Raleigh","grigio",false);
Tratta t84=new Tratta(2,"Raleigh","Washington","grigio",false);
Tratta t85=new Tratta(2,"Raleigh","Washington","grigio",false);
Tratta t86=new Tratta(2,"Washington","New York","arancio",false);
Tratta t87=new Tratta(2,"Washington","New York","nero",false);
Tratta t88=new Tratta(2,"Pittsburgh","New York","bianco",false);
Tratta t89=new Tratta(2,"Pittsburgh","New York","verde",false);
Tratta t90=new Tratta(2,"Boston","Montreal","grigio",false);
Tratta t91=new Tratta(2,"Boston","Montreal","grigio",false);
Tratta t92=new Tratta(3,"Montreal","New York","blu",false);
Tratta t93=new Tratta(2,"Boston","New York","giallo",false);
Tratta t94=new Tratta(2,"Boston","New York","rosso",false);
Tratta t95=new Tratta(2,"Pittsburgh","Washington","grigio",false);
Tratta t96=new Tratta(2,"Raleigh","Charleston","grigio",false);
Tratta t97=new Tratta(2,"Charleston","Charleston","grigio",false);
Tratta t98=new Tratta(4,"Charleston","Miami","rosa",false);
Tratta t99=new Tratta(5,"Atlanta","Miami","blu",false);
Tratta t100=new Tratta(6,"Miami","New Orleans","rosso",false);


    }
    
     
   
    public Tabellone(Stazione[] stazioni, Tratta[] tratte) {
        System.arraycopy(stazioni, 0, this.stazioni, 0, stazioni.length);
        this.stazioni = stazioni;
        System.arraycopy(tratte, 0, this.tratte, 0, tratte.length);
        this.tratte = tratte;
    }

    public Stazione[] getStazioni() {
        return stazioni;
    }

    public void setStazioni(Stazione[] stazione) {
        this.stazioni = stazione;
    }

    public Tratta[] getTratte() {
        return tratte;
    }

    public void setTratte(Tratta[] tratte) {
        this.tratte = tratte;
    }
    
    
    
}
