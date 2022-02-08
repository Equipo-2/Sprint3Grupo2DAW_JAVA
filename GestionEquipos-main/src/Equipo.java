
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
				this.nombreEquipo=nombreEquipo.toUpperCase();
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
		switch (ranking) {
		case 1:
		case 2:
			this.categoriaEquipo="categoria tercera";
		case 3:
		case 4:
		case 5:
		case 6:
			this.categoriaEquipo="categoria segunda";
		case 7:
		case 8:
		case 9:
		case 10:
			this.categoriaEquipo="categoria primera";
		default:
			this.categoriaEquipo=null;
		}	
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
