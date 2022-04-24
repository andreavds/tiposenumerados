import java.util.*;
public class Uso_Edificio {
	
	enum piso{
		
		PB("PLANTA BAJA"), P1("PRIMER PISO"), P2("SEGUNDO PISO"), P3("TERCER PISO"), PH("PENTHOUSE");
		
		private piso(String nombre) {
			
			this.nombre = nombre;
		}
		
		public String dameNombre() {
			
			return nombre;
		}
		
		private String nombre;
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿En que piso se encuentra? PB, P1, P2, P3, PH");
		String entrada_datos = entrada.next().toUpperCase();
		piso piso_destino = Enum.valueOf(piso.class, entrada_datos);
		
		System.out.println("Se ha enviado el pedido a " + piso_destino);
		System.out.println("Piso: " + piso_destino.dameNombre());
		
	}

}
