/**
 * La clase Jugador y sus metodos (nombre, edad, idioma, tipoJugador)
 * 
 */
public class Jugador {
	private String nombre;
	private String idioma;
	private String tipoJugador;
	private int edad;
	
	public Jugador () {
			
		}

       /**
	* Metodo para crear el nombre del jugador
	* @param nombreMinimoCaracteres - El numero minimo de caracteres necesarios ->
	* -> para que el nombre sea valido
	* @param nombreMaximoCaracteres - El numero maximo de caracteres posible ->
	* -> para que el nombre sea valido
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
  	* Metodo para crear la edad del jugador
   	* @param edadNula - La edad dada no es valida, se interpreta como '-1'
   	* @param edadMinima - La edad minima necesaria para aceptar al jugador
   	* @param edadMaxima - La edad maxima posible para aceptar al jugador
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
   	* Metodo para crear el idioma del jugador
   	* @param idiomaAceptado1 - El idioma aceptado es el "castellano"
   	* @param idiomaAceptado2 - El idioma aceptado es el "ingles"
   	* @param idiomaAceptado3 - El idioma aceptado es el "frances"
   	* @param idiomaAceptado4 - El idioma aceptado es el "aleman"
   	* Otros idiomas seran considerados como null (no validos)
	*
   	*/
	public void setIdioma(String idioma) {
		
		String idiomaAceptado1 = "castellano";
		String idiomaAceptado2 = "ingles";
		String idiomaAceptado3 = "frances";
		String idiomaAceptado4 = "aleman";
		
		if (idioma.equals(idiomaAceptado1)) {
			this.idioma = idiomaAceptado1;
		} else if (idioma.equals(idiomaAceptado2)) {
			this.idioma = idiomaAceptado2;
		} else if (idioma.equals(idiomaAceptado3)) {
			this.idioma = idiomaAceptado3;
		} else if (idioma.equals(idiomaAceptado4)) {
			this.idioma = idiomaAceptado4;
		} else {
			this.idioma = null;
	}

	}

       /**
   	* @return 'String' (devuelve el idioma del jugador)
	*
        */
	public String getIdioma() {
		return idioma;
	}
	
       /**
   	* @return 'String' (devuelve el nombre del jugador)
	*
        */
	public String getNombreJugador() {
		return nombre;
	}

       /**
   	* @return 'int' edad (devuelve la edad del jugador)
	*
        */
	public int getEdad() {
		return edad;
	}

       /**
	* Metodo para crear el tipo de jugador
	* @return 'String' (devuelve un String con el tipo de jugador)
	* @param edadNula - La edad dada no es valida, se interpreta como '-1'
	* @param edadMinima - La edad mimina necesaria para aceptar al jugador ->
	* -> (coincide con la edad mimina para ser un jugador de tipo 'Junior')
	* @param edadMaximaJunior - La edad maxima posible para crear un jugador 'Junior'
	* @param edadMinimaSenior - La edad minima necesaria para crear un jugador 'Senior'
	* @param edadMaximaSenior - La edad maxima posible para crear un jugador 'Senior'
	* @param edadMinimaMaster - La edad minima necesaria para crear un jugador 'Master'
	* @param edadMaximaMaster - La edad maxima posible para crear un jugador 'Master'
	* Las edades superiores a 'edadMaximaMaster' devolveran el tipo de jugador 'SuperMaster'
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
			if (edad >= edadMinima && edad <= edadMaximaJunior) {
				tipoJugador = "Junior";
			} else if (edad >= edadMinimaSenior && edad <= edadMaximaSenior) {
				tipoJugador = "Senior";
			} else if (edad >= edadMinimaMaster && edad <= edadMaximaMaster) {
				tipoJugador = "Master";
			} else {
				tipoJugador = "SuperMaster";
			}
		} else {
			tipoJugador = null;
		}
		return tipoJugador;

	}
	
}
