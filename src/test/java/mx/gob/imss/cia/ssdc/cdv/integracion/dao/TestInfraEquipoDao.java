/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestInfraEquipoDao.java
 *
 * Creado: 20/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.integracion.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import mx.gob.imss.cia.ssdc.cdv.integracion.entity.EquipoInfraestructuraEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.InfraEquipoEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.InfraestructuraEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.LlaveCompuestaInfraEquipo;
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;
import mx.gob.imss.cia.ssdc.commons.Constantes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestInfraEquipoDao extends IntegrationTest {

	private static final Long CVE_INFRAESTRUCTURA = 1L;

	private static final Long CVE_EQUIPO_INFRAESTRUCTURA = 1L;

	private static final long CVE_EQUIPO_INFRAESTRUCTURA_NUEVO = 2L;

	@Autowired
	private InfraEquipoDao infraEquipoDao;

	public LlaveCompuestaInfraEquipo crearLlaveCompuesta(
	        Long cveInfraestructura, Long cveEquipoInfraestructura) {
		LlaveCompuestaInfraEquipo id = new LlaveCompuestaInfraEquipo();

		InfraestructuraEntity infraestructura = new InfraestructuraEntity();
		infraestructura.setCveInfraestructura(cveInfraestructura);
		id.setInfraestructura(infraestructura);

		EquipoInfraestructuraEntity equipo = new EquipoInfraestructuraEntity();
		equipo.setCveEquipoInfraestructura(cveEquipoInfraestructura);
		id.setEquipo(equipo);

		return id;
	}

	@Test
	public void deberiaCrearUnInfraEquipo() throws Exception {

		LlaveCompuestaInfraEquipo id = crearLlaveCompuesta(CVE_INFRAESTRUCTURA,
		        CVE_EQUIPO_INFRAESTRUCTURA_NUEVO);

		InfraEquipoEntity infraEq = new InfraEquipoEntity();
		infraEq.setLlave(id);
		infraEq.setMalEstado(1);
		List<InfraEquipoEntity> todasInfraEquipo = infraEquipoDao.findAll();
		infraEquipoDao.create(infraEq);
		assertTrue(infraEquipoDao.findAll().size() > todasInfraEquipo.size());
	}

	@Test
	public void deberiaTraerUnEquipoInfraPorClave() throws Exception {
		LlaveCompuestaInfraEquipo id = crearLlaveCompuesta(CVE_INFRAESTRUCTURA,
		        CVE_EQUIPO_INFRAESTRUCTURA);

		InfraEquipoEntity infraEquipoPorClave = infraEquipoDao.read(id);
		assertNotNull(infraEquipoPorClave);
		assertEquals(CVE_INFRAESTRUCTURA, infraEquipoPorClave.getLlave()
		        .getEquipo().getCveEquipoInfraestructura());
		assertEquals(CVE_EQUIPO_INFRAESTRUCTURA, infraEquipoPorClave.getLlave()
		        .getInfraestructura().getCveInfraestructura());
	}

	@Test
	public void deberiaActualizarElEstadoDeUnEquipoInfra() throws Exception {
		LlaveCompuestaInfraEquipo id = crearLlaveCompuesta(CVE_INFRAESTRUCTURA,
		        CVE_EQUIPO_INFRAESTRUCTURA);

		InfraEquipoEntity infraEquipo = infraEquipoDao.read(id);
		assertEquals(Constantes.ENABLE, infraEquipo.getMalEstado().intValue());
		infraEquipo.setMalEstado(Constantes.DISABLE);
		infraEquipoDao.update(infraEquipo);
		assertEquals(Constantes.DISABLE, infraEquipo.getMalEstado().intValue());
	}

	@Test
	public void deberiaBorrarElEquipoInfra() throws Exception {
		LlaveCompuestaInfraEquipo id = crearLlaveCompuesta(CVE_INFRAESTRUCTURA,
		        CVE_EQUIPO_INFRAESTRUCTURA);

		InfraEquipoEntity infraEquipo = infraEquipoDao.read(id);
		assertNotNull(infraEquipo);
		infraEquipoDao.delete(infraEquipo);

		infraEquipo = infraEquipoDao.read(id);
		assertNull(infraEquipo);
	}

	@Test
	public void deberiaTraerTodosLosEquipoInfra() throws Exception {
		List<InfraEquipoEntity> todasInfraEquipo = infraEquipoDao.findAll();
		assertNotNull(todasInfraEquipo);
		assertTrue(todasInfraEquipo.size() > 0);
	}
}
