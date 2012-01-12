package com.graph;

import java.util.List;

/**
 * an undirected graph created from a directed graph
 */
public abstract class UndirectedGraph implements Graph{

	protected DirectedGraph graph;

	/**
	 * Connects two vertices together with a unit distance of one
	 */
	public final void connect(int vertex1, int vertex2) {
		connect(vertex1, vertex2, 1);
	}

	/**
	 * Connects two vertices together with the given distance
	 */
	public final void connect(int vertex1, int vertex2, int distance) {
		graph.connect(vertex1, vertex2, distance);
		graph.connect(vertex2, vertex1, distance);
	}

	/**
	 * Returns the list of connected vertices for the given vertex
	 */
	@Override
	public final List<Integer> getConnectedList(int vertex) {
		return graph.getConnectedList(vertex);
	}

	/**
	 * Gets the distance between two vertices. If the vertices are not connected, return null.
	 */
	@Override
	public final Integer getDistance(int vertex1, int vertex2) {
		return graph.getDistance(vertex1, vertex2);
	}

	@Override
	public final boolean isConnected(int vertex1, int vertex2) {
		return graph.isConnected(vertex1, vertex2);
	}

	/**
	 * 
	 * @return the size of this graph
	 */
	@Override
	public final int size() {
		return graph.size();
	}
	
}
