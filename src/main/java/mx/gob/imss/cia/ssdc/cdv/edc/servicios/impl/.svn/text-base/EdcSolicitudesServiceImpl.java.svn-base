/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcSolicitudesServiceImpl.java
 *
 * Creado:  Oct 25, 2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */
package mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcSolicitudesService;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CausaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CausaEntity;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author propietario
 *
 */

@Transactional
@Service("edcSolicitudesService")
public class EdcSolicitudesServiceImpl implements EdcSolicitudesService{
	
	@Autowired
	private CausaDao causaDao;
	
	public List<CausaEntity> recuperarCausaPorStatus(){
		return causaDao.recuperarCausaPorStatus(Constantes.ENABLE);
	}
	
	public CausaEntity recuperarCausaPorId(Integer cveCausa){
		return causaDao.read(Long.valueOf(cveCausa));
		
	}

}
