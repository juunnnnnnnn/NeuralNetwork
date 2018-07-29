package sample;

import java.util.ArrayList;
import java.util.List;

public class Node {
	public List<Edge> inputs = new ArrayList<Edge>();
	public List<Edge> outputs = new ArrayList<Edge>();
	public double inValue;//入力値の合計
	public double value;

	//活性化関数
	public double Activation(double val) {
		return 1.0/(1.0 + Math.exp(-val));
	}

	//Edgeの数だけ計算
	public void CalcForward() {
		if (inputs.size()==0)return;

		inValue = 0.0;
		for (Edge edge : inputs) {
			inValue+=
					edge.left.value*edge.weight;
		}

		//出力値を算出
		value=Activation(inValue);

	}
}
