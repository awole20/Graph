package com.graph;

public class AdjacencyMatrixDirectedGraphTest extends DirectedGraphTest{

	@Override
	protected IntDirectedGraph initGraph(int size) {
		return new AdjacencyMatrixDirectedGraph(size);
	}

}
