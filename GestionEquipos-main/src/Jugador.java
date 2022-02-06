
public class Jugador {
	private String nombre;
	private String idioma;
	private int edad;
	private String tipo;
	
	public Jugador () {

		}

	public void setNombreJugador(String nombre) {

		if(nombre != null) {
		    if (nombre.length()>=4 && nombre.length()<=20) {
			if (nombre.matches("[a-zA-Z]+")) {
			    this.nombre=nombre.toUpperCase();
			}
		    }
		}else{
		    this.nombre= null;
		}
        
	}

	public void setEdad(int edad) {
		
		if (edad<18 || edad>100) {
			this.edad = -1;
		}else {
			this.edad = edad;
		}
	}

	public void setIdioma(String idioma) {
		
		if (idioma.equals("castellano")) {
			this.idioma = "castellano";
		}else if (idioma.equals("ingles")) {
			this.idioma = "ingles";
		}else if (idioma.equals("frances")) {
			this.idioma = "frances";
		}else if (idioma.equals("aleman")) {
			this.idioma = "aleman";
		}else {
			this.idioma = null;
		}
		
	}
	
	public void setTipoJugador(int edad) {
		if (edad>=18 && edad<=25) {
			this.tipo = "Junior";
		}else if (edad>25 && edad<=35) {
			this.tipo = "Senior";
		}else if (edad>35 && edad<=99) {
			this.tipo = "Master";
		}else if (edad<=100) {
			this.tipo = "SuperMaster";
		}else {
			this.tipo = null;
		}
	}

	
	public String getNombreJugador() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	
	public String getIdioma() {
		return idioma;
	}

	public String getTipoJugador() {
		return tipo;
	}

}
