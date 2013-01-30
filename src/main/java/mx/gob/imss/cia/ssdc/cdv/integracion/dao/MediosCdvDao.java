/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MediosCdvDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaMediosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosCdvEntity;

/**
 * @author Gamaliel
 * 
 */
public interface MediosCdvDao extends 
				PersistenceDao<MediosCdvEntity, LlaveCompuestaMediosCdv> {
	
	List<MediosCdvEntity> recuperarMediosCdv(LlaveCompuestaMediosCdv llave);


}
