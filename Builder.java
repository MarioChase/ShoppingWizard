
public class Builder {
	public Decision d_a3 = new Decision(null, null, "Buy the XG300 model.", "Buy the XG200 model.",
			"Do you like to go fast?");
	public Decision d_a2 = new Decision(d_a3, null, null, "Buy the XG200 model.", "Are you an expert?");
	public Decision d_a1 = new Decision(d_a2, null, null, "Buy the XG100 model.", "Have you snowboarded before?");
	public Decision d_b3 = new Decision(null, null, "Buy the ZR300 model.", "Buy the ZR200 model.",
			"Do you like to jump?");
	public Decision d_b2 = new Decision(d_b3, null, null, "Buy the ZR200 model.", "Are you an expert?");
	public Decision d_b1 = new Decision(d_b2, null, null, "Buy the ZR100 model.", "Have you snowboarded before?");
	public Decision d_b0 = new Decision(d_b1, null, null, "Recommend they try skiing someday",
			"Do you want to buy downhill skis?");
	public Decision d_a0 = new Decision(d_a1, d_b0, null, null, "Do you want to buy a snowboard");

	private Builder() {
		
	}

	public IDecision buildWizard() {
		return d_a0;
	}

	public static Builder getInstance() {
		Builder a = new Builder();
		return a;
	}
}
