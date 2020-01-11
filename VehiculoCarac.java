package Vehiculos;

import java.util.ArrayList;



public class VehiculoCarac {

	private String Marca;
	private String Modelo;
	private String Puertas;
	private String Cilindradas;
	private double Precio;

	public VehiculoCarac(String marca, String modelo, String puertas, String cilindradas, double precio) {
		super();
		Marca = marca;
		Modelo = modelo;
		Puertas = puertas;
		Cilindradas = cilindradas;
		Precio = precio;
	}
	
	
	
	public VehiculoCarac() {
		super();
	}



	public ArrayList<VehiculoCarac> mostrar( ArrayList<VehiculoCarac> Vehiculo) {
		
		
		return Vehiculo;
	}
	
public VehiculoCarac MayorPrecio(ArrayList<VehiculoCarac> vehiculo){
		
	VehiculoCarac mayor=vehiculo.get(0);
		
		for (int i = 0; i < vehiculo.size(); i++) {
			
			if(vehiculo.get(i).getPrecio() >mayor.getPrecio()) {
				
				mayor=vehiculo.get(i);
			}
		}
	
		return mayor;
	}

public VehiculoCarac MenorPrecio(ArrayList<VehiculoCarac> vehiculo){
	
	VehiculoCarac mayor=vehiculo.get(0);
		
		for (int i = 0; i < vehiculo.size(); i++) {
			
			if(vehiculo.get(i).getPrecio() <mayor.getPrecio()) {
				
				mayor=vehiculo.get(i);
			}
		}
	
		return mayor;
	}

public VehiculoCarac Letra(ArrayList<VehiculoCarac> vehiculo){
	
	VehiculoCarac letra =  vehiculo.get(0);
	boolean verdad=false;
	
	for (int i = 0; i < vehiculo.size(); i++) {
		
		letra = vehiculo.get(i);
		String letra2= letra.getMarca();
		for (int j = 0; j < letra2.length(); j++) {
			
			if(letra2.charAt(j)=='Y') {
				verdad=true;
			}
		}
		if(verdad==true) {
			letra = vehiculo.get(i);
			break;
		}
	}
	
	return letra;
	
	}
	


	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPuertas() {
		return Puertas;
	}

	public void setPuertas(String puertas) {
		Puertas = puertas;
	}

	public String getCilindradas() {
		return Cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		Cilindradas = cilindradas;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}
	
	

}
