package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.adneom.PartitionApp;

public class PartitionTests {
	PartitionApp partition = new PartitionApp();

	@Test
	public void testSize_2() {
		List<List<Integer>> partitioned = partition.partition(Arrays.asList(1, 2, 3, 4), 2);

		assertEquals(partitioned.size(), 2);
		assertEquals(partitioned.get(0), Arrays.asList(1, 2));
		assertEquals(partitioned.get(1), Arrays.asList(3, 4));
	}

	@Test
	public void testSize_3() {
		List<List<Integer>> partitioned = partition.partition(Arrays.asList(1, 2, 3, 4), 3);

		assertEquals(partitioned.size(), 2);
		assertEquals(partitioned.get(0), Arrays.asList(1, 2, 3));
		assertEquals(partitioned.get(1), Arrays.asList(4));
	}

	@Test
	public void testFaild() {
		List<List<Integer>>  partitioned = partition.partition(Arrays.asList(1, 2, 3, 4), 3);

		assertEquals(partitioned.size(), 2);
		assertNotEquals(partitioned.get(0), Arrays.asList(1, 2));

	}
}
