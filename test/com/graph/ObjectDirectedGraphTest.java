package com.graph;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ObjectDirectedGraphTest {

	private DirectedObjectGraph<String> graph;
	
	@Before
	public void setup(){
		List<String> namedNodes = new ArrayList<String>();
		namedNodes.add("one");
		namedNodes.add("two");
		namedNodes.add("Three");
		 this.graph = new AdjacencyListDirectedObjectGraph<String>(namedNodes);
	}
	
	@Test
	public void testBasic() {
		this.graph.connect("one", "Three");
		assertTrue(this.graph.isConnected("one", "Three"));
		assertFalse(this.graph.isConnected("one", "two"));
	}

}
