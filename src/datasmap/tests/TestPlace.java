package datasmap.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datasmap.models.Place;

class TestPlace {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPlaceStringDoubleDouble() {
		Place p = new Place("1", 0.001, -0.005);
		assertNull(p.getParent());
		assertEquals("1", p.getAddress());
	}

	@Test
	void testPlaceStringDoubleDoublePlace() {
		Place p0 = new Place("Caen", 0.002, 0.006);
		Place p1 = new Place("Place Würsburg", 0.001, 0.005, p0);
		Place p2 = new Place("1", 0.0011, -0.0055, p1);
		assertEquals(p0.getAddress(), "Caen");
		assertEquals(p1.getAddress(), "Place Würsburg, Caen");
		assertEquals(p2.getAddress(), "1, Place Würsburg, Caen");
	}

}
