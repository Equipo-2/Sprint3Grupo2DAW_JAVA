import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Alvaro
 *
 */
class AsignarEquipoTest {

	/**
	 * Test method for {@link AsignarEquipo#AsignarEquipo()}.
	 */
	
	//Asignar un jugador que sea nulo
	void testSetJugadorNulo() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = null;
		int edadValida = -1;
		String idiomaValido = null;
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(null, jugadorGuardado.getNombreJugador());
		assertEquals(-1, jugadorGuardado.getEdad());
		assertEquals(null, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista y tenga todos sus campos válidos
	@Test
	void testSetJugadorValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 20;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
		
	}
	
	//Asignar jugador que exista, pero su nombre sea inválido
	@Test
	void testSetJugadorNombreInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Eva";
		int edadValida = 20;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero no tenga nombre
	@Test
	void testSetJugadorNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "";
		int edadValida = 20;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero su edad sea inválida
	@Test
	void testSetJugadorEdadInvalida() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 0;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero no tenga edad
	@Test
	void testSetJugadorEdadNull() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertNull(jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero su idioma sea inválido
	@Test
	void testSetJugadorIdiomaInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 20;
		String idiomaValido = "arabe";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	
	//Asignar jugador que exista, pero no tenga idioma
	@Test
	void testSetJugadorIdiomaNull() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 20;
		String idiomaValido = "";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
	}
	@Test
	void testJugadorNombreMayus() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 20;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador());
		assertEquals(edadValida, jugadorGuardado.getEdad());
		assertEquals(idiomaValido, jugadorGuardado.getIdioma());
		assertEquals(nombrevalido, jugadorGuardado.getNombreJugador().toUpperCase());
	}
	
	/////////////////////////////////////////////////////////////////////////
	
	//Asignar equipo que exista y tenga todos los campos validos
		@Test
		void testAsignarEquipoCamposValidos() {

			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre= "PraiseTheSun";
			int ranking = 1;
			equipo.NombreEquipo(nombre);
			equipo.Ranking(ranking);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertEquals(nombre, equipoGuardado.getNombreEquipo());
			assertEquals(ranking, equipoGuardado.getRanking());
			assertNotNull(equipoGuardado);
		}

		//Asignar equipo que no exista (es decir nulo)
		@Test
		void testAsignarEquipoNulo() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = null;

			asignarEquipo.setEquipo(equipo);
			assertNull(asignarEquipo.getEquipo());
		}

		//Asignar equipo que exista pero que su nombre sea inválido
		@Test
		void testAsignarEquipoNombreInvalido() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre = "Sol";
			equipo.NombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}

		//Asignar equipo que exista pero que no tenga nombre
		@Test
		void testAsignarEquipoSinNombre() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre = null;
			equipo.NombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}

		//Asignar equipo que exista pero que tenga ranking inválido
		@Test
		void testAsignarEquipoRankingInválido() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre = "Tzedakah";
			int ranking= -1;
			equipo.Ranking(ranking);
			equipo.NombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}


		//Asignar equipo que exista pero que no tenga ranking
		@Test
		void testAsignarEquipoSinRanking() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre = "Overgeared";
			equipo.NombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}
		@Test
		void testGuardarNombreMayus() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre= "PraiseTheSun";
			int ranking = 1;
			equipo.NombreEquipo(nombre);
			equipo.Ranking(ranking);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertEquals(nombre, equipoGuardado.getNombreEquipo());
			assertEquals(ranking, equipoGuardado.getRanking());
			assertNotNull(equipoGuardado);
			assertEquals(nombre,equipoGuardado.getNombreEquipo().toUpperCase());
		}

}