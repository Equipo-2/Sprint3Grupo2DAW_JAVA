import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Alicia Ruiznavarro
 *
 */
class EquipoTest {
	
//###################################      NOMBRE      ###################################

	//Guardar equipo con 0 caracteres
	@Test void testSetNombreEquipoInvalidoVacio() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}

	//Guardar equipo con menos de 4 caracteres
	@Test void testSetNombreEquipoInvalidoMinimoCaracteres() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Sol";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}

	//Guardar equipo con 5 caracteres
	@Test void testSetNombreEquipoValidoMinimoCaracteres() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Prais";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	//Guardar equipo con más de 5 caracteres
	@Test void testSetNombreEquipoValido() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Los osos";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	//Guardar equipo con menos de 20 caracteres
	@Test void testSetNombreEquipoValido2() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "PraiseTheSun";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	//Guardar equipo con 20 caracteres
	@Test void testSetNombreEquipoValidoMaximoCaracteres() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "File Anan Rizably Se";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	//Guardar equipo con más de 20 caracteres
	@Test void testSetNombreEquipoInvalidoMaximoCaracteres() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Supercalifragilisticoespialidoso";
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
//###################################      RANKING      ###################################
	
	//Guardar equipo con ranking 0
	@Test
	void testSetRankingInvalido () {
		Equipo equipo = new Equipo();
		int ranking = 0;
		equipo.setRanking(ranking);
		assertEquals(0,equipo.getRanking());
	}
	
	//Guardar equipo con ranking 1
	@Test
	void testSetRankingValidoMinimo () {
		Equipo equipo = new Equipo();
		int ranking = 1;
		equipo.setRanking(ranking);
		assertEquals(ranking,equipo.getRanking());
	}
	
	//Guardar equipo con ranking 5
	@Test
	void testSetRankingValido () {
		Equipo equipo = new Equipo();
		int ranking = 5;
		equipo.setRanking(ranking);
		assertEquals(ranking,equipo.getRanking());
	}
	
	//Guardar equipo con ranking 10
	@Test
	void testSetRankingValidoMaximo () {
		Equipo equipo = new Equipo();
		int ranking = 10;
		equipo.setRanking(ranking);
		assertEquals(ranking,equipo.getRanking());
	}

	//Guardar equipo con ranking 0
	@Test
	void testSetRankingInvalidoMaximo () {
		Equipo equipo = new Equipo();
		int ranking = 11;
		equipo.setRanking(ranking);
		assertEquals(0,equipo.getRanking());
	}

}