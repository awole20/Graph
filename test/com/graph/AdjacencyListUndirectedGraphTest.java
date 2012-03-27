package com.graph;

public class AdjacencyListUndirectedGraphTest extends UndirectedGraphTest {

	@Override
	protected UndirectedGraph<Integer> initGraph(int size) {
		return new AdjacencyListUndirectedGraph(size);
	}

}
