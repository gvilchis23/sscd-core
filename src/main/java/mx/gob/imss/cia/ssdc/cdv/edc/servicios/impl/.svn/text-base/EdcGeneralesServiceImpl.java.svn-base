/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcGeneralesServiceImpl.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcGeneralesService;
import mx.gob.imss.cia.ssdc.cdv.edc.vo.TurnoVo;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CatServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CategoriaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvPersonaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.DelegacionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PersonaPropiaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.PuestoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoUnidadDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TipoVentanillaDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.TurnoDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.UnidadDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CatServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CategoriaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvPersonaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.DelegacionEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonaPropiaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PuestoEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoUnidadEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoVentanillaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TurnoEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.UnidadEntity;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author
 * 
 */
@Transactional
@Service("edcGeneralesService")
public class EdcGeneralesServiceImpl implements EdcGeneralesService {

	@Autowired
	private DelegacionDao delegacionDao;
	@Autowired
	private UnidadDao unidadDao;
	@Autowired
	private TipoUnidadDao tipoUnidadDao;
	@Autowired
	private TipoVentanillaDao tipoVentanillaDao;
	@Autowired
	private TurnoDao turnoDao;
	@Autowired
	private CategoriaDao categoriaDao;
	@Autowired
	private PuestoDao puestoDao;
	@Autowired
	private CatServicioDao catServicioDao;
	@Autowired
	private PersonaPropiaDao personaPropiaDao;
	@Autowired
	private CdvDao cdvDao;
	@Autowired
	private CdvPersonaDao cdvPersonaDao;

	@Override
	public List<DelegacionEntity> llenarComboDelegacion() {
		return delegacionDao.obtenerListadoDelegacionPorStatus(Constantes.ENABLE);
	}

	@Override
	public List<UnidadEntity> llenarComboUnidad(Long cveDelegacion) {
		return unidadDao.filtrarUnidadByDelegacionYStatus(cveDelegacion, Constantes.ENABLE);
	}

	@Override
	public TipoUnidadEntity llenarComboTipoUnidad(Long cveTipoUnidad) {
		return tipoUnidadDao.llenarComboTipoUnidadById(cveTipoUnidad);
	}

	@Override
	public List<TipoVentanillaEntity> llenarComboTipoVentanilla() {
		return tipoVentanillaDao.filtrarTipoVentanillaPorStatus(Constantes.ENABLE);
	}

	@Override
	public List<TurnoEntity> llenarComboTurno() {
		return turnoDao.filtrarTurnoPorStatus(Constantes.ENABLE);
	}

	@Override
	public List<CategoriaEntity> llenarComboCategoria() {
		return categoriaDao.findAll();
	}

	@Override
	public List<PuestoEntity> llenarComboPuesto() {
		return puestoDao.findAll();
	}

	@Override
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void guardadPersonaInfo(PersonaPropiaEntity entidad,Integer personaExiste) {
		
		if(personaExiste==0){
			personaPropiaDao.create(entidad);
			llenarPersonaInfo();
		}else{
			borrarPersonaInfo(personaExiste);
			personaPropiaDao.create(entidad);
			llenarPersonaInfo();
		}
		
	}

	@Override
	public PersonaPropiaEntity llenarPersonaInfo() {
		return personaPropiaDao.llenarPersonaInfo();
	}

	@Override
	public void borrarPersonaInfo(Integer cvePersona) {
		PersonaPropiaEntity persona=(PersonaPropiaEntity)
		personaPropiaDao.read(Long.valueOf(cvePersona));
		persona.setStatus(Constantes.DISABLE);
		personaPropiaDao.update(persona);
	}

	@Override
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT, 
					propagation = Propagation.REQUIRED)
	public void guardadCdvGeneral(CdvEntity entidad) {
		cdvDao.create(entidad);
	}

	@Override
	public TurnoEntity recuperarTurno(Long cveTurno) {
		return turnoDao.read(cveTurno);
	}

	@Override
	public UnidadEntity recuperarUnidad(Long cveUnidad) {
		return unidadDao.read(cveUnidad);
	}

	@Override
	public CatServicioEntity recuperarCategoria(Long cveCategoria) {
		return catServicioDao.read(cveCategoria);
	}

	@Override
	public PuestoEntity recuperarPuesto(Long cvePuesto) {
		return puestoDao.read(cvePuesto);
	}

	@Override
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT, 
					propagation = Propagation.REQUIRED)
	public void guardarCdvPersona(CdvPersonaEntity entidad) {
		cdvPersonaDao.create(entidad);
	}

	@Override
	public List<TurnoVo> obtieneListadoTurno() {
		// TODO Auto-generated method stub
		return null;
	}

}
