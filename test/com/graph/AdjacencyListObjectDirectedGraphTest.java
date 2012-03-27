package com.graph;

import java.util.List;

public class AdjacencyListObjectDirectedGraphTest extends
		ObjectDirectedGraphTest {

	@Override
	protected DirectedGraph<String> initGraph(List<String> nodes) {
		return new AdjacencyListDirectedObjectGraph<String>(nodes);
	}

}
