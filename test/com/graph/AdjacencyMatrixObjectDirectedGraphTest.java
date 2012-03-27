package com.graph;

import java.util.List;

public class AdjacencyMatrixObjectDirectedGraphTest extends
		ObjectDirectedGraphTest {

	@Override
	protected DirectedGraph<String> initGraph(List<String> nodes) {
		return new AdjacencyMatrixDirectedObjectGraph<String>(nodes);
	}

}
