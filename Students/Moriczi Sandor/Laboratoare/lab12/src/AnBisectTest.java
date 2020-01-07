import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnBisectTest {

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
	void testEsteAnBisect() {
		AnBisect an = new AnBisect();
		assertTrue(!an.esteAnBisect(203));
		assertTrue(an.esteAnBisect(4));
		assertTrue(!an.esteAnBisect(99));
		assertTrue(!an.esteAnBisect(100));
		assertTrue(!an.esteAnBisect(200));
		assertTrue(an.esteAnBisect(400));
		assertTrue(!an.esteAnBisect(500));
		assertTrue(!an.esteAnBisect(1000));
		assertTrue(an.esteAnBisect(1600));
		assertTrue(!an.esteAnBisect(2018));
	}

}
