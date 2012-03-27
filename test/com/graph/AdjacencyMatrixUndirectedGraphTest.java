package com.graph;


public class AdjacencyMatrixUndirectedGraphTest extends UndirectedGraphTest {

	@Override
	protected UndirectedGraph<Integer> initGraph(int size){
		return new AdjacencyMatrixUndirectedGraph(size);
	}
	
}
