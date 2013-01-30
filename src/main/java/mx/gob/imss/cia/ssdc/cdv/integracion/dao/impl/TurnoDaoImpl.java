/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TurnoDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TurnoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TurnoEntity;
import mx.gob.imss.cia.ssdc.cdv.vo.TurnoVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Gamaliel
 * 
 */
@SuppressWarnings("unchecked")
@Repository("turnoDao")
public class TurnoDaoImpl extends
        AbstractPersistenceDaoGenericHibernate<TurnoEntity, Long> implements
        TurnoDao {

	@Autowired
	public TurnoDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TurnoEntity> filtrarTurnoPorStatus(int status) {
		return getHibernateTemplate().find(
		        "from TurnoEntity t where t.status = ?", status);
	}

	@Override
	public List<TurnoVo> obtenerListadoTurnoVo(int estatus) {
		return getHibernateTemplate().find(
		        "from TurnoEntity t where t.status = ?", estatus);
	}

}
