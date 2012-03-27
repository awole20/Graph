package com.graph;

public class AdjacencyListDirectedGraphTest extends DirectedGraphTest{

	@Override
	protected IntDirectedGraph initGraph(int size) {
		return new AdjacencyListDirectedGraph(size);
	}

}
