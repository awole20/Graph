package com;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.dijkstra.DijkstraTest;
import com.graph.GraphTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({GraphTest.class, DijkstraTest.class})
public class Tests {

}
