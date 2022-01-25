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
		String nombrevalido = "";
		int edadValida=0;//No hay forma de poner un int como nulo
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
	
	//Asignar un jugador que sea nulo
	@Test
	void testSetJugadorValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		int edadValida = 20;
		String idiomaValido = "Español";
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
	void testSetJugadorNombreInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Eva";
		int edadValida = 20;
		String idiomaValido = "Español";
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
	
	
	
	//Asignar equipo que exista y tenga todos los campos validos
		@Test
		void testAsignarEquipoCamposValidos() {

			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre= "PraiseTheSun";
			int ranking = 1;
			equipo.setNombreEquipo(nombre);
			equipo.setRanking(ranking);
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
			equipo.setNombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertEquals(null,equipoGuardado.getNombreEquipo());
			assertNotNull(equipoGuardado);
		}

		//Asignar equipo que exista pero que no tenga nombre
		@Test
		void testAsignarEquipoSinNombre() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			String nombre = null;
			equipo.setNombreEquipo(nombre);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}

		//Asignar equipo que exista pero que tenga ranking inválido
		@Test
		void testAsignarEquipoRankingInválido() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			int ranking= -1;
			equipo.setRanking(ranking);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}


		//Asignar equipo que exista pero que no tenga ranking
		@Test
		void testAsignarEquipoSinRanking() {
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			Equipo equipo = new Equipo();
			int ranking= 0;
			equipo.setRanking(ranking);
			asignarEquipo.setEquipo(equipo);
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			assertNull(equipoGuardado);
		}

}