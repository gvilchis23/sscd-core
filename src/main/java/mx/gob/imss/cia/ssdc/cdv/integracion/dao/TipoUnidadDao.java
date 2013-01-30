/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoUnidadDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoUnidadEntity;

/**
 * @author Gamaliel
 * 
 */
public interface TipoUnidadDao extends PersistenceDao<TipoUnidadEntity, Long> {

	List<TipoUnidadEntity> filtrarTipoPorStatus(int status);

	TipoUnidadEntity llenarComboTipoUnidadById(Long cveTipoUnidad);

}