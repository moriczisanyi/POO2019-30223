import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnComunTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testEsteAnComun() {
		AnBisect an = new AnBisect();
		assertFalse(an.esteAnBisect(203));
		assertFalse(!an.esteAnBisect(4));
		assertFalse(an.esteAnBisect(99));
		assertFalse(an.esteAnBisect(100));
		assertFalse(an.esteAnBisect(200));
		assertFalse(!an.esteAnBisect(400));
		assertFalse(an.esteAnBisect(500));
		assertFalse(an.esteAnBisect(1000));
		assertFalse(!an.esteAnBisect(1600));
		assertFalse(an.esteAnBisect(2018));
	}

}