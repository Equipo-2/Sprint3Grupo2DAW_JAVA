/**
 * La clase Equipo y sus metodos (nombre, ranking, categoria)
 * 
 */
public class Equipo {
	private String nombreEquipo;
	private int ranking=-1;
	private String categoriaEquipo;	

	public Equipo() {
		
	}
	
    /**
	* Metodo para crear el nombre del equipo
	* @param nombreEquipo -> Declaramos una variable de tipo String para la funcion setNombreEquipo
	*/
 	public void setNombreEquipo(String nombreEquipo) {		
		if (nombreEquipo == null) {
			this.nombreEquipo = null;
		}else {
			comprobarNombre(nombreEquipo);
		}
	}
 	
    /**
	* Metodo para comprobar el nombre del equipo
	* @param nombreEquipo -> Declaramos una variable de tipo String para la funcion comprobarNombre
	*/
 	public void comprobarNombre(String nombreEquipo) {
		int nombreMinimoCaracteres = 5;
		int nombreMaximoCaracteres = 20;
 		
		boolean letra = true;
		nombreEquipo = nombreEquipo.toUpperCase();
		
		for (int i = 0; i < nombreEquipo.length() && letra; i++) {
			if ((nombreEquipo.charAt(i) >= ('A') && nombreEquipo.charAt(i) <= ('Z') || nombreEquipo.charAt(i) == (' ')) 
				&& nombreEquipo.length() >= nombreMinimoCaracteres && nombreEquipo.length() <= nombreMaximoCaracteres) {
				this.nombreEquipo = nombreEquipo;
				letra = true;
			}else {
				this.nombreEquipo = null;
				letra = false;
			}
		}
	
 	}
 	
    /**
	* Metodo para crear el ranking del equipo
	* @param edad -> Declaramos una variable de tipo Integer para la funcion setRanking
 */
	public void setRanking(int ranking) {
		
		int rankingInvalido = -1;
		int rankingMinimo = 0;
		int rankingMaximo = 10;
		
		if (ranking < rankingMinimo || ranking > rankingMaximo) {
			this.ranking = rankingInvalido;
		}else {
			this.ranking = ranking;
		}
	}
	
    /**
	* Metodo para crear la categoria del Equipo
	* No recibe ningun dato de entrada, tan solo devuelve una String (categoriaEquipo)
	*/
	public String categoriaEquipo() {
		
		int rankingInvalido = -1;
		int rankingMaximoP = 10;
		int rankingMinimoP = 7;
		int rankingMaximoS = 6;
		int rankingMinimoS = 3;
		int rankingMaximoT = 2;
		int rankingMinimoT = 1;
		
		if (nombreEquipo != null && ranking != rankingInvalido) {
			if (ranking <= rankingMaximoP && ranking >= rankingMinimoP) {
				categoriaEquipo = "categoria primera";
			} else if (ranking <= rankingMaximoS && ranking >= rankingMinimoS) {
				categoriaEquipo = "categoria segunda";
			} else if (ranking <= rankingMaximoT && ranking >= rankingMinimoT ) {
				categoriaEquipo = "categoria tercera";
			} 
		} else {
			categoriaEquipo = null;
		}
		return categoriaEquipo;
	}
	
    /**
	* @return 'String' (devuelve el nombre del equipo)
	*
     */
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
    /**
	* @return 'int' ranking (devuelve el ranking del equipo)
	*
     */
	public int getRanking() {
		return ranking;
	}



}
