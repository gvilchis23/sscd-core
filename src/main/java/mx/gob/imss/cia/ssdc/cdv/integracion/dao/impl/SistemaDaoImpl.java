/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: SistemaDaoImpl.java
 *
 * Creado:  Oct 18, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.SistemaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.SistemaEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author propietario
 *
 */

@SuppressWarnings("unchecked")
@Repository("sistemaDao")
public class SistemaDaoImpl  extends
AbstractPersistenceDaoGenericHibernate<SistemaEntity, Long>
implements  SistemaDao {

	@Autowired
	public SistemaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
