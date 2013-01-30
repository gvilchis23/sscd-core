/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcService.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.edc.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.edc.vo.CabeceraDatosGeneralesVo;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CatServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CdvServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ResultadoServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.ServicioEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.TipoVentanillaEntity;

/**
 * @author 
 *
 */
public interface EdcService {
	
	    TipoVentanillaEntity recuperarVentanilla(Long cveTipoVentanilla);
	    List<CatServicioEntity> llenarComboCategoriaServicios
	    							(Long tipoVentanilla);
	    List<ServicioEntity> llenarComboServicios(Long cveCategoria);
	    List<ResultadoServicioEntity> llenarComboResultadoServicios
	    							(Long tipoVentanilla);
	    CdvEntity recuperarCdv(Long cveCdv);
	    List<CdvServicioEntity> recuperarCdvServicios(Long cveCdv);
	    CabeceraDatosGeneralesVo obtenerDatosgenerales(Long cveCdv);

	
	   


}
