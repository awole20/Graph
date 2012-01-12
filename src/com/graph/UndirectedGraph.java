package com.graph;

import java.util.List;

public interface UndirectedGraph {

	/**
	 * Connects two vertices together with a unit distance of one
	 */
	public abstract void connect(int vertex1, int vertex2);

	/**
	 * Connects two vertices together with the given distance
	 */
	public abstract void connect(int vertex1, int vertex2, int distance);

	/**
	 * Returns the list of connected vertices for the given vertex
	 */
	public abstract List<Integer> getConnectedList(int vertex);

	/**
	 * Gets the distance between two vertices. If the vertices are not connected, return null.
	 */
	public abstract Integer getDistance(int vertex1, int vertex2);

	public abstract boolean isConnected(int vertex1, int vertex2);

	/**
	 * 
	 * @return the size of this graph
	 */
	public abstract int size();

}