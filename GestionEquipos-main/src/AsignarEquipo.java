/**
 * La clase Asignar Equipo y sus metodos (Equipo,Jugador)
 * 
 */
public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;
		
	
	public AsignarEquipo() {

	}
	
	/**
	 * Metodo para colocar a un equipo
	 * Mientras que el nombre del equipo no sea null y el ranking tampoco sea null el equipo se guarda
	 * @param rankingInvalido -> Es el ranking no aceptado en un equipo
	 */
	public void setEquipo(Equipo equipo) {
		
		int rankingInvalido = -1;
		
		if( equipo!= null ) {
			this.equipo = equipo;
			if( equipo.getNombreEquipo()!= null  &&  equipo.getRanking()!= rankingInvalido ) {
				this.equipo = equipo;
			} else {
				this.equipo = null; 
			}
		}
	}


	public void setJugador(Jugador jugador) {

		if (jugador!=null) {
			if (jugador.getNombreJugador()!=null && jugador.getEdad()!=-1 && jugador.getIdioma()!=null) {
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

	public Jugador getJugador(){
		return jugador;
	}

}
