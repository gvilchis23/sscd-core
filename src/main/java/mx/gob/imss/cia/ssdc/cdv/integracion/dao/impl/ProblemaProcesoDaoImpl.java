/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ProblemaProcesoDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ProblemaProcesoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ProblemaProcesoEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("problemaProcesoDao")
public class ProblemaProcesoDaoImpl extends
AbstractPersistenceDaoGenericHibernate<ProblemaProcesoEntity, Long>
implements  ProblemaProcesoDao  {

	@Autowired
	public ProblemaProcesoDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
