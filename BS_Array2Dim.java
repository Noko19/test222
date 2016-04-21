/**
  *
  * Zweidimensionale Arrays am Beispiel Verwaltung
  * von mehreren Schr�nken mit jeweils mehreren F�chern
  *
  */

public class BS_Array2Dim
{
  public static void main(String[] args)
  {
     final int ANZFach = 3;
     final int ANZSchrank = 2;
     int wert;
     int schrankNR = 0, fachNR;
     //Deklaration eines zweidimensionalen Arrays
     //Die Bedeutung der jeweiligen Dimension kann frei gew�hlt werden
     //Hier wird die erste Dimension f�r die Festlegung der Schrankanzahl (=2) und
     //Die zweite Dimension f�r die jeweilige Fachanzahl (=3) gew�hlt
     int schrank[][] = new int[ANZSchrank][ANZFach];

     //Eingabe eines Datensatzes
     //1. Auswahl des Schrankes und des Faches
     System.out.print("SchrankNummer: ");
     schrankNR = Tastatur.liesInt();
     System.out.print("FachNummer: ");
     fachNR = Tastatur.liesInt();
     //Eingabe der Daten f�r das ausgew�hlte Fach im ausgew�hlten Schrank
     System.out.print("Artikelanzahl f�r Schrank "+schrankNR+" im Fach "+fachNR+" : ");
     schrank[schrankNR-1][fachNR-1] = Tastatur.liesInt();

     //Ausgabe eines Datensatzes
     System.out.print("SchrankNummer: ");
     schrankNR = Tastatur.liesInt();
     System.out.print("FachNummer: ");
     fachNR = Tastatur.liesInt();
     System.out.print("Artikelanzahl f�r Schrank "+schrankNR+" im Fach "+fachNR+" : "+ schrank[schrankNR-1][fachNR-1]);
     System.out.println("\n");

     //Eingabe aller Daten f�r jedes Fach in jedem Schrank
     for(int x = 0; x<ANZSchrank; x++)//Zahlt jede Schranknummer durch
     {
       for(int y = 0; y<ANZFach ; y++)//Zahlt f�r die jeweilige Schranknummer alle Fachnummern durch
       {
         System.out.print("Artikelanzahl f�r Schrank "+(x+1)+" im Fach "+(y+1) +" : ");
         schrank[x][y] = Tastatur.liesInt();
       }
     }
     System.out.println("\n");

     //Ausgabe aller Daten f�r jedes Fach in jedem Schrank
     for(int x = 1; x<=ANZSchrank; x++)
     {
       for(int y = 1; y<=ANZFach; y++)
       {
         System.out.println("Artikelanzahl f�r Schrank "+(x)+" im Fach "+(y) +" : "+schrank[x-1][y-1]);
       }
     }
  }
}

