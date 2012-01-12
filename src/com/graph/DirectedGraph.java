package com.graph;

public interface DirectedGraph extends Graph{

	/**
	 * Connects vertex 1 to vertex 2 with a unit distance of one
	 */
	public abstract void connect(int vertex1, int vertex2);

	/**
	 * Connects vertex 1 to vertex 2 together with the given distance
	 */
	public abstract void connect(int vertex1, int vertex2, int distance);
	
}
