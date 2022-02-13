/**
 * La clase Asignar Equipo y sus metodos (Equipo,Jugador)
 * 
 */
public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;
	/**
	 * @param rankingInvalido -> Es el ranking no aceptado en un equipo
	 */
	private int rankingInvalido = -1;
	
		
	
	public AsignarEquipo() {

	}
	
	/**
	 * Metodo para colocar a un equipo
	 * Mientras que el nombre del equipo no sea null y el ranking tampoco sea null el equipo se guarda
	 */
	public void setEquipo(Equipo equipo) {
		
		if( equipo!= null ) {
			this.equipo = equipo;
			if( equipo.getNombreEquipo()!= null  &&  equipo.getRanking() != rankingInvalido ) {
				this.equipo = equipo;
			} else {
				this.equipo = null; 
			}
		}
	}

	/**
	 * Metodo para colocar un jugador en un equipo
	 * Mientras que el nombre del jugador no sea null, la edad no sea invalida y el idioma no sea null, el jugador sera guardado
	 */
	public void setJugador(Jugador jugador) {

		if (jugador!=null) {
			if (jugador.getNombreJugador()!=null && jugador.getEdad() != rankingInvalido && jugador.getIdioma()!=null) {
				this.jugador = jugador;
			} else {
				this.jugador = null;
			}
		}

	}
/**
 * 
 * @return - Devuelve el equipo que ha sido validado antes
 */
	public Equipo getEquipo(){
		return equipo;
	}

/**
 * 
 * @return - Devuelve el jugador validado en el metodo setJugador
 */
	public Jugador getJugador(){
		return jugador;
	}

}
