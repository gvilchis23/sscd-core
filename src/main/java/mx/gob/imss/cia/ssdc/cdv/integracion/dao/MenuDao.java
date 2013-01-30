/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MenuDao.java
 *
 * Creado:  Nov 7, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MenuEntity;

/**
 * @author propietario
 *
 */
public interface MenuDao extends
	PersistenceDao<MenuEntity, Long>{
	
	List<MenuEntity> filtrarMenuPorRol(String tipo); 

}
