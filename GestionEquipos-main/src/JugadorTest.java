import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Ale Cabrera
 *
 */
class JugadorTest {
	
//###################################      NOMBRE      ###################################

	//Guardar jugador con 0 caracteres
	@Test void testSetNombreJugadorInvalidoVacio() {
		Jugador jugador = new Jugador();
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		assertEquals("", jugador.getNombreJugador()); //assertEquals(null, jugador.getNombreJugador());
	}

	//Guardar jugador con menos de 4 caracteres
	@Test void testSetNombreJugadorInvalidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Ana";
		jugador.setNombreJugador(nombreJugador);
		assertEquals("", jugador.getNombreJugador()); //assertEquals(null, jugador.getNombreJugador());
	}

	//Guardar jugador con 4 caracteres
	@Test void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Juan";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}

	//Guardar jugador con más de 4 caracteres
	@Test void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Mortimer";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador, jugador.getNombreJugador());
	}

	//Guardar jugador con menos de 20 caracteres
	@Test void testSetNombreJugadorValido2() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe Domingo";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}

	//Guardar jugador con 20 caracteres
	@Test void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe Domingo Castaño";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador,jugador.getNombreJugador());
	}

	//Guardar jugador con más de 20 caracteres
	@Test void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe Domingo Castaño ";
		jugador.setNombreJugador(nombreJugador);
		assertEquals("", jugador.getNombreJugador()); //assertEquals(null, jugador.getNombreJugador());
	}
	
//###################################      EDAD      ###################################
	
	//Guardar edad con INTEGER = null
	@Test
	void testSetEdadInvalidoNull () {
		Jugador jugador = new Jugador();
	    assertThrows(NullPointerException.class, ()->{
		    Integer edadJugador = null;
		    jugador.setEdad(edadJugador);
		    assertEquals(null, (Integer)jugador.getEdad());
	    });
	}
	
	//Guardar edad con INT = 0
	@Test
	void testSetEdadInvalidoMinimo () {
		Jugador jugador = new Jugador();
		int edadJugador = 0;
		jugador.setEdad(edadJugador);
		assertEquals(0, (Integer)jugador.getEdad()); //assertEquals(null, (Integer)jugador.getEdad());
	}
	
	//Guardar edad con INT < 18
	@Test
	void testSetEdadInvalidoMaximo () {
		Jugador jugador = new Jugador();
		int edadJugador = 17;
		jugador.setEdad(edadJugador);
		assertEquals(0, (Integer)jugador.getEdad()); //assertEquals(null, (Integer)jugador.getEdad());
	}
	
	//Guardar edad con INT = 18
	@Test
	void testSetEdadValidoMinimo () {
		Jugador jugador = new Jugador();
		int edadJugador = 18;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}
	
	//Guardar edad con INT > 18
	@Test
	void testSetEdadValido () {
		Jugador jugador = new Jugador();
		int edadJugador = 19;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}
	
	//##############################      IDIOMA      ###################################
	
//	//Guardar idioma nulo
//	@Test void testSetIdiomaJugadorNull() {
//		Jugador jugador = new Jugador();
//		String idiomaValido = "";
//		jugador.setIdioma(idiomaValido);
//		assertEquals(idiomaValido, jugador.getIdioma());
//	}
//	
//	//Guardar idioma correcto
//	@Test void testSetIdiomaJugadorCorrecto1() {
//		Jugador jugador = new Jugador();
//		String idiomaValido = "Español";
//		jugador.setIdioma(idiomaValido);
//		assertEquals(idiomaValido, jugador.getIdioma());
//	}
//	
//	//Guardar idioma correcto
//	@Test void testSetIdiomaJugadorCorrecto2() {
//		Jugador jugador = new Jugador();
//		String idiomaValido = "Inglés";
//		jugador.setIdioma(idiomaValido);
//		assertEquals(idiomaValido, jugador.getIdioma());
//	}
//	
//	//Guardar idioma correcto
//	@Test void testSetIdiomaJugadorCorrecto3() {
//		Jugador jugador = new Jugador();
//		String idiomaValido = "Francés";
//		jugador.setIdioma(idiomaValido);
//		assertEquals(idiomaValido, jugador.getIdioma());
//	}
//	
//	//Guardar idioma correcto
//	@Test void testSetIdiomaJugadorCorrecto4() {
//		Jugador jugador = new Jugador();
//		String idiomaValido = "Alemán";
//		jugador.setIdioma(idiomaValido);
//		assertEquals(idiomaValido, jugador.getIdioma());
//	}
//	
//	//Guardar idioma incorrecto
//	@Test void testSetIdiomaJugadorIncorrecto() {
//		Jugador jugador = new Jugador();
//		String idiomaValido = "Japonés";
//		jugador.setIdioma(idiomaValido);
//		assertEquals(idiomaValido, jugador.getIdioma());
//	}
//	
//	//Guardar idioma valor no aceptado
//	@Test void testSetIdiomaJugadorNoAceptado() {
//		Jugador jugador = new Jugador();
//		String idiomaValido = "5";
//		jugador.setIdioma(idiomaValido);
//		assertEquals(idiomaValido, jugador.getIdioma());
//	}
	
	//##############################      TIPO DE JUGADOR      ###################################
	
	//Guardar tipoJugador nulo
	@Test void testSetTipoJugadorNull() {

	}

}
