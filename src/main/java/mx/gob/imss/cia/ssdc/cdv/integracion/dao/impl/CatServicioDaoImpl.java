/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CatServicioDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CatServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CatServicioEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Gamaliel
 * 
 */

@SuppressWarnings("unchecked")
@Repository("catServicioDao")
public class CatServicioDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<CatServicioEntity, Long>
        implements CatServicioDao {

	@Autowired
	public CatServicioDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CatServicioEntity> filtrarCatServiciosPorVentanillaYStatus(
	        Long tipoVentanilla, int status) {
		return getHibernateTemplate().find(
		        "from CatServicioEntity c where c."
		                + "ventanilla.cveTipoVentanilla = ? and c.status = ?",
		        new Object[] { tipoVentanilla, status });

	}

}
