/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcInterServiceImpl.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.edc.servicios.impl;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.edc.servicios.EdcInterService;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.CdvServicioDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.VentanillaAnteriorDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.dao.VentanillaPosteriorDao;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaAnteriorEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.VentanillaPosteriorEntity;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author propietario
 * 
 */
@Transactional
@Service("edcInterService")
public class EdcInterServiceImpl implements EdcInterService {

	@Autowired
	private VentanillaAnteriorDao ventanillaAnteriorDao;
	@Autowired
	private VentanillaPosteriorDao ventanillaPosteriorDao;
	@Autowired
	private CdvDao cdvDao;
	@Autowired
	private CdvServicioDao cdvServicioDao;

	/**
	 * @return the ventanillaAnteriorDao
	 */
	public VentanillaAnteriorDao getVentanillaAnteriorDao() {
		return ventanillaAnteriorDao;
	}

	/**
	 * @param ventanillaAnteriorDao
	 *            the ventanillaAnteriorDao to set
	 */
	public void setVentanillaAnteriorDao(
	        VentanillaAnteriorDao ventanillaAnteriorDao) {
		this.ventanillaAnteriorDao = ventanillaAnteriorDao;
	}

	/**
	 * @return the ventanillaPosteriorDao
	 */
	public VentanillaPosteriorDao getVentanillaPosteriorDao() {
		return ventanillaPosteriorDao;
	}

	/**
	 * @param ventanillaPosteriorDao
	 *            the ventanillaPosteriorDao to set
	 */
	public void setVentanillaPosteriorDao(
	        VentanillaPosteriorDao ventanillaPosteriorDao) {
		this.ventanillaPosteriorDao = ventanillaPosteriorDao;
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

	@Override
	public List<VentanillaAnteriorEntity> llenarComboVentaAnterior(
	        Long tipoVentanilla) {
		return ventanillaAnteriorDao.filtrarVentaAnteriorPorTipoYStatus(tipoVentanilla, Constantes.ENABLE);
	}

	@Override
	public List<VentanillaPosteriorEntity> llenarComboVentaPost(
	        Long tipoVentanilla) {
		return ventanillaPosteriorDao.filtrarVentaPostPorTipoYStatus(
		        tipoVentanilla, Constantes.ENABLE);
	}

	@Override
	public VentanillaAnteriorEntity recuperarVentanillaAnterior(Long cveAnterior) {
		return ventanillaAnteriorDao.read(cveAnterior);
	}

	@Override
	public VentanillaPosteriorEntity recuperarVentanillaPosterior(
	        Long cvePosterior) {
		return ventanillaPosteriorDao.read(cvePosterior);
	}

	@Override
	public void updateCdvServicio(CdvServicioEntity entidad) {
		cdvServicioDao.update(entidad);
	}

}
