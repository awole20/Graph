package com.graph;

import java.util.List;

public class AdjacencyListObjectUndirectedGraphTest extends ObjectUndirectedGraphTest {

	@Override
	protected UndirectedGraph<String> initGraph(List<String> nodes) {
		return new AdjacencyListUndirectedObjectGraph<String>(nodes);
	}
	
}
