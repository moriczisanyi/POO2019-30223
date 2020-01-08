import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import javax.swing.text.BadLocationException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameFrameTest {

	
	private static GameFrame f;
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
	void testGameFrame() {
		try {
			f= new GameFrame();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	//"Hint1: 'HAMMERHEAD' | Hint2: 'MAKO' | Hint3: 'TIGER' | Hint4: 'GOBLIN' | Hint5: 'BULL' | Hint6: 'TEETH' | Hint7: 'THRESHER' | Hint8D: 'PUP' | Hint8A: 'PLANKTON' | Hint9: 'SMELL' | Hint10: 'WHALE' | Hint11: 'THREE' | Hint12: 'COOKIECUTTER'"
	void testGet1stString() throws BadLocationException,NullPointerException {
		String s=f.get1stString();
		assertNull(s);
	}

	@Test
	void testSet1stStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet2ndString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet2ndStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet3rdString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet3rdStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet4thString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet4thStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet5thString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet5thStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet6thString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet6thStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet7thString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet7thStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet8thStringDown() {
		fail("Not yet implemented");
	}

	@Test
	void testSet8thStringDownAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet8thStringAcross() {
		fail("Not yet implemented");
	}

	@Test
	void testSet8thStringAcrossAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet9thString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet9thStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet10thString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet10thStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet11thString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet11thStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testGet12thString() {
		fail("Not yet implemented");
	}

	@Test
	void testSet12thStringAfterCheck() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck1stString() throws BadLocationException, NullPointerException {
		assertFalse(f.check1stString());
	}

	@Test
	void testCheck2ndString() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck3rdString() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck4thString() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck5thString() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck6thString() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck7thString() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck8thStringAcross() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck8thStringDown() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck9thString() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck10thString() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck11thString() {
		fail("Not yet implemented");
	}

	@Test
	void testCheck12thString() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCheckButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint1ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint2ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint3ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint4ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint5ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint6ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint7ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint8ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint9ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint10ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint11ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetHint12ButtonActionListener() {
		fail("Not yet implemented");
	}

	@Test
	void testSetSecret() {
		fail("Not yet implemented");
	}

}
