/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CdvServicioDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaCdv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@SuppressWarnings("unchecked")
@Repository("cdvServicioDao")
public class CdvServicioDaoImpl
        extends
        AbstractPersistenceDaoGenericHibernate<CdvServicioEntity, LlaveCompuestaCdv>
        implements CdvServicioDao {
	@Autowired
	public CdvServicioDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CdvServicioEntity> recuperarCdvServicios(Long cveCdv) {
		return getHibernateTemplate().find(
		        "from CdvServicioEntity c "
		                + "where c.llaveCompuesta.cdv.cveCdv=?", cveCdv);
	}

}
