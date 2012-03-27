package com.graph;

public class AdjacencyMatrixDirectedGraphTest extends DirectedGraphTest{

	@Override
	protected DirectedGraph<Integer> initGraph(int size) {
		return new AdjacencyMatrixDirectedGraph(size);
	}

}
