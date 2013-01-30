/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: DelegacionDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.DelegacionEntity;
import mx.gob.imss.cia.ssdc.cdv.vo.DelegacionVo;

/**
 * @author Gamaliel
 * 
 */
public interface DelegacionDao extends PersistenceDao<DelegacionEntity, Long> {

	List<DelegacionEntity> obtenerListadoDelegacionPorStatus(int status);

	List<DelegacionVo> obtenerListadoDelegacionVo(int status);

}