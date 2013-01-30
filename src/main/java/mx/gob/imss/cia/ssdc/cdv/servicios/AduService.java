/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AduService.java
 *
 * Creado:  Nov 1, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios;

import java.util.List;
import java.util.Map;

/**
 * @author AbySavvy
 *
 */
public interface AduService{
	List<Map<String,String>> getTipoUsuarioList();
		
	
	//List<Map<String,String>> obtenerTodos();
}
