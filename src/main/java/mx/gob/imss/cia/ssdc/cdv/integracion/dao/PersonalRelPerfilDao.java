/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: PersonalRelPerfilDao.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaUsuarios;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalRelPerfilEntity;

/**
 * @author propietario
 *
 */
public interface PersonalRelPerfilDao
	extends PersistenceDao<PersonalRelPerfilEntity, LlaveCompuestaUsuarios> {
	
	PersonalRelPerfilEntity recuperarPersonal(Long cvePersonal); 

}
