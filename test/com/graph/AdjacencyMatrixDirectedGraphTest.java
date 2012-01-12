package com.graph;

public class AdjacencyMatrixDirectedGraphTest extends DirectedGraphTest{

	@Override
	DirectedGraph initGraph(int size) {
		return new AdjacencyMatrixDirectedGraph(size);
	}

}
