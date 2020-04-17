package eg.edu.alexu.csd.datastructure.queue.cs5_cs16_cs64.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import eg.edu.alexu.csd.datastructure.queue.cs5_cs16_cs64.Classes.QueueLinkedBased;

class QueueLinkedBasedTest {

	@Test
	void test() {
		// -ve number as size of array	 
		
		//
		QueueLinkedBased test=new QueueLinkedBased();
	    //dequeue while queue is empty
		
		assertEquals(true, test.isEmpty());
		
		test.enqueue(1);
		test.enqueue(2);
		test.enqueue(3);
		test.enqueue(4);
		
		assertEquals(false, test.isEmpty());
		//size supposed to be four
		assertEquals(4,test.size());
		//
		assertEquals(1,test.dequeue());
		assertEquals(2,test.dequeue());
		assertEquals(3,test.dequeue());
		assertEquals(4,test.dequeue());
		//dequeue while queue is empty
		assertThrows(RuntimeException.class,()->{test.dequeue();});
	}

}