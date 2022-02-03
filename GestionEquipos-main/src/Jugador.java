
public class Jugador {
	private String nombre;
	private String idioma;
	private int edad;
	
	public Jugador () {
			
		}

	public void setNombreJugador(String nombre) {

		if (nombre.length()<4 || nombre.length()>20) {
			this.nombre = "";
		}else {
			this.nombre = nombre;
		}
	}

	public void setEdad(int edad) {
		
		if (edad<18 || edad>99) {
			this.edad = 0;
		}else {
			this.edad = edad;
		}
	}

	public void setIdioma(String idioma) {
		//code here
	}

	public void tipoJugador(String tipo) {

	}	
	
	public String getIdioma() {
		return idioma;
	}
	
	public String getNombreJugador() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
}
