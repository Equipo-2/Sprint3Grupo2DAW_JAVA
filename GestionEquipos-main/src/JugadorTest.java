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
		assertEquals(null, jugador.getNombreJugador().toUpperCase());
	}

	//Guardar jugador con menos de 4 caracteres
	@Test void testSetNombreJugadorInvalidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Ana";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador().toUpperCase());
	}

	//Guardar jugador con 4 caracteres
	@Test void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Juan";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador().toUpperCase());
	}

	//Guardar jugador con más de 4 caracteres
	@Test void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Mortimer";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(), jugador.getNombreJugador().toUpperCase());
	}

	//Guardar jugador con menos de 20 caracteres
	@Test void testSetNombreJugadorValido2() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe Domingo";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador().toUpperCase());
	}

	//Guardar jugador con 20 caracteres
	@Test void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe Domingo Castaco";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador().toUpperCase());
	}

	//Guardar jugador con más de 20 caracteres
	@Test void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe Domingo Castaco ";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador().toUpperCase());
	}
	
	//Guardar jugador con caracteres especiales
	@Test void testSetNombreJugadorInvalidoCaracterEspecial() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe@Domingo!88";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador().toUpperCase());
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
		assertEquals(-1, (Integer)jugador.getEdad());
	}
	
	//Guardar edad con INT < 18
	@Test
	void testSetEdadInvalidoMaximo () {
		Jugador jugador = new Jugador();
		int edadJugador = 17;
		jugador.setEdad(edadJugador);
		assertEquals(-1, (Integer)jugador.getEdad());
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
	
	//Guardar idioma nulo
	@Test void testSetIdiomaJugadorNull() {
		Jugador jugador = new Jugador();
		String idiomaValido = "";
		jugador.setIdioma(idiomaValido);
		assertEquals(null, jugador.getIdioma());
	}
	
	//Guardar idioma correcto
	@Test void testSetIdiomaJugadorCorrecto1() {
		Jugador jugador = new Jugador();
		String idiomaValido = "castellano";
		jugador.setIdioma(idiomaValido);
		assertEquals(idiomaValido, jugador.getIdioma());
	}
	
	//Guardar idioma correcto
	@Test void testSetIdiomaJugadorCorrecto2() {
		Jugador jugador = new Jugador();
		String idiomaValido = "ingles";
		jugador.setIdioma(idiomaValido);
		assertEquals(idiomaValido, jugador.getIdioma());
	}
	
	//Guardar idioma correcto
	@Test void testSetIdiomaJugadorCorrecto3() {
		Jugador jugador = new Jugador();
		String idiomaValido = "frances";
		jugador.setIdioma(idiomaValido);
		assertEquals(idiomaValido, jugador.getIdioma());
	}
	
	//Guardar idioma correcto
	@Test void testSetIdiomaJugadorCorrecto4() {
		Jugador jugador = new Jugador();
		String idiomaValido = "aleman";
		jugador.setIdioma(idiomaValido);
		assertEquals(idiomaValido, jugador.getIdioma());
	}
	
	//Guardar idioma incorrecto
	@Test void testSetIdiomaJugadorIncorrecto() {
		Jugador jugador = new Jugador();
		String idiomaValido = "japones";
		jugador.setIdioma(idiomaValido);
		assertEquals(null, jugador.getIdioma());
	}
	
	//Guardar idioma valor no aceptado
	@Test void testSetIdiomaJugadorNoAceptado() {
		Jugador jugador = new Jugador();
		String idiomaValido = "5";
		jugador.setIdioma(idiomaValido);
		assertEquals(null, jugador.getIdioma());
	}
	
	//##############################      TIPO DE JUGADOR      ###################################

	//Guardar tipo de jugador nombre null
	@Test
	void tipoJugadorInvalidoNombre () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(null);
		jugador.setEdad(18);
		jugador.setIdioma("ingles");
		assertEquals(null, jugador.tipoJugador());
	}
	
	//Guardar tipo de jugador edad null
	@Test
	void tipoJugadorInvalidoEdad () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(-1);
		jugador.setIdioma("ingles");
		assertEquals(null, jugador.tipoJugador());
	}
	
	//Guardar tipo de jugador idioma null
	@Test
	void tipoJugadorInvalidoIdioma () {
		Jugador jugador = new Jugador();
		assertThrows(NullPointerException.class, ()->{
			jugador.setNombreJugador("Josep");
			jugador.setEdad(18);
			jugador.setIdioma(null);
			assertEquals(null, jugador.tipoJugador());
		});
	}
	
	//Guardar tipo de jugador todo null
	@Test
	void tipoJugadorInvalidoTodo () {
		Jugador jugador = new Jugador();
		assertThrows(NullPointerException.class, ()->{
			jugador.setNombreJugador(null);
			jugador.setEdad(-1);
			jugador.setIdioma(null);
			assertEquals(null, jugador.tipoJugador());
		});
	}
	
	//Guardar tipo de jugador junior mímino (campos válidos)
	@Test
	void tipoJugadorJuniorMinimo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Juan");
		jugador.setEdad(18);
		jugador.setIdioma("ingles");
		assertEquals("Junior", jugador.tipoJugador());
	}
	
	//Guardar tipo de jugador junior máximo (campos válidos)
	@Test
	void tipoJugadorJuniorMaximo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(25);
		jugador.setIdioma("frances");
		assertEquals("Junior", jugador.tipoJugador());
	}
	
	//Guardar tipo de jugador senior mímino (campos válidos)
	@Test
	void tipoJugadorSeniorMinimo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Juan");
		jugador.setEdad(26);
		jugador.setIdioma("ingles");
		assertEquals("Senior", jugador.tipoJugador());
	}
	
	//Guardar tipo de jugador senior máximo (campos válidos)
	@Test
	void tipoJugadorSeniorMaximo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(35);
		jugador.setIdioma("frances");
		assertEquals("Senior", jugador.tipoJugador());
	}
	
	//Guardar tipo de jugador master mímino (campos válidos)
	@Test
	void tipoJugadorMasterMinimo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Juan");
		jugador.setEdad(36);
		jugador.setIdioma("ingles");
		assertEquals("Master", jugador.tipoJugador());
	}
	
	//Guardar tipo de jugador master máximo (campos válidos)
	@Test
	void tipoJugadorMasterMaximo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(100);
		jugador.setIdioma("frances");
		assertEquals("Master", jugador.tipoJugador());
	}
	
	//Guardar tipo de jugador supermaster (campos válidos)
	@Test
	void tipoJugadorSupermaster () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(101);
		jugador.setIdioma("frances");
		assertEquals("SuperMaster", jugador.tipoJugador());
	}
}
