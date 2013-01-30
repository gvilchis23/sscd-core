/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcAtencionServiceImpl.java
 *
 * Creado:  Oct 26, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl;

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcAtencionService;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ModuloAtencionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ModuloAtencionEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author propietario
 *
 */

@Transactional
@Service("edcAtencionService")
public class EdcAtencionServiceImpl implements EdcAtencionService{
	
	@Autowired
	private ModuloAtencionDao moduloAtencionDao;

	@Override
	public void guardarModuloAtencion(ModuloAtencionEntity entidad) {
		moduloAtencionDao.create(entidad);
	}

}
