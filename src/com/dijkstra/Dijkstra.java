package com.dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.graph.Graph;

public class Dijkstra {

	private class DiscoveredNode implements Comparable<DiscoveredNode> {
		public int node;
		public int distance;
		public boolean visited = false;
		DiscoveredNode(int node, int distance){
			this.node = node;
			this.distance = distance;
		}
		@Override
		public int compareTo(DiscoveredNode o) {
			return this.distance - o.distance;
		}
	}
	
	public static final int INFINITY = Integer.MAX_VALUE;
	
	private Graph graph;
	
	public Dijkstra(Graph graph){
		this.graph = graph;
	}
	
	public int findMinimumPath(int source, int destination) {
		Map<Integer, DiscoveredNode> visitedMap = new HashMap<Integer, DiscoveredNode>(this.graph.size());
		for(int i = 0; i < this.graph.size(); i++){
			visitedMap.put(i, new DiscoveredNode(i, Dijkstra.INFINITY));
			if(i == source){
				visitedMap.get(i).distance = 0;
			}
		}
		return findMinimumPath(source, destination, visitedMap);
	}
	
	private int findMinimumPath(int source, int destination, Map<Integer, DiscoveredNode> visitedMap){
		
		//base case 1: we reached desination
		if(source == destination){
			return visitedMap.get(destination).distance;
		}
		
		DiscoveredNode temp = getNextNodeToVisit(visitedMap);
		
		//base case 2: we have run out of nodes to visit, and it is impossible to get to the destination
		if(temp == null){
			return Dijkstra.INFINITY;
		}
		
		markVisited(temp);
		
		markDistanceOfConnectedNodesFromVisited(visitedMap, temp);
		
		return findMinimumPath(temp.node, destination, visitedMap);
	}

	private void markDistanceOfConnectedNodesFromVisited(Map<Integer, DiscoveredNode> visitedMap, DiscoveredNode temp) {
		List<Integer> listOfConnected = this.graph.getConnectedList(temp.node);
		for(int i = 0; i < listOfConnected.size(); i++){
			
			//if the node is already known, continue
			if(visitedMap.get(new Integer(listOfConnected.get(i))).visited){
				continue;
			}
			//otherwise git minimum between the new path and old path
			int newDistance = Math.min(visitedMap.get(listOfConnected.get(i)).distance, temp.distance + this.graph.getDistance(temp.node, listOfConnected.get(i)));
			visitedMap.get(listOfConnected.get(i)).distance = newDistance;
			
		}
	}

	private void markVisited(DiscoveredNode temp) {
		temp.visited = true;
	}

	private DiscoveredNode getNextNodeToVisit(Map<Integer, DiscoveredNode> visitedMap) {
		List<DiscoveredNode> sortedList = new ArrayList<DiscoveredNode>(visitedMap.values());
		Collections.sort(sortedList);
		
		DiscoveredNode temp = null;
		for(int i = 0; i < sortedList.size(); i++){
			temp = sortedList.get(i);
			if(!temp.visited){
				break;
			}
		}
		return temp;
	}

	
	
}
