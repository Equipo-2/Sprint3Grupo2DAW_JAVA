
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	private String categoriaEquipo;	

	
	public void setNombreEquipo(String nombreEquipo) {
		if (nombreEquipo!=null) {
			boolean letra=true;
			nombreEquipo.toUpperCase();
			
			for (int i=0;i<nombreEquipo.length() && letra;i++) {
				if ((nombreEquipo.charAt(i)>=('A') && nombreEquipo.charAt(i)<=('Z') || nombreEquipo.charAt(i)==(' ')) &&
						nombreEquipo.length()>=5 && nombreEquipo.length()<=20) {
					this.nombreEquipo=nombreEquipo;
					letra=true;
				}else {
					this.nombreEquipo=null;
					letra=false;
				}
			}
		}else {
			this.nombreEquipo=null;
		}

	}
	public void setRanking(int ranking) {
		if (ranking<0 || ranking>10) {
			this.ranking=-1;
		}else {
			this.ranking=ranking;
		}
	}
	public String categoriaEquipo() {
		if (nombreEquipo!=null && ranking!=-1) {
			switch (ranking) {
			case 1:
			case 2:
				return categoriaEquipo="categoria tercera";
			case 3:
			case 4:
			case 5:
			case 6:
				return categoriaEquipo="categoria segunda";
			case 7:
			case 8:
			case 9:
			case 10:
				return categoriaEquipo="categoria primera";
			default:
				return categoriaEquipo=null;
			}	
		}else {
			return categoriaEquipo=null;
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
