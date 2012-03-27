package com.graph;

import java.util.List;


public interface Graph<k> {

	/**
	 * Returns the list of connected vertices for the given vertex
	 */
	public abstract List<k> getConnectedList(k vertex);

	/**
	 * Gets the distance from vertex 1 to vertex 2. If the vertices are not connected, return null.
	 */
	public abstract Integer getDistance(k vertex1, k vertex2);

	/**
	 * Returns true if vertex 1 has a direct connection to vertex 2
	 */
	public abstract boolean isConnected(k vertex1, k vertex2);

	/**
	 * 
	 * @return the size of this graph
	 */
	public abstract int size();
	
}
