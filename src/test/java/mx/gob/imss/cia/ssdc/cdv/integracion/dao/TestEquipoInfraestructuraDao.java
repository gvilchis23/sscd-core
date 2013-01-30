/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestEquipoInfraestructuraDao.java
 *
 * Creado: 19/10/2011
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
import mx.gob.imss.cia.ssdc.cdv.test.IntegrationTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestEquipoInfraestructuraDao extends IntegrationTest {

	@Autowired
	private EquipoInfraestructuraDao equipoInfraestructuraDao;

	private static final Long ID = 1L;

	@Test
	public void debieraExistirEquipoInfraestructuraDao() throws Exception {
		assertNotNull(equipoInfraestructuraDao);
	}

	@Test
	public void deberiaHeredarDePersistenceDao() {
		assertTrue(equipoInfraestructuraDao instanceof PersistenceDao<?, ?>);
	}

	@Test
	public void deberiaCrearUnEquipo() throws Exception {
		EquipoInfraestructuraEntity eqInfra = new EquipoInfraestructuraEntity();
		eqInfra.setNombreEquipoInfraestructura("Mouse");

		List<EquipoInfraestructuraEntity> todosEqInfra = equipoInfraestructuraDao
		        .findAll();
		equipoInfraestructuraDao.create(eqInfra);
		assertTrue(equipoInfraestructuraDao.findAll().size() > todosEqInfra
		        .size());
	}

	@Test
	public void deberiaTraerUnEquipoPorClave() throws Exception {
		EquipoInfraestructuraEntity eqInfraPorClave = equipoInfraestructuraDao
		        .read(ID);
		assertNotNull(eqInfraPorClave);
		assertEquals(ID, eqInfraPorClave.getCveEquipoInfraestructura());
	}

	@Test
	public void deberiaActualizarNombreDelEquipo() throws Exception {
		String razonActualizada = "Mouses";
		EquipoInfraestructuraEntity eqInfra = equipoInfraestructuraDao.read(ID);
		assertEquals("Computadoras", eqInfra.getNombreEquipoInfraestructura());
		eqInfra.setNombreEquipoInfraestructura(razonActualizada);
		equipoInfraestructuraDao.update(eqInfra);
		assertEquals(razonActualizada, eqInfra.getNombreEquipoInfraestructura());
	}

	@Test
	public void deberiaBorrarElEquipo() throws Exception {
		EquipoInfraestructuraEntity entidadFed = equipoInfraestructuraDao
		        .read(ID);
		assertNotNull(entidadFed);
		equipoInfraestructuraDao.delete(entidadFed);

		entidadFed = equipoInfraestructuraDao.read(1L);
		assertNull(entidadFed);
	}

	@Test
	public void deberiaTraerTodasLosEquipos() throws Exception {
		List<EquipoInfraestructuraEntity> todasEntidades = equipoInfraestructuraDao
		        .findAll();
		assertNotNull(todasEntidades);
		assertTrue(todasEntidades.size() > 0);
	}

}
