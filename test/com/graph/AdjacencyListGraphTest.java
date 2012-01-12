package com.graph;

public class AdjacencyListGraphTest extends GraphTest {

	@Override
	Graph initGraph(int size) {
		
		return new AdjacencyListGraph(size);
	}

}
