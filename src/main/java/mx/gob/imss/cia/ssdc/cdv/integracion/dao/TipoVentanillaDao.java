/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoVentanillaDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoVentanillaEntity;
import mx.gob.imss.cia.ssdc.cdv.vo.TipoVentanillaVo;

/**
 * @author Gamaliel
 * 
 */
public interface TipoVentanillaDao extends
        PersistenceDao<TipoVentanillaEntity, Long> {

	/**
	 * M&eacute;todo encargado de recuperar una lista de ventanillas por
	 * status=1 y regresar una lista para un combo.
	 * 
	 * @param status
	 *            TODO
	 * @return List<SelectItem>.
	 */
	List<TipoVentanillaEntity> filtrarTipoVentanillaPorStatus(int status);

	List<TipoVentanillaVo> obtenerListadoTipoVentanillaVo(int status);

}
