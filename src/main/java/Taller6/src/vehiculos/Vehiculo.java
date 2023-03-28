package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int VelocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	
	public Vehiculo(String placa,int puertas,int VelocidadMaxima,String nombre,int precio,int peso,String traccion,Fabricante fabricante) {
		this.placa=placa;
		this.puertas=puertas;
		this.VelocidadMaxima=VelocidadMaxima;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		this.traccion=traccion;
		this.fabricante=fabricante;
		Vehiculo.cantidadVehiculos++;
		
		
		int ubiventfabri=Fabricante.listaFabricantes.indexOf(fabricante)+1;
		int valorActualventfabri = (int) Fabricante.listaFabricantes.get(ubiventfabri);
		Fabricante.listaFabricantes.set(ubiventfabri,valorActualventfabri ++);; 
		
		int ubiventpais=Pais.listaPaises.indexOf(fabricante.getPais())+1;
		int valorActualventpais=(int) Pais.listaPaises.get(ubiventpais);
		Pais.listaPaises.set(ubiventpais,valorActualventpais++);

	}
	
	public void setPlaca(String placa) {
		this.placa = placa;}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;}
	
	public void setVelocidadMaxima(int VelocidadMaxima) {
		this.VelocidadMaxima = VelocidadMaxima;}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;}
	
	public void setPrecio (int precio) {
		this.precio=precio;}
	
	public void setPeso (int peso) {
		this.peso=peso;}
	
	public void setTraccion (String traccion) {
		this.traccion=traccion;
	}
	public void setFabricante (Fabricante fabricante) {
		this.fabricante=fabricante;}
	
	public String getPlaca() {
		return placa;}
	
	public int getPuertas() {
		return puertas;}
	
	public int getVelocidadMaxima () {
		return VelocidadMaxima;}
	
	public String getNombre() {
		return nombre;}
	
	public int getPrecio () {
		return precio;}
	
	public int getPeso () {
		return peso;}
	
	public String getTraccion () {
		return traccion;
	}
	
	public Fabricante getFabricante () {
		return fabricante;
	}
	
	public static void setCantidadVehiculos(int CantidadVehiculos) {
		Vehiculo.cantidadVehiculos=cantidadVehiculos;
	}
	
	public static int getCantidadVehiculos () {
		return Vehiculo.cantidadVehiculos;
	}
	
	//metodos vehiculosportipo
	public String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getCantidadAutomoviles()+"\nCamionetas: "+Camioneta.getCantidadCamionetas()+"\nCamiones: "+Camion.getCantidadCamiones();
}
}