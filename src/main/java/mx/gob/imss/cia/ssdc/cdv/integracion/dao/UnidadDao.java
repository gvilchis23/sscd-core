/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: UnidadDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.UnidadEntity;
import mx.gob.imss.cia.ssdc.cdv.vo.UnidadVo;

/**
 * @author Gamaliel
 * 
 */
public interface UnidadDao extends PersistenceDao<UnidadEntity, Long> {

	List<UnidadEntity> filtraUnidadesPorStatus(int status);

	List<UnidadEntity> filtrarUnidadByDelegacionYStatus(Long cveDelegacion,
	        int status);

	List<UnidadVo> obtenerListadoUnidadVo(final int status);

}