package com.graph;

public interface DirectedGraph<k> extends Graph<k> {

	/**
	 * Connects vertex 1 to vertex 2 with a unit distance of one
	 */
	public void connect(k vertex1, k vertex2);

	/**
	 * Connects vertex 1 to vertex 2 together with the given distance
	 */
	public void connect(k vertex1, k vertex2, int distance);

}