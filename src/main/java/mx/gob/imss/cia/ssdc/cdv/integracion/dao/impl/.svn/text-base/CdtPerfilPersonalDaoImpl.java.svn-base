/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdtPerfilPersonalDaoImpl.java
 *
 * Creado: 18/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdtPerfilPersonalDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdtPerfilPersonalEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("cdtPerfilPersonalDao")
public class CdtPerfilPersonalDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<CdtPerfilPersonalEntity, Long>
		implements CdtPerfilPersonalDao {

	@Autowired
	public CdtPerfilPersonalDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
