
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	private String categoriaEquipo;	
	
	public Equipo () {
	}
	
	
	public void setNombreEquipo(String nombreEquipo) {
		boolean letra=true;
		String nombreEquipo2=nombreEquipo.toLowerCase();
		
		for (int i=0;i<nombreEquipo2.length() && letra;i++) {
			if ((nombreEquipo2.charAt(i)>=('a') && nombreEquipo2.charAt(i)<=('z') || nombreEquipo2.charAt(i)==(' ')) &&
				nombreEquipo2.length()>=5 && nombreEquipo2.length()<=20) {
				this.nombreEquipo=nombreEquipo;
				letra=true;
			}else {
				this.nombreEquipo=null;
				letra=false;
			}
		}
	}
	public void setRanking(int ranking) {
		if (ranking<0 || ranking>10) {
			this.ranking=-1;
		}else {
			this.ranking=ranking;
		}
	}
	
	public void setCategoriaEquipo(String categoriaEquipo) {
		// Futuro código
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}
	public String getCategoriaEquipo() {
		return categoriaEquipo;
	}



}
