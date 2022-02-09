/**
 * La clase Jugador y sus métodos (nombre, edad, idioma, tipoJugador)
 * 
 */

public class Jugador {
	private String nombre;
	private String idioma;
	private int edad;
	
	public Jugador () {
			
		}

	/**
	* Método para crear el nombre del jugador
	* @param nombreMinimoCaracteres - El número mínimo de caracteres necesarios ->
	* -> para que el nombre sea válido
	* @param nombreMaximoCaracteres - El número máximo de caracteres posible ->
	* -> para que el nombre sea válido
	* 
	*/
	public void setNombreJugador(String nombre) {
		
		int nombreMinimoCaracteres = 4;
		int nombreMaximoCaracteres = 20;

        if (nombre != null) {
            if (nombre.length() >= nombreMinimoCaracteres && nombre.length() <= nombreMaximoCaracteres) {
                if (nombre.matches("[a-zA-Z]+") || nombre.contains(" ")) {
                    this.nombre=nombre.toUpperCase();
                }
            }
        } else {
            this.nombre= null;
        }
        
	}

 	/**
  	* Método para crear la edad del jugador
   	* @param edadNula - La edad dada no es válida, se interpreta como '-1'
   	* @param edadMinima - La edad mímina necesaria para aceptar al jugador
   	* @param edadMaxima - La edad máxima posible para aceptar al jugador
	*
    	*/
	public void setEdad(int edad) {

		int edadNula = -1;
		int edadMinima = 18;
		int edadMaxima = 200;
		
		if (edad < edadMinima || edad > edadMaxima) {
			this.edad = edadNula;
		} else {
			this.edad = edad;
		}
	}


   	/**
   	* Método para crear el idioma del jugador
   	* El castellano, inglés, francés y alemán son los idiomas aceptados
   	* Otros idiomas serán considerados como null (no válidos)
	*
   	*/
	public void setIdioma(String idioma) {

		if (idioma.equals("castellano")) {
			this.idioma = "castellano";
		} else if (idioma.equals("ingles")) {
			this.idioma = "ingles";
		} else if (idioma.equals("frances")) {
			this.idioma = "frances";
		} else if (idioma.equals("aleman")) {
			this.idioma = "aleman";
		} else {
			this.idioma = null;
		}

	}

  	/**
   	* @return 'String'
	*
    	*/
	public String getIdioma() {
		return idioma;
	}
	
  	/**
   	* @return 'String'
	*
    	*/
	public String getNombreJugador() {
		return nombre;
	}

  	/**
   	* @return 'int'
	*
    	*/
	public int getEdad() {
		return edad;
	}

	/**
	* Método para crear el tipo de jugador
	* @return 'String'
	* @param edadNula - La edad dada no es válida, se interpreta como '-1'
	* @param edadMinima - La edad mímina necesaria para aceptar al jugador ->
	* -> (coincide con la edad mímina para ser un jugador de tipo 'Junior')
	* @param edadMaximaJunior - La edad máxima posible para crear un jugador 'Junior'
	* @param edadMinimaSenior - La edad mínima necesaria para crear un jugador 'Senior'
	* @param edadMaximaSenior - La edad máxima posible para crear un jugador 'Senior'
	* @param edadMinimaMaster - La edad mínima necesaria para crear un jugador 'Master'
	* @param edadMaximaMaster - La edad máxima posible para crear un jugador 'Master'
	* Las edades superiores a 'edadMaximaMaster' devolverán el tipo de jugador 'SuperMaster'
	* 
	*/
	public String tipoJugador() {
		
		int edadNula = -1;
		int edadMinima = 18;
		int edadMaximaJunior = 25;
		int edadMinimaSenior = 26;
		int edadMaximaSenior = 35;
		int edadMinimaMaster = 36;
		int edadMaximaMaster = 100;

		if (nombre != null && edad != edadNula && idioma != null) {
			if (edad < edadMinima) {
				return null;
			} else if (edad >= edadMinima && edad <= edadMaximaJunior) {
				return "Junior";
			} else if (edad >= edadMinimaSenior && edad <= edadMaximaSenior) {
				return "Senior";
			} else if (edad >= edadMinimaMaster && edad <= edadMaximaMaster) {
				return "Master";
			} return "SuperMaster";
		} else {
			return null;
		}

	}
	
}
