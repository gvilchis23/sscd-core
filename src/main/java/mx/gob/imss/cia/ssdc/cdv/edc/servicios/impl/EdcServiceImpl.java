/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcServiceImpl.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcService;
import mx.gob.imss.cia.ssdc.cdv.edc.vo.CabeceraDatosGeneralesVo;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CatServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ResultadoServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoVentanillaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CatServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoVentanillaEntity;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Guillermo Vilchis Gonzalez
 *
 */
@Transactional
@Service("edcService")
public class EdcServiceImpl implements EdcService {
	
	@Autowired
	private TipoVentanillaDao tipoVentanillaDao;
	@Autowired
	private CatServicioDao catServicioDao;
	@Autowired
	private ServicioDao servicioDao;
	@Autowired
	private ResultadoServicioDao resultadoServicioDao;
	@Autowired
	private CdvDao cdvDao;
	@Autowired
	private CdvServicioDao cdvServicioDao;
	
	@Override
	public TipoVentanillaEntity recuperarVentanilla(Long cveTipoVentanilla) {
		return tipoVentanillaDao.read(cveTipoVentanilla);
	}
	
	@Override
	public List<CatServicioEntity> llenarComboCategoriaServicios
											(Long tipoVentanilla) {
		return catServicioDao.filtrarCatServiciosPorVentanillaYStatus(tipoVentanilla, Constantes.ENABLE);
	}

	@Override
	public List<ServicioEntity> llenarComboServicios(Long cveCategoria) {
		return servicioDao.filtrarServicioPorCategoriaYStatus(cveCategoria, Constantes.ENABLE);
	}

	@Override
	public List<ResultadoServicioEntity> llenarComboResultadoServicios
										(Long tipoVentanilla) {
		return resultadoServicioDao.filtrarResultadoServicioPorVentanillaYStatus
													(tipoVentanilla, Constantes.ENABLE);
	}
	
	@Override
	public CdvEntity recuperarCdv(Long cveCdv) {
		return cdvDao.read(cveCdv);
	}
	
	@Override
	public List<CdvServicioEntity> recuperarCdvServicios(Long cveCdv) {
		return cdvServicioDao.recuperarCdvServicios(cveCdv);
	}

	@Override
	public CabeceraDatosGeneralesVo obtenerDatosgenerales(Long cveCdv) {
		// TODO Auto-generated method stub
		return null;
	}

}
