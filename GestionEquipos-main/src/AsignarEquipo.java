
public class AsignarEquipo {
      private Equipo equipo;
      private Jugador jugador;
      
      
      public AsignarEquipo() {
    	  
      }
      
      public void setEquipo(Equipo equipo) {
  		//code here
      }
      
      public void setJugador(Jugador jugador) {

    	  if (jugador.getNombreJugador()!=null && jugador.getEdad()>18 && jugador.getEdad()<100 && jugador.getIdioma()!=null) {
    		  this.jugador = jugador;
    	  }else {
    		  this.jugador = null;
    	  }
    	  
      }
      
      public Equipo getEquipo(){
          return equipo;
      }
      
      public Jugador getJugador(){
         return jugador;
      }
      
}
