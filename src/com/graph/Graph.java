package com.graph;

import java.util.List;

public interface Graph {
	
	/**
	 * Returns the list of connected vertices for the given vertex
	 */
	public abstract List<Integer> getConnectedList(int vertex);

	/**
	 * Gets the distance from vertex 1 to vertex 2. If the vertices are not connected, return null.
	 */
	public abstract Integer getDistance(int vertex1, int vertex2);

	/**
	 * Returns true if vertex 1 has a direct connection to vertex 2
	 */
	public abstract boolean isConnected(int vertex1, int vertex2);

	/**
	 * 
	 * @return the size of this graph
	 */
	public abstract int size();
	
}
