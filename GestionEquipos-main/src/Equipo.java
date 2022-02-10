
public class Equipo {
	private String nombreEquipo;
	private int ranking;
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
		if (nombreEquipo==null && ranking==-1) {
			categoriaEquipo=null;
		}else {
			switch (ranking) {
			case 1:
			case 2:
				categoriaEquipo="categoria tercera";
			case 3:
			case 4:
			case 5:
			case 6:
				categoriaEquipo="categoria segunda";
			case 7:
			case 8:
			case 9:
			case 10:
				categoriaEquipo="categoria primera";
			}	
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
