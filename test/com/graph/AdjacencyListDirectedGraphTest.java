package com.graph;

public class AdjacencyListDirectedGraphTest extends DirectedGraphTest{

	@Override
	DirectedGraph initGraph(int size) {
		return new AdjacencyListDirectedGraph(size);
	}

}
