package com.graph;

import java.util.List;

public interface UndirectedGraph<k> extends Graph<k> {

	/**
	 * Connects two vertices together with a unit distance of one
	 */
	public void connect(k vertex1, k vertex2);

	/**
	 * Connects two vertices together with the given distance
	 */
	public void connect(k vertex1, k vertex2, int distance);

	/**
	 * Returns the list of connected vertices for the given vertex
	 */
	public List<Integer> getConnectedList(Integer vertex);

	/**
	 * Gets the distance between two vertices. If the vertices are not connected, return null.
	 */
	public Integer getDistance(Integer vertex1, Integer vertex2);

	public boolean isConnected(Integer vertex1, Integer vertex2);

	/**
	 * 
	 * @return the size of this graph
	 */
	public int size();

}