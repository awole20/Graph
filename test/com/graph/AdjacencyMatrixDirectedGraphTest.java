package com.graph;

public class AdjacencyMatrixDirectedGraphTest extends DirectedGraphTest{

	@Override
	protected DirectedGraph initGraph(int size) {
		return new AdjacencyMatrixDirectedGraph(size);
	}

}
