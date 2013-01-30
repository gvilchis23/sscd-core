/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SubProblematicaDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SubProblematicaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SubProblematicaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("subProblematicaDao")
public class SubProblematicaDaoImpl extends
AbstractPersistenceDaoGenericHibernate<SubProblematicaEntity, Long>
implements  SubProblematicaDao {

	@Autowired
	public SubProblematicaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
