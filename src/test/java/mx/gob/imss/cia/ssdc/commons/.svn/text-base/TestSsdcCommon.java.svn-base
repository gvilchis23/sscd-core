/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestSsdcCommon.java
 *
 * Creado: 28/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.DelegacionEntity;
import mx.gob.imss.cia.ssdc.cdv.integracion.entity.Entidad;
import mx.gob.imss.cia.ssdc.cdv.vo.DelegacionVo;

import org.junit.Test;

/**
 * 
 * @author Equipo de Desarrollo
 * 
 */
public class TestSsdcCommon {

	private static final Long CLAVE_TEST = 40L;

	private TestEntidad test = new TestEntidad(CLAVE_TEST);

	@Test
	public void deberiaObtenerValoresDelTipoEspecifico() throws Exception {
		Object obtenerValores = SsdcCommon.obtenerValores(test, Long.class);
		assertTrue(obtenerValores instanceof Long);
		assertEquals(obtenerValores, test.getClave());
	}

	@Test
	public void deberiaCast() throws Exception {
		DelegacionEntity delegacion = new DelegacionEntity();
		delegacion.setCveDelegacion(1L);
		delegacion.setNombreDelegacion("iztapalapa");
		DelegacionVo vo = SsdcCommon.parseoVO(delegacion, DelegacionVo.class);
	}

	private class TestEntidad extends Entidad {

		private Long clave;

		public TestEntidad(Long clave) {
			this.clave = clave;
		}

		@ResultadoDinamico
		public Long getClave() {
			return clave;
		}

	}

}
