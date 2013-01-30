/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvPersonaDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvPersonaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvPersonaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaCdvPersona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Gamaliel
 * 
 */
@SuppressWarnings("unchecked")
@Repository("cdvPersonaDao")
public class CdvPersonaDaoImpl
		extends
		AbstractPersistenceDaoGenericHibernate<CdvPersonaEntity, LlaveCompuestaCdvPersona>
		implements CdvPersonaDao {

	@Autowired
	public CdvPersonaDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
