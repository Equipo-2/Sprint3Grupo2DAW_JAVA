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
	* @param nombre -> Declaramos una variable de tipo String para la funcion setNombreJugador
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
	* @param edad -> Declaramos una variable de tipo Integer para la funcion setEdad
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
	* @param idioma -> Declaramos una variable de tipo String para la funcion setIdioma
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
	* No recibe ningun dato de entrada, tan solo devuelve una String (tipoJugador)
	*/
	public String tipoJugador() {
		
		int edadNula = -1;
		int edadMinima = 18;
		int edadMaximaJunior = 25;
		int edadMinimaSenior = 26;
		int edadMaximaSenior = 35;
		int edadMinimaMaster = 36;
		int edadMaximaMaster = 100;
		
		String tipoJunior = "Junior";
		String tipoSenior = "Senior";
		String tipoMaster = "Master";
		String tipoSuperMaster = "SuperMaster";

		if (nombre != null && edad != edadNula && idioma != null) {
			if (edad >= edadMinima && edad <= edadMaximaJunior) {
				tipoJugador = tipoJunior;
			} else if (edad >= edadMinimaSenior && edad <= edadMaximaSenior) {
				tipoJugador = tipoSenior;
			} else if (edad >= edadMinimaMaster && edad <= edadMaximaMaster) {
				tipoJugador = tipoMaster;
			} else {
				tipoJugador = tipoSuperMaster;
			}
		} else {
			tipoJugador = null;
		}
		return tipoJugador;

	}
	
}
