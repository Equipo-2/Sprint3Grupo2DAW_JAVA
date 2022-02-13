import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Alicia Ruiznavarro
 *
 */

/**
 * @Test unitarios para los metodos de la clase Equipo
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
		nombreEquipo=nombreEquipo.toUpperCase();
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}

	//Guardar equipo con 5 caracteres
	@Test void testSetNombreEquipoValidoMinimoCaracteres() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Prais";
		nombreEquipo=nombreEquipo.toUpperCase();
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	//Guardar equipo con más de 5 caracteres
	@Test void testSetNombreEquipoValido() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Los osos";
		nombreEquipo=nombreEquipo.toUpperCase();
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	//Guardar equipo con menos de 20 caracteres
	@Test void testSetNombreEquipoValido2() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "PraiseTheSun";
		nombreEquipo=nombreEquipo.toUpperCase();
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	//Guardar equipo con 20 caracteres
	@Test void testSetNombreEquipoValidoMaximoCaracteres() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "File Anan Rizably Se";
		nombreEquipo=nombreEquipo.toUpperCase();
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(nombreEquipo,equipo.getNombreEquipo());
	}

	//Guardar equipo con más de 20 caracteres
	@Test void testSetNombreEquipoInvalidoMaximoCaracteres() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Supercalifragilisticoespialidoso";
		nombreEquipo=nombreEquipo.toUpperCase();
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
	//Guardar equipo con caracteres invalidos
	@Test void testSetNombreEquipoInvalidoCaracteresInvalidos() {
		Equipo equipo = new Equipo();
		String nombreEquipo = "Los Limones_01";
		nombreEquipo=nombreEquipo.toUpperCase();
		equipo.setNombreEquipo(nombreEquipo);
		assertEquals(null,equipo.getNombreEquipo());
	}
	
//###################################      RANKING      ###################################
	
	//Guardar equipo con ranking -1
	@Test
	void testSetRankingInvalido () {
		Equipo equipo = new Equipo();
		int ranking = -1;
		equipo.setRanking(ranking);
		assertEquals(-1,equipo.getRanking());
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

	//Guardar equipo con ranking 11
	@Test
	void testSetRankingInvalidoMaximo () {
		Equipo equipo = new Equipo();
		int ranking = 11;
		equipo.setRanking(ranking);
		assertEquals(-1,equipo.getRanking());
	}
	
//###################################      CATEGORIA      ###################################
	
	//Guardar equipo con categoria primera con ranking 10
	@Test
	void testSetCategoriaPrimera10 () {
		Equipo equipo= new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(10);
		assertEquals("categoria primera", equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria primera con ranking entre 7 y 10 (8)
	@Test
	void testSetCategoriaPrimera8 () {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(8);
		assertEquals("categoria primera", equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria primera con ranking 7
	@Test
	void testSetCategoriaPrimera7 () {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(7);
		assertEquals("categoria primera", equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria segunda con ranking 6
	@Test
	void testSetCategoriaSegunda6 () {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(6);
		assertEquals("categoria segunda", equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria segunda con ranking entre 3 y 6 (4)
	@Test
	void testSetCategoriaSegunda4 () {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(4);
		assertEquals("categoria segunda", equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria segunda con ranking 3
	@Test
	void testSetCategoriaSegunda3 () {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(3);
		assertEquals("categoria segunda", equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria tercera con ranking 2
	@Test
	void testSetCategoriaTercera2 () {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(2);
		assertEquals("categoria tercera", equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria tercera con ranking 1
	@Test
	void testSetCategoriaTercera1 () {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(1);
		assertEquals("categoria tercera", equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria superior a 10
	@Test
	void testSetCategoriaInvalidaMaxima () {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(11);
		assertEquals(null, equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria superior a 10
	@Test
	void testSetCategoriaInvalidaMinima () {
		Equipo equipo = new Equipo();
		equipo.setNombreEquipo("Los Limones");
		equipo.setRanking(-1);
		assertEquals(null, equipo.categoriaEquipo());
	}
	
	//Guardar equipo con categoria Null
	@Test
	void testSetCategoriaInvalidaNull () {
		Equipo equipo = new Equipo();
	    assertThrows(NullPointerException.class, ()->{
			equipo.setNombreEquipo("Los Limones");
		    Integer ranking = null;
			equipo.setRanking(ranking);
		    assertEquals(null, equipo.categoriaEquipo());
	    });
	}
}