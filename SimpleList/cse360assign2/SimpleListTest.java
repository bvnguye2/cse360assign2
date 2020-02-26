import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SimpleListTest {

	@Test
	void testConstructor() {
		SimpleList simple = new SimpleList();
		assertNotNull(simple);
	}
	
	@Test
	void testConstructor2() {
		SimpleList simple = new SimpleList();
		assertNotEquals(simple, 5);
	}
	
	@Test
	void testAdd() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		assertEquals(simple.count(), 1);
	}
	
	@Test
	void testAdd2() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		assertEquals(simple.search(10), 0);
	}
	
	@Test
	void testRemove() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.remove(10);
		assertEquals(simple.count(), 0);
	}
	
	@Test
	void testRemove2() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.remove(10);
		assertEquals(simple.search(10), -1);
	}
	
	@Test
	void testCount() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(2);
		assertEquals(simple.count(), 2);
	}
	
	@Test
	void testCount2() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(2);
		assertNotEquals(simple.count(), 1);
	}
	
	@Test
	void testToString() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(2);
		assertEquals(simple.toString(), "2 10");
	}
	
	@Test
	void testToString2() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(2);
		assertNotEquals(simple.toString(), "2 2");
	}
	
	@Test
	void testSearch() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(2);
		assertEquals(simple.search(2), 0);
	}
	
	@Test
	void testSearch2() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(2);
		assertEquals(simple.search(3), -1);
	}

}
