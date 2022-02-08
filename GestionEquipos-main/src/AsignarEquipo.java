
public class AsignarEquipo {
	private Equipo equipo;
	private Jugador jugador;


	public AsignarEquipo() {

	}

	public void setEquipo(Equipo equipo) {
		if(equipo.getNombreEquipo()!=null && equipo.getRanking()!=-1) {
			this.equipo=equipo;
		}else {
			this.equipo=null;
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
