
public class Equipo {
	private String nombreEquipo;
	private int ranking;
	private String categoriaEquipo;	

	
	public void NombreEquipo(String nombreEquipo) {
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
	public void Ranking(int ranking) {
		if (ranking<0 || ranking>10) {
			this.ranking=-1;
		}else {
			this.ranking=ranking;
		}
	}
	public String CategoriaEquipo() {
		if (nombreEquipo!=null && ranking!=-1) {
			switch (ranking) {
			case 1:
			case 2:
				return "categoria tercera";
			case 3:
			case 4:
			case 5:
			case 6:
				return "categoria segunda";
			case 7:
			case 8:
			case 9:
			case 10:
				return "categoria primera";
			default:
				return null;
			}	
		}else {
			return null;
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
