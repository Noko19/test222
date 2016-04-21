/**
  *
  * Ansatz AB Array Aufgabe 3
  *
  */

public class UE_Array_AnsatzAufgabe3
{
  public static void main(String[] args)
  {
    _____ int ANZ = ____;    //Konstante für Arraygröße (10 Elemente)
    double temp[ ] = __________ ; //Arraydeklaration mit Konstante
    int nr = 0;             //Auswahlvariable für Arrayelement
    
    char wahl;
    do
    {
      //Eingabe eines Arraywertes
      System.out.print("Nummer: ");
      ___________ = Tastatur.liesInt();
      System.out.print("Feldinhalt: ");
      __________ = Tastatur.liesFloat();
      
      //Ausgabe eines Arraywertes
      System.out.print("Nummer: ");
      __________ = Tastatur.liesInt();
      System.out.println("Nummer: "+ ______ +" Inhalt: "+ ___________ );
      
      //Eingabe aller Arraywerte
      for( ____________ ; ___________ ; i = i + 1 )
      {
        System.out.println( _____ + ".Eingabe: ");
        System.out.print("Feldinhalt: ");
        ____________ = Tastatur.liesFloat();
      }
      //Ausgabe aller Arraywerte
      for( nr = 0 ; nr < ÁNZ ; nr = nr + 1 )
      {
        System.out.println("Nummer: "+ (nr+1) +" Inhalt: "+ temp[ nr ]) ;
      }
       
      System.out.println("\nMöchten Sie das Programm (j/n) wiederholen?");
      wahl = Tastatur.liesChar();
    }while(wahl == 'j');
  }
}

