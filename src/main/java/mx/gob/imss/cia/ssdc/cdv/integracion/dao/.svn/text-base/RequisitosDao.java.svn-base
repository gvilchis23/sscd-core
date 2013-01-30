/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: RequisitosDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosEntity;

/**
 * @author Gamaliel
 *
 */
public interface RequisitosDao extends PersistenceDao<RequisitosEntity, Long>{
	
	/**
	 * M&eacute;todo encargado de llenar requisitos por tipoVentanilla
	 * y regresar una lista para un combo o picklist.
	 * @param Integer tipoVentanilla.
	 * @return  List<SelectItem>.
	 */
	  List<RequisitosEntity> filtrarRequisitoPorStatus(int status);

}
