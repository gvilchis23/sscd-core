/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ResultadoServicioDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;

/**
 * @author Gamaliel
 * 
 */
public interface ResultadoServicioDao extends
        PersistenceDao<ResultadoServicioEntity, Long> {

	/**
	 * M&eacute;todo encargado de recuperar un resultado de servicio por
	 * cveCategoria y regresar una lista para un combo.
	 * 
	 * @param status
	 *            TODO
	 * @param Integer
	 *            cveCategoria.
	 * @return List<SelectItem>.
	 */
	List<ResultadoServicioEntity> filtrarResultadoServicioPorVentanillaYStatus(
	        Long cveCategoria, int status);

}