/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: RequisitosCdvDaoImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.RequisitosCdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaRequisitosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosCdvEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author Gamaliel
 * 
 */

@SuppressWarnings("unchecked")
@Repository("requisitosCdvDao")
public class RequisitosCdvDaoImpl
        extends
        AbstractPersistenceDaoGenericHibernate<RequisitosCdvEntity, LlaveCompuestaRequisitosCdv>
        implements RequisitosCdvDao {

	@Autowired
	public RequisitosCdvDaoImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Override
	public List<RequisitosCdvEntity> recuperarRequisitosCdv(
	        LlaveCompuestaRequisitosCdv llave) {
		Long[] arreglo = new Long[2];
		arreglo[0] = llave.getCdv().getCveCdv();
		arreglo[1] = llave.getServicio().getCveServicio();
		List<RequisitosCdvEntity> lista = getHibernateTemplate().find(
		        "from RequisitosCdvEntity r "
		                + "where r.llaveCompuesta.cdv.cveCdv = ? and "
		                + "r.llaveCompuesta.servicio.cveServicio = ?", arreglo);
		return lista;
	}

}
