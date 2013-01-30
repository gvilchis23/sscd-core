/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: RequisitosDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.RequisitosDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Gamaliel
 * 
 */

@SuppressWarnings("unchecked")
@Repository("requisitosDao")
public class RequisitosDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<RequisitosEntity, Long>
        implements RequisitosDao {

	@Autowired
	public RequisitosDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<RequisitosEntity> filtrarRequisitoPorStatus(int status) {
		return getHibernateTemplate().find(
		        "from RequisitosEntity r where r.status = ?", status);
	}

}
