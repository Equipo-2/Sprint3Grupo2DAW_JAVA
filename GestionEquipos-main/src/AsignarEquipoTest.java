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
		Jugador jugador = null;
		asignarEquipo.setJugador(jugador);
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	
	//Asignar jugador que exista y tenga todos sus campos válidos
	@Test void testSetJugadorValido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		nombrevalido.toUpperCase();
		int edadValida = 20;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
		
	}
	
	//Asignar jugador que exista, pero su nombre sea inválido
	@Test void testSetJugadorNombreInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Eva";
		nombrevalido.toUpperCase();
		int edadValida = 20;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	
	//Asignar jugador que exista, pero no tenga nombre
	@Test void testSetJugadorNombreVacio() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "";
		nombrevalido.toUpperCase();
		int edadValida = 20;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	
	//Asignar jugador que exista, pero su edad sea inválida
	@Test void testSetJugadorEdadInvalida() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		nombrevalido.toUpperCase();
		int edadValida = 0;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	
	//Asignar jugador que exista, pero no tenga edad
	@Test void testSetJugadorEdadNull() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		nombrevalido.toUpperCase();
		
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
	}
	
	//Asignar jugador que exista, pero su idioma sea inválido
	@Test void testSetJugadorIdiomaInvalido() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		nombrevalido.toUpperCase();
		int edadValida = 20;
		String idiomaValido = "arabe";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	
	//Asignar jugador que exista, pero no tenga idioma
	@Test void testSetJugadorIdiomaNull() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		nombrevalido.toUpperCase();
		int edadValida = 20;
		String idiomaValido = "";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNull(jugadorGuardado);
	}
	
	//Asignar jugador que exista, pero cuyo nombre este en mayus
	@Test void testJugadorNombreMayus() {
		AsignarEquipo asignarEquipo = new AsignarEquipo();

		Jugador jugador = new Jugador();
		String nombrevalido = "Alejandro";
		nombrevalido.toUpperCase();
		int edadValida = 20;
		String idiomaValido = "castellano";
		jugador.setNombreJugador(nombrevalido);
		jugador.setEdad(edadValida);
		jugador.setIdioma(idiomaValido);
		
		asignarEquipo.setJugador(jugador);
		
		Jugador jugadorGuardado = asignarEquipo.getJugador(); 
		assertNotNull(jugadorGuardado);
	
	}
	
	/////////////////////////////////////////////////////////////////////////
	
	
		@Test
		//Equipo que exista con los campos validos
		void testAsignarEquipoCamposValidos() {

			AsignarEquipo asignarEquipo = new AsignarEquipo();
			
			Equipo equipo = new Equipo();
			
			String nombre = "PraiseTheSun";
			
			int ranking = 1;
			
			nombre.toUpperCase();
			
			equipo.setNombreEquipo(nombre);
			
			equipo.setRanking(ranking);
	
			asignarEquipo.setEquipo(equipo);
			
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			
			assertNotNull(equipoGuardado);
		}

	
		@Test
		//Equipo que no exista (nulo)
		void testAsignarEquipoNulo() {
			
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			
			Equipo equipo = null;
			
			asignarEquipo.setEquipo(equipo);
			
			assertNull(asignarEquipo.getEquipo());
			
		}

		
		@Test
		//Equipo que su nombre sea inválido
		void testAsignarEquipoNombreInvalido() {
			
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			
			Equipo equipo = new Equipo();
			
			String nombre = "Sol";
			
			equipo.setNombreEquipo(nombre);
			
			asignarEquipo.setEquipo(equipo);
			
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			
			assertNull(equipoGuardado);
			
		}

	
		@Test
		//Equipo que no tenga nombre
		void testAsignarEquipoSinNombre() {
			
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			
			Equipo equipo = new Equipo();
			
			String nombre = null;
			
			equipo.setNombreEquipo(nombre);
			
			asignarEquipo.setEquipo(equipo);
			
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			
			assertNull(equipoGuardado);
			
		}

	
		@Test
		//Equipo con ranking inválido
		void testAsignarEquipoRankingInválido() {
			
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			
			Equipo equipo = new Equipo();
			
			String nombre = "Tzedakah";
			
			int ranking = -1;
			
			equipo.setRanking(ranking);
			
			equipo.setNombreEquipo(nombre);
			
			asignarEquipo.setEquipo(equipo);
			
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			
			assertNull(equipoGuardado);
			
		}


		
		@Test
		//Equipo que no tenga ranking
		void testAsignarEquipoSinRanking() {
			
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			
			Equipo equipo = new Equipo();
			
			String nombre = "Overgeared";
			
			equipo.setNombreEquipo(nombre);
			
			asignarEquipo.setEquipo(equipo);
			
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			
			assertNull(equipoGuardado);
		}
		@Test
		//Nombre guardado en mayusculas
		void testGuardarNombreMayus() {
			
			AsignarEquipo asignarEquipo = new AsignarEquipo();
			
			Equipo equipo = new Equipo();
			
			String nombre = "PraiseTheSun";
			
			int ranking = 1;
			
			nombre.toUpperCase();
			
			equipo.setNombreEquipo(nombre);
			
			equipo.setRanking(ranking);
			
			asignarEquipo.setEquipo(equipo);
			
			Equipo equipoGuardado = asignarEquipo.getEquipo();
			
			assertNotNull(equipoGuardado);
			
		}

}