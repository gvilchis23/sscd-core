/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: RazonDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.RazonDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RazonEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("razonDao")
public class RazonDaoImpl  extends
AbstractPersistenceDaoGenericHibernate<RazonEntity, Long>
implements  RazonDao  {

	@Autowired
	public RazonDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
