/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SubMenuDaoImpl.java
 *
 * Creado:  Nov 8, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SubMenuDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SubMenuEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("subMenuDao")
public class SubMenuDaoImpl  extends
AbstractPersistenceDaoGenericHibernate<SubMenuEntity, Long>
implements SubMenuDao  {

	@Autowired
	public SubMenuDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	public List<SubMenuEntity> filtrarSubMenuPorCveMenu(Long cveMenu) {
		List<SubMenuEntity> lista = (ArrayList<SubMenuEntity>)
				getHibernateTemplate()
        .find("from SubMenuEntity m " + "where m.menu.cveMenu=?",cveMenu);
		return lista;
	}

}
