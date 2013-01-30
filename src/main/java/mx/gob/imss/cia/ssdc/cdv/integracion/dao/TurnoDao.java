/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TurnoDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TurnoEntity;
import mx.gob.imss.cia.ssdc.cdv.vo.TurnoVo;

/**
 * @author Gamaliel
 * 
 */
public interface TurnoDao extends PersistenceDao<TurnoEntity, Long> {

	/**
	 * M&eacute;todo encargado de recuperar TurnoEntity y regresar una lista
	 * para un combo.
	 * 
	 * @return List<SelectItem>.
	 */
	List<TurnoEntity> filtrarTurnoPorStatus(int status);

	List<TurnoVo> obtenerListadoTurnoVo(final int enable);

}