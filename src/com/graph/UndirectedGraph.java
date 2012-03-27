package com.graph;

import java.util.List;

public abstract class UndirectedGraph<k> implements Graph<k> {

	protected DirectedGraph<k> graph;

	public final void connect(k vertex1, k vertex2) {
		connect(vertex1, vertex2, 1);
	}

	public final void connect(k vertex1, k vertex2, int distance) {
		graph.connect(vertex1, vertex2, distance);
		graph.connect(vertex2, vertex1, distance);
	}

	@Override
	public final List<k> getConnectedList(k vertex) {
		return graph.getConnectedList(vertex);
	}

	@Override
	public final Integer getDistance(k vertex1, k vertex2) {
		return graph.getDistance(vertex1, vertex2);
	}

	@Override
	public final boolean isConnected(k vertex1, k vertex2) {
		return graph.isConnected(vertex1, vertex2);
	}

	@Override
	public final int size() {
		return graph.size();
	}

}