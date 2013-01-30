/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ServicioDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;

/**
 * @author Gamaliel
 * 
 */
public interface ServicioDao extends PersistenceDao<ServicioEntity, Long> {

	/**
	 * M&eacute;todo encargado de recuperar un servicio por cveCategoria y
	 * regresar una lista para un combo.
	 * 
	 * @param status
	 *            TODO
	 * @param Integer
	 *            cveCategoria.
	 * @return List<SelectItem>.
	 */
	List<ServicioEntity> filtrarServicioPorCategoriaYStatus(Long cveCategoria,
	        int status);

}
