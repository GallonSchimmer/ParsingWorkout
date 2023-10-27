package parsingString;

public class ParsingIntToString {
	
	static int breiteQuadrat = 10;
	static int hoeheQuadrat = 20;
	
	static int flaecheQuadrat;
	
	public static void main(String[] args) {
		
		//um die breite usw. zu nutzen muss man es als static initialisieren
		flaecheQuadrat = breiteQuadrat * hoeheQuadrat;
		
		//parsing the integers to String using Integer.toString(flaeche)
		String flaecheParsed = Integer.toString(flaecheQuadrat);
		
		System.out.println("This is the area of the Square parsed to String: " + flaecheParsed + "m2");
		
		//Parsing, concatenating breite und hoeche
		String breiteParsed = Integer.toString(breiteQuadrat);
		String hoeheParsed = Integer.toString(hoeheQuadrat);
		
		System.out.println("This is the hoehe und breite geparsed und concatenated: " + breiteParsed +" m "+ hoeheParsed +" m ");
		System.out.println("hoeche und breite geparsed und verkettet: " + breiteParsed+hoeheParsed);
		
	}

}
