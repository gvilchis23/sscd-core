/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PanelService.java
 *
 * Creado:  Oct 27, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.vo.RegistroCdvPaavVo;

/**
 * @author abySavvy
 * 
 */
public interface PanelService {

	/**
	 * Regresa la lista de Registros
	 * 
	 * @return List<Map<String, String>>
	 */ 
	
	List<RegistroCdvPaavVo> obtenListadoRegistroCdvPaav();
}
