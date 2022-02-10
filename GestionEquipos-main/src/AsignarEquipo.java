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
	 * Metodo para colocar un equipo
	 * Mientras que el nombre del equipo no sea null y el ranking tampoco sea null el equipo se guarda
	 * 
	 */
	
	public void setEquipo(Equipo equipo) {
		
		if( equipo!= null ) {
			this.equipo = equipo;
			if( equipo.getNombreEquipo()!= null  &&  equipo.getRanking()!= -1 ) {
				this.equipo = equipo;
			}else {
				this.equipo = null; 
			}
		}
	}


	public void setJugador(Jugador jugador) {

		if (jugador!=null) {
			if (jugador.getNombreJugador()!=null && jugador.getEdad()!=-1 && jugador.getIdioma()!=null) {
				this.jugador = jugador;
			}else {
				this.jugador = null;
			}
		}

	}

	public Equipo getEquipo(){
		return equipo;
	}

	public Jugador getJugador(){
		return jugador;
	}

}
