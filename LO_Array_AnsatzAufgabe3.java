/**
  *
  * Ansatz AB Array Aufgabe 3
  *
  */

public class LO_Array_AnsatzAufgabe3
{
  public static void main(String[] args)
  {
    final int ANZ = 10;    //Konstante für Arraygröße (10 Elemente)
    double temp[ ] = new double [ANZ] ; //Arraydeklaration mit Konstante
    int nr = 0;             //Auswahlvariable für Arrayelement
    
    char wahl;
    do
    {
      //Eingabe eines Arraywertes
      System.out.print("Nummer: ");
      nr = Tastatur.liesInt();
      System.out.print("Feldinhalt: ");
      temp[nr-1] = Tastatur.liesFloat();
      
      //Ausgabe eines Arraywertes
      System.out.print("Nummer: ");
      nr = Tastatur.liesInt();
      System.out.println("Nummer: "+ nr +" Inhalt: "+ temp[nr-1] );
      
      //Eingabe aller Arraywerte
      for( nr = 1 ; nr <= ANZ ; nr = nr + 1 )
      {
        System.out.println( nr + ".Eingabe: ");
        System.out.print("Feldinhalt: ");
        temp[nr-1] = Tastatur.liesFloat();
      }
      //Ausgabe aller Arraywerte
      for( nr = 0 ; nr < temp.length ; nr = nr + 1 )
      {
        System.out.println("Nummer: "+ (nr+1) +" Inhalt: "+ temp[ nr ]) ;
      }
       
      System.out.println("\nMöchten Sie das Programm (j/n) wiederholen?");
      wahl = Tastatur.liesChar();
    }while(wahl == 'j');
  }
}

