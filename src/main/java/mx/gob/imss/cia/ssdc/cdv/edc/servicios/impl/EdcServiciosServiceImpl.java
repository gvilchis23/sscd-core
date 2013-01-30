/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcServiciosServiceImpl.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcServiciosService;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.MediosCdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.MediosDifusionDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.RequisitosCdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.RequisitosDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ResultadoServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.ServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaMediosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaRequisitosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosCdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosDifusionEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosCdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;
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
@Service("edcServiciosService")
public class EdcServiciosServiceImpl implements EdcServiciosService {

	@Autowired
	private RequisitosDao requisitosDao;
	@Autowired
	private MediosDifusionDao mediosDifusionDao;
	@Autowired
	private CdvServicioDao cdvServicioDao;
	@Autowired
	private RequisitosCdvDao requisitosCdvDao;
	@Autowired
	private MediosCdvDao mediosCdvDao;
	@Autowired
	private ServicioDao servicioDao;
	@Autowired
	private CdvDao cdvDao;
	@Autowired
	private ResultadoServicioDao resultadoServicioDao;

	/**
	 * @return the requisitosDao
	 */
	public RequisitosDao getRequisitosDao() {
		return requisitosDao;
	}

	/**
	 * @param requisitosDao
	 *            the requisitosDao to set
	 */
	public void setRequisitosDao(RequisitosDao requisitosDao) {
		this.requisitosDao = requisitosDao;
	}

	/**
	 * @return the mediosDifusionDao
	 */
	public MediosDifusionDao getMediosDifusionDao() {
		return mediosDifusionDao;
	}

	/**
	 * @param mediosDifusionDao
	 *            the mediosDifusionDao to set
	 */
	public void setMediosDifusionDao(MediosDifusionDao mediosDifusionDao) {
		this.mediosDifusionDao = mediosDifusionDao;
	}

	/**
	 * @return the cdvServicioDao
	 */
	public CdvServicioDao getCdvServicioDao() {
		return cdvServicioDao;
	}

	/**
	 * @param cdvServicioDao
	 *            the cdvServicioDao to set
	 */
	public void setCdvServicioDao(CdvServicioDao cdvServicioDao) {
		this.cdvServicioDao = cdvServicioDao;
	}

	/**
	 * @return the requisitosCdvDao
	 */
	public RequisitosCdvDao getRequisitosCdvDao() {
		return requisitosCdvDao;
	}

	/**
	 * @param requisitosCdvDao
	 *            the requisitosCdvDao to set
	 */
	public void setRequisitosCdvDao(RequisitosCdvDao requisitosCdvDao) {
		this.requisitosCdvDao = requisitosCdvDao;
	}

	/**
	 * @return the mediosCdvDao
	 */
	public MediosCdvDao getMediosCdvDao() {
		return mediosCdvDao;
	}

	/**
	 * @param mediosCdvDao
	 *            the mediosCdvDao to set
	 */
	public void setMediosCdvDao(MediosCdvDao mediosCdvDao) {
		this.mediosCdvDao = mediosCdvDao;
	}

	/**
	 * @return the servicioDao
	 */
	public ServicioDao getServicioDao() {
		return servicioDao;
	}

	/**
	 * @param servicioDao
	 *            the servicioDao to set
	 */
	public void setServicioDao(ServicioDao servicioDao) {
		this.servicioDao = servicioDao;
	}

	/**
	 * @return the cdvDao
	 */
	public CdvDao getCdvDao() {
		return cdvDao;
	}

	/**
	 * @param cdvDao
	 *            the cdvDao to set
	 */
	public void setCdvDao(CdvDao cdvDao) {
		this.cdvDao = cdvDao;
	}

	/**
	 * @return the resultadoServicioDao
	 */
	public ResultadoServicioDao getResultadoServicioDao() {
		return resultadoServicioDao;
	}

	/**
	 * @param resultadoServicioDao
	 *            the resultadoServicioDao to set
	 */
	public void setResultadoServicioDao(
	        ResultadoServicioDao resultadoServicioDao) {
		this.resultadoServicioDao = resultadoServicioDao;
	}

	@Override
	public List<RequisitosEntity> llenarPickListRequisito(Integer tipoVentanilla) {
		return requisitosDao.filtrarRequisitoPorStatus(tipoVentanilla);
	}

	@Override
	public RequisitosEntity recuperarRequisitos(Long cveRequisitos) {
		return requisitosDao.read(cveRequisitos);
	}

	@Override
	public List<MediosDifusionEntity> llenarPickListDifusion(
	        Integer tipoVentanilla) {
		return mediosDifusionDao.filtrarDifusionPorStatus(Constantes.ENABLE);
	}

	@Override
	public MediosDifusionEntity recuperarMedios(Long cveMedios) {
		return mediosDifusionDao.read(cveMedios);
	}

	@Override
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void guardadCdvServicio(CdvServicioEntity entidad) {
		cdvServicioDao.create(entidad);
	}

	@Override
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void guardadRequisitosCdv(RequisitosCdvEntity entidad) {
		requisitosCdvDao.create(entidad);
	}

	@Override
	@Transactional(readOnly = false, isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
	public void guardadMediosCdv(MediosCdvEntity entidad) {
		mediosCdvDao.create(entidad);
	}

	@Override
	public ServicioEntity recuperarServicio(Long cveServicio) {
		return servicioDao.read(cveServicio);
	}

	@Override
	public void eliminarCdvServicio(CdvServicioEntity entity) {
		cdvServicioDao.delete(entity);

	}

	@Override
	public ResultadoServicioEntity recuperarResultadoServicio(Long cveResultado) {
		return resultadoServicioDao.read(cveResultado);
	}

	@Override
	public List<RequisitosCdvEntity> recuperarCdvRequisito(
			LlaveCompuestaRequisitosCdv llave) {
		return requisitosCdvDao.recuperarRequisitosCdv(llave);

	}

	@Override
	public List<MediosCdvEntity> recuperarCdvMedios(LlaveCompuestaMediosCdv llave) {
		return mediosCdvDao.recuperarMediosCdv(llave);

	}

}
