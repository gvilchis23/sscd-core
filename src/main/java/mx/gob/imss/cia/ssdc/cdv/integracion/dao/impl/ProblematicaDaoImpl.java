/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ProblematicaDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ProblematicaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ProblematicaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("problematicaDao")
public class ProblematicaDaoImpl
extends AbstractPersistenceDaoGenericHibernate<ProblematicaEntity, Long>
implements  ProblematicaDao {

	@Autowired
	public ProblematicaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
