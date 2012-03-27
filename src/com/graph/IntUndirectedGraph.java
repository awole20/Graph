package com.graph;

import java.util.List;

/**
 * an undirected graph created from a directed graph
 */
public abstract class IntUndirectedGraph implements UndirectedGraph<Integer>{

	protected IntDirectedGraph graph;

	@Override
	public final void connect(Integer vertex1, Integer vertex2) {
		connect(vertex1, vertex2, 1);
	}

	@Override
	public final void connect(Integer vertex1, Integer vertex2, int distance) {
		graph.connect(vertex1, vertex2, distance);
		graph.connect(vertex2, vertex1, distance);
	}

	@Override
	public final List<Integer> getConnectedList(Integer vertex) {
		return graph.getConnectedList(vertex);
	}

	@Override
	public final Integer getDistance(Integer vertex1, Integer vertex2) {
		return graph.getDistance(vertex1, vertex2);
	}

	@Override
	public final boolean isConnected(Integer vertex1, Integer vertex2) {
		return graph.isConnected(vertex1, vertex2);
	}

	@Override
	public final int size() {
		return graph.size();
	}
	
}
