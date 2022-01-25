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
	@Test
	void testSetJugador() {
		fail("Not yet implemented");
	}

	@Test
	void testGetJugador() {
		fail("Not yet implemented");
	}

}