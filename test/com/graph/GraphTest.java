package com.graph;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({AdjacencyListDirectedGraphTest.class,
	AdjacencyListUndirectedGraphTest.class,
	AdjacencyMatrixDirectedGraphTest.class,
	AdjacencyMatrixUndirectedGraphTest.class,
	})
public class GraphTest {

}
