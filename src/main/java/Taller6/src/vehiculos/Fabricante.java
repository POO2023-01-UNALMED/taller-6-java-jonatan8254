package vehiculos;
import java.util.ArrayList;


public class Fabricante {
	private String nombre;
	private Pais pais;
	protected static ArrayList listaFabricantes=new ArrayList();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		listaFabricantes.add(this);
		listaFabricantes.add(0);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Pais getPais() {
		return pais;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setPais(Pais pais) {
		this.pais=pais;
	}

	
	public static Fabricante fabricaMayorVentas() {
		int ventamayor=-1;
		Fabricante fabricantemayor=null;
		for (int i = 1; i < listaFabricantes.size(); i += 2) { 
			if ((int)listaFabricantes.get(i)>ventamayor){
				ventamayor=(int)listaFabricantes.get(i);
				fabricantemayor=(Fabricante)listaFabricantes.get(i-1);	
			}
		}
		
		return fabricantemayor;
	}

}