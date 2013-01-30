/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: VentanillaPosteriorDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaPosteriorEntity;

public interface VentanillaPosteriorDao extends
        PersistenceDao<VentanillaPosteriorEntity, Long> {

	List<VentanillaPosteriorEntity> filtrarVentaPostPorTipoYStatus(
	        Long tipoVentanilla, int status);

}