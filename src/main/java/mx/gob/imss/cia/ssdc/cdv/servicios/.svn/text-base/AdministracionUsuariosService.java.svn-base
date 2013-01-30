/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: AdministracionUsuariosService.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.CategoriaEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PersonalRelPerfilEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.PuestoEntity;

/**
 * 
 * @author Equipo de Desarrolllo
 * 
 */
public interface AdministracionUsuariosService {

	void creaUsuarioNivelCentral(PersonalEntity personal, Long... cvePerfiles)
			throws SsdcException;

	void actualizaRelacionPerfilPersona(PersonalRelPerfilEntity personal)
			throws SsdcException;

	PersonalRelPerfilEntity recuperaRelacionPerfilPersona(Long cvePersonal,
			Long cvePerfil) throws SsdcException;

	List<PersonalRelPerfilEntity> filtraPorStatus(int status) throws SsdcException;

	List<PersonalRelPerfilEntity> filtraPersonalPorTipo(Long tipoUsuario)
			throws SsdcException;

	List<PuestoEntity> obtenerTodosLosPuestos();

	List<CategoriaEntity> obtenerTodasLasCategorias();

}