package com.graph;

public class AdjacencyListUndirectedGraphTest extends UndirectedGraphTest {

	@Override
	protected IntUndirectedGraph initGraph(int size) {
		return new AdjacencyListUndirectedGraph(size);
	}

}
