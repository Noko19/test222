public class UE_StringMethodenUebersicht{
  public static void main(String[] args){
    final int ANZ;
    char wahl = 'n';
    double dVar = 4.0;
    int iVar = 123,iVar2 = 0;
    do{
      System.out.print( "Anzahl (min 3): ");
      iVar = Tastatur.liesInt();
    }while(iVar < 3);
    ANZ = iVar; //Einmalige Zuweisung der Arraygröße   
    //Deklaration eines Objekts zur Speicherung von Text
    
    ________ such = "Test";
    
    ________ tempText = "Test";
    //Deklaration eines Array zur Speicherung von Texten
    
    _________ feldText[] = new _________ [ANZ];
    
    do{
      //Eingabe aller Arraydaten
      System.out.println("\n\nEingabe aller Texte");
      for(int i = 0; i<ANZ; i++){
        System.out.println( "Text für Feld["+i+"]: ");
        
        __________ = Tastatur.__________; //Eingabe Stringarray
      }
      //Ausgabe aller Arraydaten
      System.out.println("\n\nAusgabe aller Texte");
      for(int i = 0; i<feldText.length; i++){
        
        System.out.println("TextFeld["+i+"]: "+ ___________);//Ausgabe Stringarray
      }
      //Suche nach einem bestimmten Text im Stringarray
      System.out.println("\n\nSuchen nach bestimmten Text");
      System.out.print("Suchtext: ");
      
      such = Tastatur._________________;
      
      for(int i = 0; i<feldText.length; i++){
        
        if ( ____________________________ ) //Im Stringarray in such identisch
          System.out.println( such+" gefunden in feldText["+i+"]");
        
        if ( ____________________________ ) //Im Stringarrayin such identisch
          //GroßKleinschreibung ignorieren
          System.out.println( feldText[i]+" gefunden in feldText["+i+"]");
      }
      //Suche nach einem bestimmten TeilText im Stringarray
      System.out.println("\n\nSuchen nach bestimmten TeilText");
      System.out.print("Suchtext: ");

      _______________ = Tastatur._________________;
      
      for(int i = 0; i<feldText.length; i++){
        
        if ( ____________________________ ) //Im Stringarray  in such enthalten
          System.out.println( feldText[i]+" gefunden in feldText["+i+"]");
         
        tempText = ______________________ ;   //komplett kleingeschrieben
        if ( ____________________________ ){
          //In tempText in such enthalten GroßKleinschreibung soll ignoriert werden
          System.out.print(feldText[i]+" gefunden in feldText["+i+"]");
          System.out.println("GroßKleinschreibung wurde ignoriert");
        }
      }
      
      //Umwandlung eines Doublewertes in einen String
      System.out.println("\n\nReelezahl zur Speicherung in feldText[0]: ");
      dVar = Tastatur.liesDouble();
      System.out.println("Ganze Zahl zur Speicherung in feldText[1]: ");
      iVar = Tastatur.liesInt();
      //Umwandlung einer beliebigen Zahl in einen String
      
      feldText[0]= __________________ (dVar);
      //Umwandlung nur einer integer Zahl in einen String
      
      feldText[1]= __________________ (iVar);
      
      System.out.println("\n\nAusgabe aller Texte");
      for(int i = 0; i<feldText.length; i++){
        System.out.println( "Text Feld["+i+"]: "+feldText[i]);
      }
      iVar = 0;
      dVar = 0;
      for(int i = 0; i < feldText.length; i++){
        try{
          //Anweisungen werden Versucht und beim Fehlversuch kommt catch
          //zur Anwendung
          //Umwandelung von String in Doublewert

          dVar = __________(feldText[i]);
        }catch(NumberFormatException e){  //Fängt Fehler ab
                                       //Anweisungsblock wenn Fehler gefunden.
          dVar =999;
        }
        if( __________________ ) //Kein Umwandlugnsfehler ?
          System.out.println(" dVar: " + dVar);
        else
          System.out.println("Fehler bei Umwandlung von Text in Doublezahl");
      }
      System.out.println("Wollen Sie wiederholen(j/n)");
      wahl = Tastatur.liesChar();
    }while(wahl == 'j');
  }
}
