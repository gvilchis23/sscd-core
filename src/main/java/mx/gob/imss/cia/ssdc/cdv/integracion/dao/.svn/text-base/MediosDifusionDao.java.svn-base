/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MediosDifusionDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosDifusionEntity;

/**
 * @author Gamaliel
 * 
 */
public interface MediosDifusionDao extends
        PersistenceDao<MediosDifusionEntity, Long> {

	/**
	 * M&eacute;todo encargado de llenar mediosdifusion por tipoVentanilla y
	 * regresar una lista para un combo o picklist.
	 * @param status TODO
	 * @param Integer
	 *            tipoVentanilla.
	 * 
	 * @return List<SelectItem>.
	 */
	List<MediosDifusionEntity> filtrarDifusionPorStatus(int status);
}