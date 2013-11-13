package AhorcadoTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class AhorcadoTest {

	@Test
	public void test() {
		Ahorcado Ah = new Ahorcado();
		assertEquals("Bienvenido al Juego del Ahorcado", Ah.WelcomeMessage);
	}
}
