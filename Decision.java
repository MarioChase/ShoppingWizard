import java.util.Scanner;

public class Decision implements IDecision {
	private String m_question;
	private IDecision m_yes;
	private IDecision m_no;
	private String m_YesTerminal;
	private String m_noTerminal;

	public Decision(IDecision d_yes, IDecision d_no, String yes, String no, String question) {
		m_yes = d_yes;
		m_no = d_no;
		m_YesTerminal = yes;
		m_noTerminal = no;
		m_question = question;

	}

	@Override
	public void setYes(IDecision yes) {
		m_yes = yes;

	}

	@Override
	public void setNo(IDecision no) {
		m_no = no;

	}

	@Override
	public void setYesTerminal(String terminal) {
		m_YesTerminal = terminal;
	}

	@Override
	public void setNoTerminal(String terminal) {
		m_noTerminal = terminal;
	}

	@Override
	public IDecision ask() {
		System.out.println(m_question);
		Scanner input = new Scanner(System.in);
		switch (input.nextLine().toLowerCase()) {
		case "yes":
			// move to yes node
			if (m_yes != null) {
				return m_yes;
			} else {
				System.out.println(m_YesTerminal);
				return null;
			}
		case "no":
			// move to no node
			if (m_no != null) {
				return m_no;
			} else {
				System.out.println(m_noTerminal);
				return null;
			}
		default:
			System.out.println("invalid response try again.");
			return this;
		}
	}

}
