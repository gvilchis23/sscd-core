/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CategoriaDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CategoriaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CategoriaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Gamaliel
 * 
 */

@SuppressWarnings("unchecked")
@Repository("categoriaDao")
public class CategoriaDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<CategoriaEntity, Long> implements
		CategoriaDao {
	/**
	 * 
	 * @param hibernateTemplate
	 */
	@Autowired
	public CategoriaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}
	
	
}
