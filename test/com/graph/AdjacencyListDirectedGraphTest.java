package com.graph;

public class AdjacencyListDirectedGraphTest extends DirectedGraphTest{

	@Override
	protected DirectedGraph initGraph(int size) {
		return new AdjacencyListDirectedGraph(size);
	}

}
