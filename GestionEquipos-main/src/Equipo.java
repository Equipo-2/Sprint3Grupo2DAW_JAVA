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
	* @param nombreMinimoCaracteres - El numero minimo de caracteres necesarios ->
	* -> para que el nombre sea valido
	* @param nombreMaximoCaracteres - El numero maximo de caracteres posible ->
	* -> para que el nombre sea valido
	* 
	*/
 	public void setNombreEquipo(String nombreEquipo) {
 		
		int nombreMinimoCaracteres = 5;
		int nombreMaximoCaracteres = 20;
		
		if (nombreEquipo == null) {
			this.nombreEquipo = null;
		}else {
			boolean letra = true;
			nombreEquipo = nombreEquipo.toUpperCase();
			
			for (int i = 0; i < nombreEquipo.length() && letra; i++) {
				if ((nombreEquipo.charAt(i) >= ('A') && nombreEquipo.charAt(i) <= ('Z') || nombreEquipo.charAt(i) == (' ')) 
					&& nombreEquipo.length() >= nombreMinimoCaracteres && nombreEquipo.length() <= 20) {
					this.nombreEquipo = nombreEquipo;
					letra = true;
				}else {
					this.nombreEquipo = null;
					letra = false;
				}
			}
		}
	}
 	
    /**
	* Metodo para crear el ranking del equipo
	* @param rankingInvalido - El ranking dado no es valido, se interpreta como '-1'
	* @param rankingMinimo - El ranking minimo necesario para aceptar al equipo
	* @param rankingMaximo - El ranking maximo necesario para aceptar al equipo
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
	* Metodo para crear la categoria del equipo
	* @param rankingInvalido - El ranking dado no es valido, se interpreta como '-1'
	* @param rankingMaximoP - El ranking maximo necesario para la categoria primera
	* @param rankingMinimoP - El ranking minimo necesario para la categoria primera
	* @param rankingMaximoS - El ranking maximo necesario para la categoria segunda
	* @param rankingMinimoS - El ranking minimo necesario para la categoria segunda
	* @param rankingMaximoT - El ranking maximo necesario para la categoria tercera
	* @param rankingMinimoT - El ranking minimo necesario para la categoria tercera
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
