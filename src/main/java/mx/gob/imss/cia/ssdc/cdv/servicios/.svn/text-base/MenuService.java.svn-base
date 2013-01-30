/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MenuService.java
 *
 * Creado:  Nov 7, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MenuEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PerfilPersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalRelPerfilEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SubMenuEntity;

/**
 * @author propietario
 *
 */
public interface MenuService {
	
	/**
	 * Regresa la lista del menu
	 * 
	 * @return List<MenuEntity>
	 */ 
	
	List<MenuEntity> filtrarMenuPorRol(Long cveTipoUsuario); 
	PersonalEntity recuperarUsuarioByUsuario(String usuario);
	PersonalRelPerfilEntity recuperarPersonalByCvePersonal(Long cvePersonal); 
	PerfilPersonalEntity recuperarPerfilByCvePerfil(Long cvePerfil);
	List<SubMenuEntity> recuperarSubByCveMenu(Long cveMenu);
	

}
