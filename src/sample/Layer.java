package sample;

import java.util.ArrayList;
import java.util.List;

public class Layer {
	public List<Node> nodes = new ArrayList<Node>();

	public Layer(int numNodes) {
		for (int i = 0; i<numNodes; i++) {
			Node node = new Node();
			nodes.add(node);
		}

	}



}
