/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: RequisitosCdvDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaRequisitosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosCdvEntity;

/**
 * @author Gamaliel
 * 
 */
public interface RequisitosCdvDao extends
		PersistenceDao<RequisitosCdvEntity, LlaveCompuestaRequisitosCdv> {
	
	List<RequisitosCdvEntity> recuperarRequisitosCdv(LlaveCompuestaRequisitosCdv llave);

}
