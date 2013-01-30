/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: ObjetivoActControlDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ObjetivoActControlDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ObjetivoActControlEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("objetivoActControlDao")
public class ObjetivoActControlDaoImpl  extends
AbstractPersistenceDaoGenericHibernate<ObjetivoActControlEntity, Long>
implements  ObjetivoActControlDao  {

	@Autowired
	public ObjetivoActControlDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
