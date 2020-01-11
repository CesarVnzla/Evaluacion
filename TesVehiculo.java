package Vehiculos;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class TesVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat formato= new DecimalFormat("###,###.00");
		VehiculoCarac vehi= new VehiculoCarac();
		
		VehiculoCarac vehiculo1 = new VehiculoCarac("Peugeot", "206","4",null,200000.00);
		VehiculoCarac vehiculo2 = new VehiculoCarac("Honda", "Titan",null,"125c",60000.00);
		VehiculoCarac vehiculo3= new VehiculoCarac("Peugeot", "208","5",null,250000.00);
		VehiculoCarac vehiculo4= new VehiculoCarac("Yamaha", "YBR",null,"160c",80500.50);
	
		
		ArrayList<VehiculoCarac> vehiculoA = new ArrayList();
		
		vehiculoA.add(vehiculo1);
		vehiculoA.add(vehiculo2);
		vehiculoA.add(vehiculo3);
		vehiculoA.add(vehiculo4);
	
		
		for (VehiculoCarac vehiculoCarac : vehi.mostrar(vehiculoA)) {
			
			if(vehiculoCarac.getCilindradas()==null) {
				
				System.out.println("Marca: " + vehiculoCarac.getMarca() + " // " + " Modelo: " + vehiculoCarac.getModelo()+ " // " + " Puertas: " + vehiculoCarac.getPuertas() + " // " + " Precio: $" +formato.format( vehiculoCarac.getPrecio()));
				
			}else {
				
				System.out.println("Marca: " + vehiculoCarac.getMarca()+ " // " + " Modelo: " +  vehiculoCarac.getModelo()+ " // " + " Cilindradas: " + vehiculoCarac.getCilindradas() + " // " + " Precio: $" + formato.format( vehiculoCarac.getPrecio()));
				
			}
			
		}
		
		
		System.out.println("  ");
		
		
		VehiculoCarac ve = vehi.MayorPrecio(vehiculoA);
		
		System.out.println( "Vehiculo mas caro:  " + ve.getMarca() +" "+ ve.getModelo());
		
		
		VehiculoCarac ve2 = vehi.MenorPrecio(vehiculoA);
		
		System.out.println("Vehiculo mas barato: " + ve2.getMarca() + " " + ve2.getModelo());


		VehiculoCarac ve3 = vehi.Letra(vehiculoA);
		
		System.out.println("Vehiculo que contiene en el modelo la letra Y: "+" "+ve3.getMarca() + " " + ve3.getModelo() +" $" +formato.format(ve3.getPrecio()));

	}

}
