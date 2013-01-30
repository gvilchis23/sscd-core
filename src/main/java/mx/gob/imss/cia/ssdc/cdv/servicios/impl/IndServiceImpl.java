/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: IndServiceImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios.impl;

import java.util.List;
import java.util.Map;

import mx.gob.imss.cia.ssdc.cdv.servicios.IndService;

import org.springframework.stereotype.Service;

@Service("indService")
public class IndServiceImpl implements IndService {

	@Override
	public String generarReporte(String aux, String block1, String block2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void descargarReporte(List<Map<String, String>> parametros) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Map<String, String>> obtenerProblematicas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> obtenerCobertura() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, String>> obtenerDelegacion() {
		// TODO Auto-generated method stub
		return null;
	}

}
