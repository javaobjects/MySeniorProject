package com.neuedu.chapter06.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;

public class AddEmpPanel extends JPanel {
	private JTextField txt_empno;
	private JTextField txt_ename;
	private JPasswordField txt_password;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdb_man;
	private JRadioButton rdb_female;
	private JCheckBox cbx_dajidali;
	private JCheckBox cbx_code;
	private JCheckBox cbx_basketball;
	private JCheckBox cbx_sing;
	private JTextArea txt_demo;
	private JComboBox combx_address;

	/**
	 * Create the panel.
	 */
	public AddEmpPanel() {
		setLayout(null);
		
		JLabel label = new JLabel("\u5458\u5DE5\u7F16\u53F7\uFF1A");
		label.setBounds(46, 43, 72, 15);
		add(label);
		
		txt_empno = new JTextField();
		txt_empno.setText("123");
		txt_empno.setBounds(128, 35, 110, 31);
		add(txt_empno);
		txt_empno.setColumns(10);
		
		JLabel label_1 = new JLabel("\u5458\u5DE5\u59D3\u540D\uFF1A");
		label_1.setBounds(321, 43, 72, 15);
		add(label_1);
		
		txt_ename = new JTextField();
		txt_ename.setBounds(403, 36, 126, 28);
		add(txt_ename);
		txt_ename.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5458\u5DE5\u5BC6\u7801\uFF1A");
		label_2.setBounds(46, 88, 72, 15);
		add(label_2);
		
		txt_password = new JPasswordField();
		txt_password.setBounds(128, 80, 110, 31);
		add(txt_password);
		
		JLabel label_3 = new JLabel("\u6027    \u522B\uFF1A");
		label_3.setBounds(321, 88, 72, 15);
		add(label_3);
		
		rdb_man = new JRadioButton("\u7537");
		buttonGroup.add(rdb_man);
		rdb_man.setBounds(403, 84, 46, 23);
		add(rdb_man);
		
		rdb_female = new JRadioButton("\u5973");
		buttonGroup.add(rdb_female);
		rdb_female.setBounds(475, 84, 54, 23);
		add(rdb_female);
		
		JLabel label_4 = new JLabel("\u7231    \u597D\uFF1A");
		label_4.setBounds(46, 142, 72, 15);
		add(label_4);
		
		cbx_dajidali = new JCheckBox("\u5927\u5409\u5927\u5229");
		cbx_dajidali.setBounds(128, 138, 82, 23);
		add(cbx_dajidali);
		
		cbx_code = new JCheckBox("\u5199\u4EE3\u7801");
		cbx_code.setBounds(214, 138, 72, 23);
		add(cbx_code);
		
		cbx_basketball = new JCheckBox("\u7BEE\u7403");
		cbx_basketball.setBounds(288, 138, 54, 23);
		add(cbx_basketball);
		
		cbx_sing = new JCheckBox("\u5531\u6B4C");
		cbx_sing.setBounds(350, 138, 72, 23);
		add(cbx_sing);
		
		JLabel label_5 = new JLabel("\u7C4D    \u8D2F\uFF1A");
		label_5.setBounds(46, 184, 72, 15);
		add(label_5);
		
		combx_address = new JComboBox();
		combx_address.setModel(new DefaultComboBoxModel(new String[] {"", "\u5E7F\u5DDE\u5E02", "\u6C55\u5934\u5E02", "\u6F6E\u5DDE\u5E02", "\u6DF1\u5733\u5E02", "\u6E5B\u6C5F\u5E02", "\u6C5F\u95E8\u5E02"}));
		combx_address.setBounds(128, 181, 89, 21);
		add(combx_address);
		
		JLabel label_6 = new JLabel("\u5907    \u6CE8\uFF1A");
		label_6.setBounds(46, 242, 72, 15);
		add(label_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(124, 237, 230, 78);
		add(scrollPane);
		
		txt_demo = new JTextArea();
		txt_demo.setLocation(128, 0);
		scrollPane.setViewportView(txt_demo);
		txt_demo.setLineWrap(true);
		
		//����
		JButton button = new JButton("\u65B0\u589E");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ա�����
				String empno = txt_empno.getText();
				//Ա������
				String ename = txt_ename.getText();
				//����
				char[] passwordArray = txt_password.getPassword();
				//�Ա�
				String sex = "����";
				if(rdb_man.isSelected())
				{
					sex = rdb_man.getText();
				}
				else if(rdb_female.isSelected())
				{
					sex = rdb_female.getText();
				}
				//����
				String hobby = "";
				if(cbx_dajidali.isSelected())
				{
					hobby += cbx_dajidali.getText() + ";";
				}
				if(cbx_code.isSelected())
				{
					hobby += cbx_code.getText() + ";";
				}
				if(cbx_basketball.isSelected())
				{
					hobby += cbx_basketball.getText() + ";";
				}
				if(cbx_sing.isSelected())
				{
					hobby += cbx_sing.getText() + ";";
				}
				//����
				String address = (String)combx_address.getSelectedItem();
				//��ע
				String demo = txt_demo.getText();
				
				System.out.println("Ա����ţ�" + empno + "\n"
						+ " Ա��������" + ename + "\n"
						+ " ���룺" + new String(passwordArray) + "\n"
						+ " �Ա�" + sex + "\n"
						+ " ���ã�" + hobby + "\n"
						+ " ���᣺" + address + "\n"
						+ " ��ע��" + demo + "\n");
			}
		});
		button.setBounds(535, 319, 93, 23);
		add(button);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.setBounds(417, 319, 93, 23);
		add(button_1);

	}
}
