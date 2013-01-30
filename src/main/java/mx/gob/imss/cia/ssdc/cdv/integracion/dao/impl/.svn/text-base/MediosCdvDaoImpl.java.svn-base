/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: MediosCdvDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.MediosCdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaMediosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosCdvEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Gamaliel
 * 
 */
@SuppressWarnings("unchecked")
@Repository("mediosCdvDao")
public class MediosCdvDaoImpl extends
		AbstractPersistenceDaoGenericHibernate<MediosCdvEntity, LlaveCompuestaMediosCdv> implements
		MediosCdvDao {

	@Autowired
	public MediosCdvDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}
	
	@Override
	public List<MediosCdvEntity> recuperarMediosCdv(LlaveCompuestaMediosCdv llave) {
		Long[]arreglo=new Long[2];
		arreglo[0]=llave.getCdv().getCveCdv();
		arreglo[1]=llave.getServicio().getCveServicio();
		List<MediosCdvEntity>lista=(ArrayList<MediosCdvEntity>) 
			getHibernateTemplate().find("from MediosCdvEntity m " 
				+"where m.llaveCompuesta.cdv.cveCdv=? and m.llaveCompuesta.servicio.cveServicio=?",arreglo);
		return lista;
	}

}
