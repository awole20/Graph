package com.graph;

public class AdjacencyListUndirectedGraphTest extends UndirectedGraphTest {

	@Override
	protected UndirectedGraph initGraph(int size) {
		return new AdjacencyListUndirectedGraph(size);
	}

}
