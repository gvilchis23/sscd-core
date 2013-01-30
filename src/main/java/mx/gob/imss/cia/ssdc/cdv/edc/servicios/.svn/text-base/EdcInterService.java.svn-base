/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcInterService.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.edc.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaAnteriorEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaPosteriorEntity;

/**
 * @author propietario
 * 
 */
public interface EdcInterService {

	/**
	 *  Regresa la lista de las ventanillas interrelacionadas anteriores especificas
	 *  para una ventanilla. 
	 * @param tipoVentanilla
	 * @return
	 */
	List<VentanillaAnteriorEntity> llenarComboVentaAnterior(Long tipoVentanilla);
	
	/**
	 * Regresa la lista de las ventanillas interrelacionadas posteriores especificas
	 * para una ventanilla. 
	 * @param tipoVentanilla
	 * @return
	 */
	List<VentanillaPosteriorEntity> llenarComboVentaPost(Long tipoVentanilla);

	/**
	 * Obtiene a partir de la clave de la seleccion en el combobox, la ventanilla interrelacionada anterior, 
	 * a partir de la seleccion en el combobox 
	 * @param cveAnterior
	 * @return
	 */
	VentanillaAnteriorEntity recuperarVentanillaAnterior(Long cveAnterior);

	/**
	 * Obtiene a partir de la clave de la seleccion en el combobox, la ventanilla interrelacionada posterior, 
	 * a partir de la seleccion en el combobox 
	 * @param cveAnterior
	 * @return
	 */
	VentanillaPosteriorEntity recuperarVentanillaPosterior(Long cvePosterior);

	/**
	 * Realiza el guardado de las ventanillas interrelacionadas por cada servicio guardado previamente.
	 * @param entidad
	 */
	void updateCdvServicio(CdvServicioEntity entidad);

}
