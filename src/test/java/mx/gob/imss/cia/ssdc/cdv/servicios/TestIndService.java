/**
 * Proyecto: IMSS  - SSDC
 *
 * Archivo: TestIndService.java
 *
 * Creado:  13/10/2011
 *
 * Derechos Reservados de copia (c) - INAP /
 *
 * Instituto Mexicano del Seguro Social - 2011
 */

package mx.gob.imss.cia.ssdc.cdv.servicios;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestIndService {
	@Test
	public void debieraExistirIndService() throws Exception {
		assertNotNull(new TestIndService());
	}
}
