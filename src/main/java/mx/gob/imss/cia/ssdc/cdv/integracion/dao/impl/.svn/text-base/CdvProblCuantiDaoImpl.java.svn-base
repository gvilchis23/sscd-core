/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvProblCuantiDaoImpl.java
 *
 * Creado: 18/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvProblCuantiDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvProblCuantiEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompProblCuanti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("cdvProblCuantiDao")
public class CdvProblCuantiDaoImpl
        extends
        AbstractPersistenceDaoGenericHibernate<CdvProblCuantiEntity, LlaveCompProblCuanti>
        implements CdvProblCuantiDao {

	@Autowired
	public CdvProblCuantiDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}