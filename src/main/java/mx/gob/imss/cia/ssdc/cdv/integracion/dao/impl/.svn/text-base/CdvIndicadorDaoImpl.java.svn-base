/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvIndicadorDaoImpl.java
 *
 * Creado: 18/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvIndicadorDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvIndicadorEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaCdvIndicador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("cdvIndicadorDao")
public class CdvIndicadorDaoImpl
		extends
		AbstractPersistenceDaoGenericHibernate<CdvIndicadorEntity, LlaveCompuestaCdvIndicador>
		implements CdvIndicadorDao {

	@Autowired
	public CdvIndicadorDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
