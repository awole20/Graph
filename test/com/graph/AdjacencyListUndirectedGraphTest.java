package com.graph;

public class AdjacencyListUndirectedGraphTest extends UndirectedGraphTest {

	@Override
	UndirectedGraph initGraph(int size) {
		
		return new AdjacencyListUndirectedGraph(size);
	}

}
