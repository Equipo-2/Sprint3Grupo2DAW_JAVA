import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Ale Cabrera
 *
 */

/**
 * @Test unitarios para los metodos de la clase Jugador
 *
 */
class JugadorTest {
	
//###################################      NOMBRE      ###################################

	@Test
	//Guardar jugador con 0 caracteres	
	void testSetNombreJugadorInvalidoVacio() {
		Jugador jugador = new Jugador();
		String nombreJugador = "";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}

	@Test
	//Guardar jugador con menos de 4 caracteres	
	void testSetNombreJugadorInvalidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Ana";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}

	@Test
	//Guardar jugador con 4 caracteres	
	void testSetNombreJugadorValidoMinimoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Juan";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	@Test
	//Guardar jugador con mas de 4 caracteres	
	void testSetNombreJugadorValido() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Mortimer";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(), jugador.getNombreJugador());
	}

	@Test
	//Guardar jugador con menos de 20 caracteres	
	void testSetNombreJugadorValido2() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe Domingo";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	@Test
	//Guardar jugador con 20 caracteres	
	void testSetNombreJugadorValidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe Domingo Castaco";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(nombreJugador.toUpperCase(),jugador.getNombreJugador());
	}

	@Test
	//Guardar jugador con mas de 20 caracteres	
	void testSetNombreJugadorInvalidoMaximoCaracteres() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe Domingo Castaco ";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}
	
	@Test
	//Guardar jugador con caracteres especiales
	void testSetNombreJugadorInvalidoCaracterEspecial() {
		Jugador jugador = new Jugador();
		String nombreJugador = "Pepe@Domingo!88";
		jugador.setNombreJugador(nombreJugador);
		assertEquals(null, jugador.getNombreJugador());
	}
	
//###################################      EDAD      ###################################
	
	@Test
	//Guardar edad con INTEGER = null
	void testSetEdadInvalidoNull () {
		Jugador jugador = new Jugador();
	    assertThrows(NullPointerException.class, ()->{
		    Integer edadJugador = null;
		    jugador.setEdad(edadJugador);
		    assertEquals(null, (Integer)jugador.getEdad());
	    });
	}
	
	@Test
	//Guardar edad con INT = 0
	void testSetEdadInvalidoMinimo () {
		Jugador jugador = new Jugador();
		int edadJugador = 0;
		jugador.setEdad(edadJugador);
		assertEquals(-1, (Integer)jugador.getEdad());
	}
	
	@Test
	//Guardar edad con INT < 18
	void testSetEdadInvalidoMaximo () {
		Jugador jugador = new Jugador();
		int edadJugador = 17;
		jugador.setEdad(edadJugador);
		assertEquals(-1, (Integer)jugador.getEdad());
	}
	
	@Test
	//Guardar edad con INT = 18
	void testSetEdadValidoMinimo () {
		Jugador jugador = new Jugador();
		int edadJugador = 18;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}
	
	@Test
	//Guardar edad con INT > 18
	void testSetEdadValido () {
		Jugador jugador = new Jugador();
		int edadJugador = 19;
		jugador.setEdad(edadJugador);
		assertEquals(edadJugador,jugador.getEdad());
	}
	
	//##############################      IDIOMA      ###################################
	
	@Test
	//Guardar idioma nulo
	void testSetIdiomaJugadorNull() {
		Jugador jugador = new Jugador();
		String idiomaValido = "";
		jugador.setIdioma(idiomaValido);
		assertEquals(null, jugador.getIdioma());
	}
	
	@Test
	//Guardar idioma correcto
	void testSetIdiomaJugadorCorrecto1() {
		Jugador jugador = new Jugador();
		String idiomaValido = "castellano";
		jugador.setIdioma(idiomaValido);
		assertEquals(idiomaValido, jugador.getIdioma());
	}
	
	@Test
	//Guardar idioma correcto
	void testSetIdiomaJugadorCorrecto2() {
		Jugador jugador = new Jugador();
		String idiomaValido = "ingles";
		jugador.setIdioma(idiomaValido);
		assertEquals(idiomaValido, jugador.getIdioma());
	}
	
	@Test
	//Guardar idioma correcto
	void testSetIdiomaJugadorCorrecto3() {
		Jugador jugador = new Jugador();
		String idiomaValido = "frances";
		jugador.setIdioma(idiomaValido);
		assertEquals(idiomaValido, jugador.getIdioma());
	}
	
	@Test
	//Guardar idioma correcto
	void testSetIdiomaJugadorCorrecto4() {
		Jugador jugador = new Jugador();
		String idiomaValido = "aleman";
		jugador.setIdioma(idiomaValido);
		assertEquals(idiomaValido, jugador.getIdioma());
	}
	
	@Test
	//Guardar idioma incorrecto
	void testSetIdiomaJugadorIncorrecto() {
		Jugador jugador = new Jugador();
		String idiomaValido = "japones";
		jugador.setIdioma(idiomaValido);
		assertEquals(null, jugador.getIdioma());
	}
	
	@Test
	//Guardar idioma valor no aceptado
	void testSetIdiomaJugadorNoAceptado() {
		Jugador jugador = new Jugador();
		String idiomaValido = "5";
		jugador.setIdioma(idiomaValido);
		assertEquals(null, jugador.getIdioma());
	}
	
	//##############################      TIPO DE JUGADOR      ###################################

	@Test
	//Guardar tipo de jugador nombre null	
	void tipoJugadorInvalidoNombre () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador(null);
		jugador.setEdad(18);
		jugador.setIdioma("ingles");
		assertEquals(null, jugador.tipoJugador());
	}
	
	@Test
	//Guardar tipo de jugador edad null
	void tipoJugadorInvalidoEdad () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(-1);
		jugador.setIdioma("ingles");
		assertEquals(null, jugador.tipoJugador());
	}
	
	@Test
	//Guardar tipo de jugador idioma null
	void tipoJugadorInvalidoIdioma () {
		Jugador jugador = new Jugador();
		assertThrows(NullPointerException.class, ()->{
			jugador.setNombreJugador("Josep");
			jugador.setEdad(18);
			jugador.setIdioma(null);
			assertEquals(null, jugador.tipoJugador());
		});
	}
	
	@Test
	//Guardar tipo de jugador todo null
	void tipoJugadorInvalidoTodo () {
		Jugador jugador = new Jugador();
		assertThrows(NullPointerException.class, ()->{
			jugador.setNombreJugador(null);
			jugador.setEdad(-1);
			jugador.setIdioma(null);
			assertEquals(null, jugador.tipoJugador());
		});
	}
	
	@Test
	//Guardar tipo de jugador junior mimino (campos validos)
	void tipoJugadorJuniorMinimo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Juan");
		jugador.setEdad(18);
		jugador.setIdioma("ingles");
		assertEquals("Junior", jugador.tipoJugador());
	}
	
	@Test
	//Guardar tipo de jugador junior maximo (campos validos)
	void tipoJugadorJuniorMaximo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(25);
		jugador.setIdioma("frances");
		assertEquals("Junior", jugador.tipoJugador());
	}
	
	@Test
	//Guardar tipo de jugador senior mimino (campos validos)
	void tipoJugadorSeniorMinimo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Juan");
		jugador.setEdad(26);
		jugador.setIdioma("ingles");
		assertEquals("Senior", jugador.tipoJugador());
	}
	
	@Test
	//Guardar tipo de jugador senior maximo (campos validos)
	void tipoJugadorSeniorMaximo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(35);
		jugador.setIdioma("frances");
		assertEquals("Senior", jugador.tipoJugador());
	}
	
	@Test
	//Guardar tipo de jugador master mimino (campos validos)
	void tipoJugadorMasterMinimo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Juan");
		jugador.setEdad(36);
		jugador.setIdioma("ingles");
		assertEquals("Master", jugador.tipoJugador());
	}
	
	@Test
	//Guardar tipo de jugador master maximo (campos validos)
	void tipoJugadorMasterMaximo () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(100);
		jugador.setIdioma("frances");
		assertEquals("Master", jugador.tipoJugador());
	}
	
	@Test
	//Guardar tipo de jugador supermaster (campos validos)
	void tipoJugadorSupermaster () {
		Jugador jugador = new Jugador();
		jugador.setNombreJugador("Pepe");
		jugador.setEdad(101);
		jugador.setIdioma("frances");
		assertEquals("SuperMaster", jugador.tipoJugador());
	}
}
