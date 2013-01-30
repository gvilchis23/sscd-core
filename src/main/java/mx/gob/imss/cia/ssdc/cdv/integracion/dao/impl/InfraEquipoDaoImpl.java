/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: InfraEquipoDaoImpl.java
 *
 * Creado: 20/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.InfraEquipoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.InfraEquipoEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaInfraEquipo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
@SuppressWarnings("unchecked")
@Repository("infraEquipoDao")
public class InfraEquipoDaoImpl
        extends
        AbstractPersistenceDaoGenericHibernate<InfraEquipoEntity, LlaveCompuestaInfraEquipo>
        implements InfraEquipoDao {

	@Autowired
	public InfraEquipoDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

}
