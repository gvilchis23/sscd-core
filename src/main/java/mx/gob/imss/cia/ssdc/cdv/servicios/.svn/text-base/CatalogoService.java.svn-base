/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: CatalogoService.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CatServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.DelegacionEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.EntidadFederativaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.MediosDifusionEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoUnidadEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.UnidadEntity;
import mx.gob.imss.cia.ssdc.cdv.vo.CatalogoVo;

/**
 * 
 * @author
 * 
 */
public interface CatalogoService {

	void guardarCategoriaServicio(CatServicioEntity servicio);

	void guardarServicio(ServicioEntity servicio);

	void guardarResultadoServicio(ResultadoServicioEntity servicio);

	void guardarMediosDifusion(MediosDifusionEntity servicio);

	List<?> llenarComboServicios(Integer tipoVentanilla);

	List<CatalogoVo> llenarTablaCatServicios(Integer tipoVentanilla);

	List<CatalogoVo> llenarTablaServicios(Integer tipoVentanilla);

	List<CatalogoVo> llenarTablaResulServicios(Integer tipoVentanilla);

	List<CatalogoVo> llenarTablaMediosDifusion(Integer tipoVentanilla);

	// Catalogo de Unidades

	void guardarUnidades(UnidadEntity unidad, Long cveEntidad,
			Long cveDelegacion, Long cveTipoUnidad);

	void actualizarUnidades(UnidadEntity unidad);

	UnidadEntity filtrarUnidadesPorId(Long cveUnidad);

	List<UnidadEntity> llenarTablaUnidades();

	List<EntidadFederativaEntity> llenarComboEntidadFed();

	List<DelegacionEntity> llenarComboDelegacion();

	List<TipoUnidadEntity> llenarComboTipoUnidad();

}