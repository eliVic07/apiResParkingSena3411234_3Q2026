package com.sena.parqueadero.dto;

import com.sena.parqueadero.model.TipoVehiculo;

import lombok.Data;

@Data
public class VehiculoDTO {
	private Long idVehiculo;
	
	private String placa;
	private TipoVehiculo tipo;
	private String marca;
	private String modelo;

}
