package whindow;

import java.awt.EventQueue;

public class ChineseChessApp {
	
	/**
	 * ���г������
	 * �����������
	 * ���أ���
	 * ����:��ط��
	 * ʱ��:2014-11-12
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChineseChessMainFrame frame = new ChineseChessMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
