package com.graph;

import java.util.List;

public class AdjacencyMatrixObjectUndirectedGraphTest extends ObjectUndirectedGraphTest {

	@Override
	protected UndirectedGraph<String> initGraph(List<String> nodes) {
		return new AdjacencyMatrixUndirectedObjectGraph<String>(nodes);
	}
	
}
