/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CategoriaRequisitosDaoImpl.java
 *
 * Creado: 17/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CategoriaRequisitosDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CategoriaRequisitosEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("categoriaRequisitosDao")
public class CategoriaRequisitosDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<CategoriaRequisitosEntity, Long>
		implements CategoriaRequisitosDao {

	@Autowired
	public CategoriaRequisitosDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
