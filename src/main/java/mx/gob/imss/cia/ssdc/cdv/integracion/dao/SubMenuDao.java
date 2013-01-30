/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SubMenuDao.java
 *
 * Creado:  Nov 8, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SubMenuEntity;

/**
 * @author propietario
 *
 */
public interface SubMenuDao extends
PersistenceDao<SubMenuEntity, Long>{
	
	List<SubMenuEntity> filtrarSubMenuPorCveMenu(Long cveMenu); 

}
