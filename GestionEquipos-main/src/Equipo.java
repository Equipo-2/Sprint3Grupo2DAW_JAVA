
public class Equipo {
	private String nombreEquipo;
	private int ranking=-1;
	private String categoriaEquipo;	

	public Equipo() {
		
	}
	
 	public void setNombreEquipo(String nombreEquipo) {
		if (nombreEquipo==null) {
			this.nombreEquipo=null;
		}else {
			boolean letra=true;
			nombreEquipo = nombreEquipo.toUpperCase();
			
			for (int i=0;i<nombreEquipo.length() && letra;i++) {
				if ((nombreEquipo.charAt(i)>=('A') && nombreEquipo.charAt(i)<=('Z') 
						|| nombreEquipo.charAt(i)==(' ')) &&
						nombreEquipo.length()>=5 && nombreEquipo.length()<=20) {
					this.nombreEquipo=nombreEquipo;
					letra=true;
				}else {
					this.nombreEquipo=null;
					letra=false;
				}
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
	public String categoriaEquipo() {
		int rankingInvalido = -1;
		
		if (nombreEquipo != null && ranking != rankingInvalido) {
			if (ranking == 10 || ranking == 9 || ranking == 8 || ranking == 7) {
				categoriaEquipo="categoria primera";
			} else if (ranking == 6 || ranking == 5 || ranking == 4 || ranking == 3) {
				categoriaEquipo="categoria segunda";
			} else if (ranking == 2 || ranking == 1 ) {
				categoriaEquipo="categoria tercera";
			} 
		} else {
			categoriaEquipo = null;
		}
		return categoriaEquipo;
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public int getRanking() {
		return ranking;
	}



}
