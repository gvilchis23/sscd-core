/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TipoUsuarioServiceImpl.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoUsuarioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoUsuarioEntity;
import mx.gob.imss.cia.ssdc.cdv.servicios.TipoUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("tipoUsuarioService")
public class TipoUsuarioServiceImpl implements TipoUsuarioService {

	@Autowired
	private TipoUsuarioDao tipoUsuarioDao;

	@Override
	public List<TipoUsuarioEntity> obtenerTodos() {
		return tipoUsuarioDao.findAll();
	}

}
