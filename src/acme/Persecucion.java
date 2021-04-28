package acme;

import java.io.IOException;

public class Persecucion {

	public static void main(String[] args) throws IOException {
		
		// Primero inicializamos un smartphone ACME con un código de licencia válido
		Smartphone miACMESmartphone = new Smartphone(2.0, COYOTE_398978FDSKJ);
		
		// Localizamos el correcaminos más cercano.
		String coordenadas=miACMESmartphone.locateRoadRunner(SEVILLA, SPAIN, SEVILLA1);
		
		// Preparamos la trampa
                miACMESmartphone.prepareTrap(coordenadas);
                
                // Golpear al correcaminos con el voltaje deseado.
		miACMESmartphone.zapRoadRunner(40);

	}
    public static final String SEVILLA1 = "Sevilla";
    public static final String SPAIN = "Spain";
    public static final String SEVILLA = "Sevilla";
    public static final String COYOTE_398978FDSKJ = "coyote_398978fdskj";
        

}
