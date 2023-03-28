package vehiculos;
import java.util.ArrayList; 


public class Pais {
	private String nombre;
	private int cantventa;
	protected static ArrayList listaPaises=new ArrayList();
	
	public Pais(String nombre) {
		this.nombre=nombre;
		
		
		
		listaPaises.add(this);
		listaPaises.add(0);
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
	
	public static Pais paisMasVendedor() {
		int ventamayor=-1;
		Pais paismayor=null;
		for (int i = 1; i < listaPaises.size(); i += 2) { 
			if ((int)listaPaises.get(i)>ventamayor){
				ventamayor=(int)listaPaises.get(i);
				paismayor=(Pais)listaPaises.get(i-1);	
			}
		}
		
		return paismayor;
	} 
		
}