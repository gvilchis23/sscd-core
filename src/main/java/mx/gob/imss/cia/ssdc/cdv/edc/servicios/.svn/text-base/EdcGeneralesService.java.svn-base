/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: EdcGeneralesService.java
 *
 * Creado:  12/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.edc.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.edc.vo.TurnoVo;
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

/**
 * @author propietario
 * 
 */
public interface EdcGeneralesService {

	@Deprecated
	List<DelegacionEntity> llenarComboDelegacion();

	@Deprecated
	List<UnidadEntity> llenarComboUnidad(Long cveDelegacion);

	@Deprecated
	TipoUnidadEntity llenarComboTipoUnidad(Long cveTipoUnidad);

	@Deprecated
	List<TipoVentanillaEntity> llenarComboTipoVentanilla();

	//TODO:Este metodo será reemplazado por obtieneListadoTurno
	@Deprecated
	List<TurnoEntity> llenarComboTurno();
	
	@Deprecated
	TurnoEntity recuperarTurno(Long cveTurno);
	
	@Deprecated
	UnidadEntity recuperarUnidad(Long cveUnidad);
	
	@Deprecated
	CatServicioEntity recuperarCategoria(Long cveCategoria);
	
	@Deprecated
	PuestoEntity recuperarPuesto(Long cvePuesto);
	
	List<TurnoVo> obtieneListadoTurno();

	List<CategoriaEntity> llenarComboCategoria();

	List<PuestoEntity> llenarComboPuesto();

	void guardadPersonaInfo(PersonaPropiaEntity entidad, Integer personaExiste);

	PersonaPropiaEntity llenarPersonaInfo();
	//List<PersonaPropiaVo> llenarPersonaInfo();

	void borrarPersonaInfo(Integer cvePersona);

	void guardadCdvGeneral(CdvEntity entidad);

	void guardarCdvPersona(CdvPersonaEntity entidad);

	
}
