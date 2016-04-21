import java.util.*;
public class UE_Zufallszahlen
{
  public static void main(String[] args)
  {
     final ___________ ;
     int z_zahl__________________________;
     int i= 0, such = 0, gefundenPos = ANZ, max = 50 , min = 0,
         posmin= ANZ , posmax = ANZ; //Positionen ausserhalb der Arraynummerierung
     //Erzeugung eines Befehls zur Erzeugung von Zufallszahlen
     Random zufall = new Random();
     //
     //Erzeugung von Zufallszahlen und Speicherung im Array
     for ( ______________ )
     {               //Erzeugung von ganzzahligen Zufallszahlen von 0 bis max -1
        __________ = 1 + zufall.nextInt(max);
     }

     //Ausgabe aller im Array gespeicherten Zufallszahlen
     System.out.println("Meine Zufallszahlen: ");
     for ( ________________ )
     {
         System.out.println("z_zahl["+ i + "]: "+ ________ );
     }

       System.out.println("Suchzahl:");
       such = Tastatur.liesInt();
     //Suchen nach Zahl im Array wenn gefunden Schleifenende
     //und Positionsspeicherung
     for (i = 0; i < ANZ; i++)
     {
         if (________________)
         {
            _________________
            _________________
         }
     }
     //Positionsausgabe falls Zahl gefunden
     if ( _____________ )
        System.out.print("\nZahl gefunden an Arrayposition: " + gefundenPos);
     else
        System.out.print("\nZahl nicht gefunden");

     //Initialisierung von min und max für die Ermittlung der Extremwerte
     min = max + 1;
     max = 0;

     //Ermittlung von min und max der Zahlenwerte im Array und
     //Speicherung der entsprechenden Position
     for (i = 0; i < ANZ; i++)
     {
         if ( ____________ )
         {
            min = _________ ;
            posmin = i;
         }
         if ( ____________ )
         {
            max = z_zahl[i];
            posmax = i;
         }
     }
     System.out.print("\nMax: " + max + " Maxposition: " + posmax);
     System.out.print("\nMin: " + min + " Minposition: " + posmin);
  }
}
