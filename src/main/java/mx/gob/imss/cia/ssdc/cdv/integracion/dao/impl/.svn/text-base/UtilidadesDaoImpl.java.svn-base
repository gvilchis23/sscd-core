/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: UtilidadesDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.UtilidadesDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.UtilidadesEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("utilidadesDao")
public class UtilidadesDaoImpl  extends
AbstractPersistenceDaoGenericHibernate<UtilidadesEntity, Long>
implements  UtilidadesDao {

	@Autowired
	public UtilidadesDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
