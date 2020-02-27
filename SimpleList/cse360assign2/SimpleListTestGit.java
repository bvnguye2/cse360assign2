import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SimpleListTestGit {

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
	void testAdd3() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		assertEquals(simple.size(), 15);
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
	void testRemove3() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.remove(10);
		assertEquals(simple.size(), 7);
	}
	
	@Test
	void testRemove4() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.remove(10);
		simple.add(10);
		simple.remove(10);
		simple.add(10);
		simple.remove(10);
		simple.add(10);
		simple.remove(10);
		simple.add(10);
		simple.remove(10);
		assertEquals(simple.size(), 1);
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
	
	@Test
	void testAppend() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.append(2);
		assertEquals(simple.first(), 10);
	}
	
	void testAppend2() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.append(2);
		assertEquals(simple.size(), 15);
	}
	
	@Test
	void testfirst() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		assertEquals(simple.first(), 10);
	}
	
	@Test
	void testfirst2() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		assertNotEquals(simple.first(), 11);
	}
	
	@Test
	void testlast() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		assertEquals(simple.last(), 10);
	}
	
	@Test
	void testlast2() {
		SimpleList simple = new SimpleList();
		simple.add(2);
		simple.add(10);
		assertEquals(simple.last(), 2);
	}
	
	@Test
	void testlast3() {
		SimpleList simple = new SimpleList();
		simple.add(2);
		simple.add(10);
		assertNotEquals(simple.last(), 10);
	}
	
	@Test
	void testSize() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		assertEquals(simple.size(), 10);
	}
	
	@Test
	void testSize2() {
		SimpleList simple = new SimpleList();
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		simple.add(10);
		assertEquals(simple.size(), 15);
	}

}
