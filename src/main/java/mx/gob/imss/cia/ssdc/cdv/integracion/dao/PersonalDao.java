/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PersonalDao.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalEntity;

/**
 * @author Gamaliel
 *
 */
public interface PersonalDao extends PersistenceDao<PersonalEntity, Long>{
	
	PersonalEntity recuperarUsuario(String usuario); 

}
