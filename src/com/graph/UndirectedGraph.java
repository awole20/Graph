package com.graph;

public interface UndirectedGraph<k> extends Graph<k> {

	/**
	 * Connects two vertices together with a unit distance of one
	 */
	public void connect(k vertex1, k vertex2);

	/**
	 * Connects two vertices together with the given distance
	 */
	public void connect(k vertex1, k vertex2, int distance);

}