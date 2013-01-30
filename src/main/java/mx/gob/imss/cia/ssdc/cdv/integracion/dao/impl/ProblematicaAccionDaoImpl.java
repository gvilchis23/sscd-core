/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ProblematicaAccionDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ProblematicaAccionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompProblAccion;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ProblematicaAccionEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("problematicaAccionDao")
public class ProblematicaAccionDaoImpl
extends AbstractPersistenceDaoGenericHibernate<ProblematicaAccionEntity, LlaveCompProblAccion>
implements  ProblematicaAccionDao{

	@Autowired
	public ProblematicaAccionDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
