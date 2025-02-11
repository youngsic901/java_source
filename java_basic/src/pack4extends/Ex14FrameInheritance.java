package pack4extends;

import java.awt.Frame;

@SuppressWarnings("serial")
public class Ex14FrameInheritance extends Frame{
	public Ex14FrameInheritance() {
//		super();
		super("상속 연습용");
	}

	public void frameVisible() {
		setSize(500, 300);
		setLocation(200, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex14FrameInheritance frame = new Ex14FrameInheritance();
		frame.frameVisible();
	}
}
