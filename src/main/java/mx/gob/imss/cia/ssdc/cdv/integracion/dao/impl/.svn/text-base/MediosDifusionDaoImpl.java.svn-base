/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MediosDifusionDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.MediosDifusionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosDifusionEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Gamaliel
 * 
 */

@SuppressWarnings("unchecked")
@Repository("mediosDifusionDao")
public class MediosDifusionDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<MediosDifusionEntity, Long>
        implements MediosDifusionDao {

	@Autowired
	public MediosDifusionDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<MediosDifusionEntity> filtrarDifusionPorStatus(int status) {
		return getHibernateTemplate().find(
		        "from MediosDifusionEntity m where m.status = ?", status);
	}

}
