/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvServicioDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaCdv;

/**
 * @author Gamaliel
 * 
 */
public interface CdvServicioDao extends 
					PersistenceDao<CdvServicioEntity, LlaveCompuestaCdv> {
	
	/**
	 * M&eacute;todo encargado de recuperar un cdvServicio por cveCdv
	 * y regresar una lista para un combo.
	 * @param Integer cveCdv.
	 * @return  List<SelectItem>.
	 */
	 List<CdvServicioEntity> recuperarCdvServicios(Long cveCdv);
	

}
