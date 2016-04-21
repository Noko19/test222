/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 28.01.2016
  * @author 
  */

public class BS_Bubbelsort {
  
  public static void main(String[] args) {
    int zahlA[]  = {5,4,3,2,1};
    //int zahlB[]  = {3,1,2,5,4};
    boolean tausch;
    int temp, d = 0 ;
    int n = 0
    
    n = zahlA.length; //legt die maximal durchzuführenden Sortiervorgänge fest
    d = 0;
    System.out.println("Unsortiertes Array zahlB[] im Hauptprogramm");
    for( int i = 0; i < zahlA.length; i++)
    {
      System.out.print(zahlA[i]+" ");
    }
    System.out.println("\n");
    System.out.println("\nBubbelsort");
    do
    {
      d++;//Zählt die Durchläufe für die Kontrollausgabe
      tausch = false;
      //Schleife vergleicht Elementnachbarn mit einander
      //ist das aktuelle Arrayelement größer als das darauffolgende
      //werden beide getauscht.
      //=> die erste zu tauschende Zahl wird solange getauscht bis sie
      //die richtige Position im Array hat.
      //z.B. erste Tausch zu tauschende Zahl im ersten Array (zahlA[])
      //wird hier in zahlA[0] ( 5 ) gefunden => diese Zahl wird durch die Schleife
      //bis in das letzteElement zahlA[4] und die anderen jeweils ein Element vor
      //verschoben. Danach wird diese Schleife beendet.
      for( int i = 0; i < n-1; i++)
      {
        if (zahlA[i] > zahlA[i+1])
        {
          tausch = true;
          temp = zahlA[i];
          zahlA[i] = zahlA[i+1];
          zahlA[i+1] = temp;
        }
      }
      
      //Kontrollausgabe nach jeweiligen Sortiervorgang
      System.out.println("Kontrollausgabe nach dem "+ d + ".Sortiervorgang");
      for( int x = 0; x < zahlA.length; x++)
      {
        System.out.print(zahlA[x]+" ");
      }
      System.out.println();
      n--;
      //Wenn ein Tausch stattgefunden hat wird ein neuer Sortiervorgang eingeleitet
      //da beim ersten Durchgang zahlA[4] richtigt sortiert ist muss eine zweite
      //zu sortierende Zahl maximal bis zur Position zahlA[3] verschoben werden.
      //deshalb wird n um eins herunter gesetzt damit die Zählschleife nicht mehr
      //einen unnötigen Vergleich durchführen muss.
      //Beim zweiten Durchlauf wird bei dem Array zahlA[] in zahlA[0]
      //jetzt die 4 gefunden und durch die Zählschleife bis in zahlA[3] und die
      //anderen jeweils einmal nach vorneverschoben.
    }while(tausch == true);
    
    
    n = zahlB.length; //legt die maximal durchzuführenden Sortiervorgänge fest
    d = 0;
    System.out.println("Unsortiertes Array zahlB[] im Hauptprogramm");
    for( int i = 0; i < zahlB.length; i++)
    {
      System.out.print(zahlB[i]+" ");
    }
    System.out.println("\n");
    System.out.println("\nBubbelsort");
    
    do
    {
      d++;//Zählt die Durchläufe für die Kontrollausgabe
      tausch = false;
      for( int i = 0; i < n-1; i++)
      {
        if (zahlB[i] > zahlB[i+1])
        {
          tausch = true;
          temp = zahlB[i];
          zahlB[i] = zahlB[i+1];
          zahlB[i+1] = temp;
        }
      }
      
      //Kontrollausgabe nach jeweiligen Sortiervorgang
      System.out.println("Kontrollausgabe nach dem "+ d + ".Sortiervorgang");
      for( int x = 0; x < zahlB.length; x++)
      {
        System.out.print(zahlB[x]+" ");
      }
      System.out.println();
      n--;
    }while(tausch == true);
  } // end of main
  
} // end of class Bubbelsort
