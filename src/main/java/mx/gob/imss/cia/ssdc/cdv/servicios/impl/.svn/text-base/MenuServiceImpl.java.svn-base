/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MenuServiceImpl.java
 *
 * Creado:  Nov 7, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.MenuDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PerfilPersonalDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PersonalDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PersonalRelPerfilDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SubMenuDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MenuEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PerfilPersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalRelPerfilEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SubMenuEntity;
import mx.gob.imss.cia.ssdc.cdv.servicios.MenuService;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author propietario
 *
 */
@Transactional
@Service("menuService")
public class MenuServiceImpl  implements MenuService {
	
	@Autowired
	private MenuDao menuDao;
	@Autowired
	private PersonalDao personalDao;
	@Autowired
	private PersonalRelPerfilDao personalRelPerfilDao;
	@Autowired
	private PerfilPersonalDao perfilPersonalDao;
	@Autowired
	private SubMenuDao subMenuDao;
	

	@Override
	public List<MenuEntity> filtrarMenuPorRol(Long cveTipo) {
		List<MenuEntity> lista=null;
		if(cveTipo.compareTo(Constantes.USUARIO_CENTRAL)==0){
			lista=menuDao.filtrarMenuPorRol(Constantes.CENTRAL);
		}else if(cveTipo.compareTo(Constantes.USUARIO_UNIDAD)==0){
			lista=menuDao.filtrarMenuPorRol(Constantes.UNIDAD);
		}else if(cveTipo.compareTo(Constantes.USUARIO_DELEGACION)==0){
			lista=menuDao.filtrarMenuPorRol(Constantes.DELEGACION);
		}
		
		List<SubMenuEntity> listSubMenu=new ArrayList<SubMenuEntity>();
		int x=0;
		for(MenuEntity menu:lista){
			if(menu.getHijos()==1){
				listSubMenu = recuperarSubByCveMenu(menu.getCveMenu());
				menu.setSubMenu(listSubMenu);
				lista.set(x, menu);
			}
			x++;
		}
		
		return lista;
	}

	@Override
	public PersonalEntity recuperarUsuarioByUsuario(String usuario) {
		return personalDao.recuperarUsuario(usuario);
	}

	@Override
	public PersonalRelPerfilEntity recuperarPersonalByCvePersonal(Long cvePersonal) {
		return personalRelPerfilDao.recuperarPersonal(cvePersonal);
	}

	@Override
	public PerfilPersonalEntity recuperarPerfilByCvePerfil(Long cvePerfil) {
		return perfilPersonalDao.read(cvePerfil);
	}

	@Override
	public List<SubMenuEntity> recuperarSubByCveMenu(Long cveMenu) {
		return subMenuDao.filtrarSubMenuPorCveMenu(cveMenu);
	}

}
