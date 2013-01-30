/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MenuDaoImpl.java
 *
 * Creado:  Nov 7, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.MenuDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MenuEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author propietario
 *
 */
@SuppressWarnings("unchecked")
@Repository("menuDao")
public class MenuDaoImpl extends
AbstractPersistenceDaoGenericHibernate<MenuEntity, Long>
implements MenuDao {

	@Autowired
	public MenuDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<MenuEntity> filtrarMenuPorRol(String tipo) {
		List<MenuEntity> lista = (ArrayList<MenuEntity>) getHibernateTemplate()
		        .find("from MenuEntity m " + "where m."+tipo+"=1");
		return lista;
	}

}
