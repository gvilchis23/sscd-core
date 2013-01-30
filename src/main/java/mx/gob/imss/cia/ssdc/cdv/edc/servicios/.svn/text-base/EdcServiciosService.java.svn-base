/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcServiciosService.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.edc.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaMediosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaRequisitosCdv;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosCdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosDifusionEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosCdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.RequisitosEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;

/**
 * @author Guillermo Vilchis
 * 
 */
public interface EdcServiciosService {

	List<RequisitosEntity> llenarPickListRequisito(Integer tipoVentanilla);

	RequisitosEntity recuperarRequisitos(Long cveRequisitos);

	List<MediosDifusionEntity> llenarPickListDifusion(Integer tipoVentanilla);

	// List<MediosDifusionVo> llenarPersonaInfo();
	MediosDifusionEntity recuperarMedios(Long cveMedios);

	void guardadCdvServicio(CdvServicioEntity entidad);

	@Deprecated
	void guardadRequisitosCdv(RequisitosCdvEntity entidad);

	@Deprecated
	void guardadMediosCdv(MediosCdvEntity entidad);

	ServicioEntity recuperarServicio(Long cveServicio);

	void eliminarCdvServicio(CdvServicioEntity entity);

	ResultadoServicioEntity recuperarResultadoServicio(Long cveResultado);

	List<RequisitosCdvEntity> recuperarCdvRequisito(
			LlaveCompuestaRequisitosCdv llave);

	List<MediosCdvEntity> recuperarCdvMedios(LlaveCompuestaMediosCdv llave);

}
