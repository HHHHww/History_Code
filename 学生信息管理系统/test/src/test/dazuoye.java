package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class dazuoye {

	public static void main(String[] args) {
		denglu b=new denglu();
		b.setVisible(true);
//		gongneng bb=new gongneng();
//		bb.setVisible(true);
//		jiaoshiluru bbb=new jiaoshiluru();
//		bbb.setVisible(true);
//		chakanjiaoshi bbbb=new chakanjiaoshi();
//		bbbb.setVisible(true);
//		xiugaishanchu bbbbb=new xiugaishanchu();
//		bbbbb.setVisible(true);
//		guanliyuangeren a=new guanliyuangeren();
//		a.setVisible(true);
//		xueshengzhanghao a=new xueshengzhanghao();
//		a.setVisible(true);
//		jieshang a=new jieshang();
//		a.setVisible(true);
//		chengjiluru aaa=new chengjiluru();
//		aaa.setVisible(true);
//		chaxunxiugai a=new chaxunxiugai();
//		a.setVisible(true);
//		xueshenggeren a=new xueshenggeren();
//		a.setVisible(true);
	}

}
class denglu extends JFrame{
	public denglu() {
		String zhanghao1="";
		String mima="";
		String guanliyuanzhanghao="0000";
		File file1 =new File("guanliyuanzhanghao.txt");
		if(!file1.exists()) {
			try {
				file1.createNewFile();
				FileWriter fw=new FileWriter(file1);
				fw.write(guanliyuanzhanghao);
				fw.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		String guanliyuanmima="0000";
		File file2 =new File("guanliyuanmima.txt");
		if(!file2.exists()) {
			try {
				file2.createNewFile();
				FileWriter fw=new FileWriter(file2);
				fw.write(guanliyuanmima);
				fw.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
		Container container=getContentPane();
		setBounds(100, 100, 400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new BorderLayout());
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		JPanel jp3=new JPanel();
		container.add(jp1,BorderLayout.NORTH);
		container.add(jp2,BorderLayout.CENTER);
		container.add(jp3,BorderLayout.SOUTH);
		JLabel jl1=new JLabel("�û���¼");
		jl1.setFont(new Font("����",Font.BOLD, 25));
		
		jp1.setLayout(new BorderLayout());
		jp1.add(jl1,BorderLayout.CENTER);
		jl1.setBorder(BorderFactory.createEmptyBorder(25, 135, 0, 0));
		jp2.setLayout(null);
		
		
		
		JLabel jl2=new JLabel("�˺�");
		JLabel jl3=new JLabel("����");
		

		jp2.add(jl2);
		jp2.add(jl3);
		
		JTextField jt1=new JTextField(20);
		JPasswordField jpass=new JPasswordField();
		jp2.add(jt1);
		jp2.add(jpass);
		jl2.setBounds(60, 10, 50, 50);
		jl3.setBounds(60, 60, 50, 50);
		jl2.setFont(new Font("����", Font.BOLD, 20));
		jl3.setFont(new Font("����", Font.BOLD, 20));
		jt1.setBounds(115, 20, 200, 30);
		jpass.setBounds(115, 70, 200, 30);
		JRadioButton jr1=new JRadioButton("����Ա");
		JRadioButton jr2=new JRadioButton("��ʦ");
		JRadioButton jr3=new JRadioButton("ѧ��");
		jr1.setFont(new Font("����", Font.BOLD, 15));
		jr2.setFont(new Font("����", Font.BOLD, 15));
		jr3.setFont(new Font("����", Font.BOLD, 15));
		

		ButtonGroup group=new ButtonGroup();
		group.add(jr1);
		group.add(jr2);
		group.add(jr3);
		jp3.setLayout(new GridLayout(2, 1));
		JPanel jp31=new JPanel();
		JPanel jp32=new JPanel();
		jp3.add(jp31);
		jp3.add(jp32);
		jp31.add(jr1);
		jp31.add(jr2);
		jp31.add(jr3);
		JButton jb1=new JButton("��¼");
		jp32.add(jb1);
		jb1.setPreferredSize(new Dimension(250,35)); 
		
		try {
			FileReader fr=new FileReader(file1);
			char[] linshi=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				zhanghao1=new String(linshi,0,hasread);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		String zhanghao3=zhanghao1;
		
		try {
			FileReader fr=new FileReader(file2);
			char[] linshi2=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi2))!=-1) {
				 mima=new String(linshi2,0,hasread);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		String mima3=mima;
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String zhanghao2=jt1.getText();
				char ch[]=jpass.getPassword();
				String mima2=new String(ch);
				if(zhanghao3.equals(zhanghao2)) {
					if(jr1.isSelected()) {
					
					if(mima2.equals(mima3)) {
						gongneng bb=new gongneng();
						bb.setVisible(true);
						
						setVisible(false);
					}
					else {
						JOptionPane.showMessageDialog(null,"�˺Ż��������","��½ʧ��",JOptionPane.WARNING_MESSAGE);
					}
				}
					else{
						JOptionPane.showMessageDialog(null,"�˺Ż��������","��½ʧ��",JOptionPane.WARNING_MESSAGE);	}
					}
				
				if(jr2.isSelected()) {
					File file1=new File("��ʦ��Ϣ.txt");
					String xinxi="";
					try {
						FileReader fr=new FileReader(file1);
						char linshi[]=new char[1024];
						int hasread=-1;
						while((hasread=fr.read(linshi))!=-1) {
							 xinxi=new String(linshi,0,hasread);
							fr.close();
							break;
						}
					} catch (FileNotFoundException e1) {
						// TODO �Զ����ɵ� catch ��
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO �Զ����ɵ� catch ��
						e1.printStackTrace();
					}
					int num1=xinxi.indexOf(zhanghao2);
					
					if(num1==-1) {
						JOptionPane.showMessageDialog(null,"�˺Ż��������","��½ʧ��",JOptionPane.WARNING_MESSAGE);
					}
					else {
						int num2=xinxi.indexOf("��",num1+1);
						int num3=xinxi.indexOf("\n",num2+1);
						String mima4=xinxi.substring(num2+1, num3);
						if(mima4.equals(mima2)) {
							jiaoshigongneng aa=new jiaoshigongneng(zhanghao2);
							aa.setVisible(true);
							setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(null,"�˺Ż��������","��½ʧ��",JOptionPane.WARNING_MESSAGE);
						}
					}
				}
				if(jr3.isSelected()) {
					File file1=new File("ѧ����Ϣ.txt");
					String xinxi="";
					try {
						FileReader fr=new FileReader(file1);
						char linshi[]=new char[1024];
						int hasread=-1;
						while((hasread=fr.read(linshi))!=-1) {
							 xinxi=new String(linshi,0,hasread);
							fr.close();
							break;
						}
					} catch (FileNotFoundException e1) {
						// TODO �Զ����ɵ� catch ��
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO �Զ����ɵ� catch ��
						e1.printStackTrace();
					}
					int num1=xinxi.indexOf(zhanghao2);
					
					if(num1==-1) {
						JOptionPane.showMessageDialog(null,"�˺Ż��������","��½ʧ��",JOptionPane.WARNING_MESSAGE);
					}
					else {
						int num2=xinxi.indexOf("��",num1+1);
						int num3=xinxi.indexOf("\n",num2+1);
						String mima4=xinxi.substring(num2+1, num3);
						if(mima4.equals(mima2)) {
							xueshenggongneng aa=new xueshenggongneng(zhanghao2);
							aa.setVisible(true);
							setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(null,"�˺Ż��������","��½ʧ��",JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		
		
		
		


	}
}
class gongneng extends JFrame{
	public gongneng() {
		Container container=getContentPane();
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new GridLayout(2, 3));
		JButton jb1=new JButton("�޸�����");
		JButton jb2=new JButton("<html>¼���ʦ<br><br>�˺ź�����</html>");
		JButton jb3=new JButton("<html>�޸Ļ�ɾ��<br><br>��ʦ��Ϣ</html>");
		JButton jb4=new JButton("�鿴������Ϣ");
		JButton jb5=new JButton("<html>�鿴���н�ʦ<br><br>�˺���Ϣ</html>");
		JButton jb6=new JButton("<html>����������<br><br>ĳ����ʦ��Ϣ</html>");
		container.add(jb1);
		container.add(jb2);
		container.add(jb3);
		container.add(jb4);
		container.add(jb5);
		container.add(jb6);
		jb1.setFont(new Font("����", Font.BOLD, 23));
		jb2.setFont(new Font("����", Font.BOLD, 23));
		jb3.setFont(new Font("����", Font.BOLD, 23));
		jb4.setFont(new Font("����", Font.BOLD, 23));
		jb5.setFont(new Font("����", Font.BOLD, 23));
		jb6.setFont(new Font("����", Font.BOLD, 23));
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xinmima=JOptionPane.showInputDialog(null,"������������","�޸�����",JOptionPane.PLAIN_MESSAGE);
				File file1=new File("guanliyuanmima.txt");
				try {
					FileWriter fw=new FileWriter(file1);
					fw.write(xinmima);
					fw.close();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jiaoshiluru bbb=new jiaoshiluru();
				bbb.setVisible(true);
			}
		});
		jb5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chakanjiaoshi bbbb=new chakanjiaoshi();
				bbbb.setVisible(true);
			}
		});
jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xiugaishanchu bbbbb=new xiugaishanchu();
				bbbbb.setVisible(true);
			}
		});
jb4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		guanliyuangeren a=new guanliyuangeren();
		a.setVisible(true);
	}
});
jb6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name=JOptionPane.showInputDialog(null,"������Ҫ���ҵĽ�ʦ����","��Ϣ����",JOptionPane.PLAIN_MESSAGE);
		chazhao aa=new chazhao(name);
		aa.setVisible(true);
		
	}
});
	}
}

class jiaoshiluru extends JFrame{
	public jiaoshiluru() {
		Container container=getContentPane();
		setBounds(100, 100, 350, 320);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(null);
		JLabel jl1=new JLabel("��ʦ����");
		JLabel jl2=new JLabel("��ʦ�˺�");
		JLabel jl3=new JLabel("��ʦ����");
		JTextField jt1=new JTextField();
		JTextField jt2=new JTextField();
		JTextField jt3=new JTextField();
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jt1);
		container.add(jt2);
		container.add(jt3);
		jl1.setBounds(30, 80, 120, 30);
		jl2.setBounds(30, 130, 120, 30);
		jl3.setBounds(30, 180, 120, 30);
		jt1.setBounds(120, 80, 200, 30);
		jt2.setBounds(120, 130, 200, 30);
		jt3.setBounds(120, 180, 200, 30);
		jl1.setFont(new Font("����", Font.BOLD, 20));
		jl2.setFont(new Font("����", Font.BOLD, 20));
		jl3.setFont(new Font("����", Font.BOLD, 20));
		JLabel jl4=new JLabel("��ʦ��Ϣ¼��");
		container.add(jl4);
		jl4.setBounds(80, -10, 200, 100);
		jl4.setFont(new Font("����", Font.BOLD, 30));
		JButton jb1=new JButton("¼ ��");
		container.add(jb1);
		jb1.setBounds(105, 225, 120, 35);
		jb1.setFont(new Font("����", Font.BOLD, 20));
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String xingming=jt1.getText();
				File file1=new File("��ʦ��Ϣ.txt");
				if(!file1.exists()) {
					try {
						file1.createNewFile();
					} catch (IOException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				String zhanghao=jt2.getText();
				String mima=jt3.getText();
				FileWriter fw;
				try {
					fw = new FileWriter(file1, true);
					fw.write("��ʦ����"+xingming+"��ʦ�˺�"+zhanghao+"��ʦ����"+mima+"\n");
					fw.close();
					setVisible(false);
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				
			}
		});






	}
}
class chakanjiaoshi extends JFrame{
	public chakanjiaoshi() {
		String xinxi="";
		Container container=getContentPane();
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(new GridLayout(2, 3));
		JButton jb[]=new JButton[6];
		for(int i=0;i<6;i++) {
			jb[i]=new JButton();
			jb[i].setFont(new Font("����", Font.BOLD, 20));
			container.add(jb[i]);
		}
		File file1=new File("��ʦ��Ϣ.txt");
		try {
			FileReader fr=new FileReader(file1);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		int num1=0;
		int num2=0;
		int num3=0;

		for(int i=0;i<6;i++) {
		 num1=xinxi.indexOf("��",num3);
		 if(num1==-1) {
			 break;
		 }
		 num2=xinxi.indexOf("��",num1);
		 num3=xinxi.indexOf("��",num2);
		String name=xinxi.substring(num1+1, num2-3);
		String zhanghao=xinxi.substring(num2+1, num3-3);
		String mima=xinxi.substring(num3+1, xinxi.indexOf("\n",num3));
		String wenben="<html>��ʦ����:"+name+"<br>�˺�:"+zhanghao+"<br>����:"+mima+"</html>";
		jb[i].setText(wenben);
		}
		
		
	}
}
class xiugaishanchu extends JFrame{
	public xiugaishanchu() {
		String xinxi="";
		Container container=getContentPane();
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		container.setLayout(new BorderLayout());
		container.add(jp1,BorderLayout.CENTER);
		container.add(jp2,BorderLayout.SOUTH);
		jp1.setLayout(new GridLayout(2, 3));
		JButton jb[]=new JButton[6];
		for(int i=0;i<6;i++) {
			jb[i]=new JButton();
			jb[i].setFont(new Font("����", Font.BOLD, 20));
			jp1.add(jb[i]);
		}
		File file1=new File("��ʦ��Ϣ.txt");
		try {
			FileReader fr=new FileReader(file1);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		int num1=0;
		int num2=0;
		int num3=0;

		for(int i=0;i<6;i++) {
		 num1=xinxi.indexOf("��",num3);
		 if(num1==-1) {
			 break;
		 }
		 num2=xinxi.indexOf("��",num1);
		 num3=xinxi.indexOf("��",num2);
		String name=xinxi.substring(num1+1, num2-3);
		String zhanghao=xinxi.substring(num2+1, num3-3);
		String mima=xinxi.substring(num3+1, xinxi.indexOf("\n",num3));
		String wenben="<html>��ʦ����:"+name+"<br>�˺�:"+zhanghao+"<br>����:"+mima+"</html>";
		jb[i].setText(wenben);
		}
		JButton jb7=new JButton("�޸��˺�");
		JButton jb8=new JButton("�޸�����");
		JButton jb9=new JButton("ɾ���˺�");
		jp2.add(jb7);
		jp2.add(jb8);
		jp2.add(jb9);
		jb7.setFont(new Font("����", Font.BOLD, 20));
		jb8.setFont(new Font("����", Font.BOLD, 20));
		jb9.setFont(new Font("����", Font.BOLD, 20));
		System.out.println(xinxi);
		String xinxi1=xinxi;
		System.out.println(xinxi1);
		jb7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xinxi="";
				File file1=new File("��ʦ��Ϣ.txt");
				try {
					FileReader fr=new FileReader(file1);
					char linshi[]=new char[1024];
					int hasread=-1;
					while((hasread=fr.read(linshi))!=-1) {
						 xinxi=new String(linshi,0,hasread);
						fr.close();
						break;
					}
				} catch (FileNotFoundException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
				int num5=0;
				int num6=0;
				int num7=0;
				String xingming=JOptionPane.showInputDialog(null,"������Ҫ�޸��˺ŵĽ�ʦ����","�޸��˺�",JOptionPane.PLAIN_MESSAGE);
				num5=xinxi.indexOf(xingming);
				if(num5!=-1) {
				num6=xinxi.indexOf("��",num5);
				num7=xinxi.indexOf("��",num6+1);
				System.out.println(num7);
				String jiu=xinxi.substring(num6+4, num7);
				String zhanghao=JOptionPane.showInputDialog(null,"�������µ��˺�","�޸��˺�",JOptionPane.PLAIN_MESSAGE);
				String xinxi2=xinxi.replaceFirst(jiu, zhanghao);
			
				File file2=new File("��ʦ��Ϣ.txt");
				try {
					FileWriter fr=new FileWriter(file2);
					fr.write(xinxi2);
					fr.close();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
				int num1=0;
				int num2=0;
				int num3=0;
				for(int i=0;i<6;i++) {
					  num1=xinxi2.indexOf("��",num3);
					 if(num1==-1) {
						 break;
					 }
					 num2=xinxi2.indexOf("��",num1);
					  num3=xinxi2.indexOf("��",num2);
					String name=xinxi2.substring(num1+1, num2-3);
					String zhanghao1=xinxi2.substring(num2+1, num3-3);
					String mima=xinxi2.substring(num3+1, xinxi2.indexOf("\n",num3));
					String wenben="<html>��ʦ����:"+name+"<br>�˺�:"+zhanghao1+"<br>����:"+mima+"</html>";
					jb[i].setText(wenben);
					}
				
			}
				else{JOptionPane.showMessageDialog(null, "���޴���");
					}
				}
		});
		
jb8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xinxi="";
				File file1=new File("��ʦ��Ϣ.txt");
				try {
					FileReader fr=new FileReader(file1);
					char linshi[]=new char[1024];
					int hasread=-1;
					while((hasread=fr.read(linshi))!=-1) {
						 xinxi=new String(linshi,0,hasread);
						fr.close();
						break;
					}
				} catch (FileNotFoundException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
				int num5=0;
				int num6=0;
				int num7=0;
				String xingming=JOptionPane.showInputDialog(null,"������Ҫ�޸��˺ŵĽ�ʦ����","�޸�����",JOptionPane.PLAIN_MESSAGE);
				num5=xinxi.indexOf(xingming);
				if(num5!=-1) {
				num6=xinxi.indexOf("��",num5+1);
				num7=xinxi.indexOf("\n",num6+1);
			
				String jiu=xinxi.substring(num6+1, num7);
				String mima=JOptionPane.showInputDialog(null,"�������µ�����","�޸�����",JOptionPane.PLAIN_MESSAGE);
				String xinxi2=xinxi.replaceFirst(jiu, mima);
				File file2=new File("��ʦ��Ϣ.txt");
				try {
					FileWriter fr=new FileWriter(file2);
					fr.write(xinxi2);
					fr.close();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
				int num1=0;
				int num2=0;
				int num3=0;
				for(int i=0;i<6;i++) {
					  num1=xinxi2.indexOf("��",num3);
					 if(num1==-1) {
						 break;
					 }
					 num2=xinxi2.indexOf("��",num1);
					  num3=xinxi2.indexOf("��",num2);
					String name=xinxi2.substring(num1+1, num2-3);
					String zhanghao1=xinxi2.substring(num2+1, num3-3);
					String mima1=xinxi2.substring(num3+1, xinxi2.indexOf("\n",num3));
					String wenben="<html>��ʦ����:"+name+"<br>�˺�:"+zhanghao1+"<br>����:"+mima1+"</html>";
					jb[i].setText(wenben);
					}
				
			}
				else{JOptionPane.showMessageDialog(null, "���޴���");
					}
				}
		});
jb9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String xinxi="";
		File file1=new File("��ʦ��Ϣ.txt");
		try {
			FileReader fr=new FileReader(file1);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		int num5=0;
		int num6=0;
		int num7=0;
		String xingming=JOptionPane.showInputDialog(null,"������Ҫɾ���˺ŵĽ�ʦ����","ɾ���˺�",JOptionPane.PLAIN_MESSAGE);
		num5=xinxi.indexOf(xingming);
		if(num5!=-1) {
		num5=num5-4;
		num7=xinxi.indexOf("\n",num5);
		num7=num7+1;
		String jiu=xinxi.substring(num5, num7);
		
		String xinxi2=xinxi.replaceAll(jiu, "");
		File file2=new File("��ʦ��Ϣ.txt");
		try {
			FileWriter fr=new FileWriter(file2);
			fr.write(xinxi2);
			fr.close();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		int num1=0;
		int num2=0;
		int num3=0;
		System.out.println(xinxi2);
		for(int i=0;i<6;i++) {
			  num1=xinxi2.indexOf("��",num3);
			 if(num1==-1) {
				 jb[i].setText("");
			 }
			 else {
			 num2=xinxi2.indexOf("��",num1);
			  num3=xinxi2.indexOf("��",num2);
			String name=xinxi2.substring(num1+1, num2-3);
			String zhanghao1=xinxi2.substring(num2+1, num3-3);
			String mima1=xinxi2.substring(num3+1, xinxi2.indexOf("\n",num3));
			String wenben="<html>��ʦ����:"+name+"<br>�˺�:"+zhanghao1+"<br>����:"+mima1+"</html>";
			jb[i].setText(wenben);}
			}
		
	}else{JOptionPane.showMessageDialog(null, "���޴���");
		}
	}
});

	}
}
class guanliyuangeren extends JFrame{
	public guanliyuangeren() {
		Container container=getContentPane();
		setBounds(100, 100, 350, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(null);
		JLabel jl1=new JLabel("����Ա������Ϣ");
		JLabel jl2=new JLabel("����Ա����");
		JLabel jl3=new JLabel("�˺�");
		JLabel jl4=new JLabel("����");
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		jl1.setFont(new Font("����", Font.BOLD, 25));
		jl2.setFont(new Font("����", Font.BOLD, 20));
		jl3.setFont(new Font("����", Font.BOLD, 20));
		jl4.setFont(new Font("����", Font.BOLD, 20));

		jl1.setBounds(65, 5, 200, 100);
		jl2.setBounds(55, 55, 200, 100);
		jl3.setBounds(55, 100, 200, 100);
		jl4.setBounds(55, 145, 200, 100);
		
		JLabel jl5=new JLabel("HWW");
		container.add(jl5);
		jl5.setBounds(190, 55, 200, 100);
		jl5.setFont(new Font("����", Font.BOLD, 20));
		File file1=new File("guanliyuanzhanghao.txt");
		String zhanghao="";
		try {
			FileReader fr=new FileReader(file1);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 zhanghao=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		JLabel jl6=new JLabel(zhanghao);
		container.add(jl6);
		jl6.setBounds(190, 100, 200, 100);
		jl6.setFont(new Font("����", Font.BOLD, 20));
		File file2=new File("guanliyuanmima.txt");
		String mima="";
		try {
			FileReader fr=new FileReader(file2);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 mima=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		JLabel jl7=new JLabel(mima);
		container.add(jl7);
		jl7.setBounds(190, 145, 200, 100);
		jl7.setFont(new Font("����", Font.BOLD, 20));
	}
}
class chazhao extends JFrame{
	public chazhao(String name) {
		Container container=getContentPane();
		setBounds(100, 100, 350, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("��ʦ��ϸ��Ϣ");
		container.setLayout(null);
		JLabel jl1=new JLabel("��ʦ��Ϣ��Ϣ");
		JLabel jl2=new JLabel("��ʦ����");
		JLabel jl3=new JLabel("�˺�");
		JLabel jl4=new JLabel("����");
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		jl1.setFont(new Font("����", Font.BOLD, 25));
		jl2.setFont(new Font("����", Font.BOLD, 20));
		jl3.setFont(new Font("����", Font.BOLD, 20));
		jl4.setFont(new Font("����", Font.BOLD, 20));

		jl1.setBounds(65, 5, 200, 100);
		jl2.setBounds(55, 55, 200, 100);
		jl3.setBounds(55, 100, 200, 100);
		jl4.setBounds(55, 145, 200, 100);
		
		JLabel jl5=new JLabel(name);
		container.add(jl5);
		jl5.setBounds(190, 55, 200, 100);
		jl5.setFont(new Font("����", Font.BOLD, 20));
		File file1=new File("��ʦ��Ϣ.txt");
		String xinxi="";
		try {
			FileReader fr=new FileReader(file1);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(name);
		int num2=xinxi.indexOf("��",num1+1);
		int num3=xinxi.indexOf("��",num2+1);
		String zhanghao=xinxi.substring(num2+1, num3);
		JLabel jl6=new JLabel(zhanghao);
		container.add(jl6);
		jl6.setBounds(190, 100, 200, 100);
		jl6.setFont(new Font("����", Font.BOLD, 20));
		
		int num4=xinxi.indexOf("��",num1+1);
		int num5=xinxi.indexOf("\n",num4+1);
		String mima=xinxi.substring(num4+1, num5);
		JLabel jl7=new JLabel(mima);
		container.add(jl7);
		jl7.setBounds(190, 145, 200, 100);
		jl7.setFont(new Font("����", Font.BOLD, 20));
	}
}
class jiaoshigongneng extends JFrame{
	public jiaoshigongneng(String zhanghao) {
		Container container=getContentPane();
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new GridLayout(2, 3));
		JButton jb1=new JButton("�޸ĸ�������");
		JButton jb2=new JButton("<html>¼��ѧ��<br><br>�˺ź�����</html>");
		JButton jb3=new JButton("<html>��ѯ���޸�<br><br>ѧ���ɼ�</html>");
		JButton jb4=new JButton("�鿴������Ϣ");
		JButton jb5=new JButton("<html>¼��ѧ���ɼ�</html>");
		JButton jb6=new JButton("<html>�鿴����<br><br>ѧ���ɼ�</html>");
		container.add(jb1);
		container.add(jb2);
		container.add(jb3);
		container.add(jb4);
		container.add(jb5);
		container.add(jb6);
		jb1.setFont(new Font("����", Font.BOLD, 23));
		jb2.setFont(new Font("����", Font.BOLD, 23));
		jb3.setFont(new Font("����", Font.BOLD, 23));
		jb4.setFont(new Font("����", Font.BOLD, 23));
		jb5.setFont(new Font("����", Font.BOLD, 23));
		jb6.setFont(new Font("����", Font.BOLD, 23));
		File file1=new File("��ʦ��Ϣ.txt");
		String xinxi="";
		try {
			FileReader fr=new FileReader(file1);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(zhanghao);
		int num2=xinxi.lastIndexOf("��",num1);
		int num3=xinxi.indexOf("��",num2);
		int num4=xinxi.indexOf("��",num1);
		int num5=xinxi.indexOf("\n",num4);
		String mima=xinxi.substring(num4+1, num5);
		String name=xinxi.substring(num2+1, num3);
		String xinxi1=xinxi;
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 String xinmima=JOptionPane.showInputDialog(null,"�������µ�����","�޸�����",JOptionPane.PLAIN_MESSAGE);
				String xinxi2=xinxi1.replace(mima, xinmima);
				
				try {
					FileWriter fr=new FileWriter(file1);
					fr.write(xinxi2);
					fr.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		});
		

		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jiaoshigeren a=new jiaoshigeren(name,zhanghao);
				a.setVisible(true);
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xueshengzhanghao a=new xueshengzhanghao();
				a.setVisible(true);
			}
		});
		jb5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chengjiluru a=new chengjiluru();
				a.setVisible(true);
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chaxunxiugai a=new chaxunxiugai();
				a.setVisible(true);
			}
		});
		jb6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chakanquanbu a=new chakanquanbu();
				a.setVisible(true);
			}
		});
	}}
class jiaoshigeren extends JFrame{
	public jiaoshigeren(String name,String zhanghao) {
		Container container=getContentPane();
		setBounds(100, 100, 350, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(null);
		JLabel jl1=new JLabel("��ʦ������Ϣ");
		JLabel jl2=new JLabel("��ʦ����");
		JLabel jl3=new JLabel("�˺�");
		JLabel jl4=new JLabel("����");
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		jl1.setFont(new Font("����", Font.BOLD, 25));
		jl2.setFont(new Font("����", Font.BOLD, 20));
		jl3.setFont(new Font("����", Font.BOLD, 20));
		jl4.setFont(new Font("����", Font.BOLD, 20));

		jl1.setBounds(65, 5, 200, 100);
		jl2.setBounds(55, 55, 200, 100);
		jl3.setBounds(55, 100, 200, 100);
		jl4.setBounds(55, 145, 200, 100);
		
		JLabel jl5=new JLabel(name);
		container.add(jl5);
		jl5.setBounds(190, 55, 200, 100);
		jl5.setFont(new Font("����", Font.BOLD, 20));
		
		JLabel jl6=new JLabel(zhanghao);
		container.add(jl6);
		jl6.setBounds(190, 100, 200, 100);
		jl6.setFont(new Font("����", Font.BOLD, 20));
		
		File file1=new File("��ʦ��Ϣ.txt");
		String xinxi="";
		try {
			FileReader fr=new FileReader(file1);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(zhanghao);
		int num2=xinxi.lastIndexOf("��",num1);
		int num3=xinxi.indexOf("��",num2);
		int num4=xinxi.indexOf("��",num1);
		int num5=xinxi.indexOf("\n",num4);
		String mima=xinxi.substring(num4+1, num5);
	
		
		
		JLabel jl7=new JLabel(mima);
		container.add(jl7);
		jl7.setBounds(190, 145, 200, 100);
		jl7.setFont(new Font("����", Font.BOLD, 20));
	}
}
class xueshengzhanghao extends JFrame{
	public xueshengzhanghao() {
		Container container=getContentPane();
		setBounds(0, 100, 1000, 700);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		File file1=new File("ѧ����Ϣ.txt");
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		File file2=new File("ѧ���ɼ�.txt");
		if(!file2.exists()) {
			try {
				file2.createNewFile();
				String chengjichushi="\tѧ������\tѧ���ɼ�\n";
				FileWriter fw=new FileWriter(file2);
				fw.write(chengjichushi);
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		
		container.setLayout(new BorderLayout());
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		container.add(jp1,BorderLayout.CENTER);
		container.add(jp2,BorderLayout.SOUTH);
		jp1.setLayout(new GridLayout(4, 5));
		JButton jb[]=new JButton[20];
		for(int i=0;i<20;i++){
			jb[i]=new JButton();
			jp1.add(jb[i]);
		}
		JButton jb1=new JButton("ѧ���˺ź�����¼��");
		jp2.add(jb1);
		jb1.setFont(new Font("����", Font.BOLD, 30));
		
		String xinxi="";
		try {
			FileReader fr=new FileReader(file1);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		System.out.println(xinxi);
		int num0=0;
		for(int i=0;i<20;i++) {
			
		
		if(xinxi.indexOf("��",num0)!=-1) {
		int num1=xinxi.indexOf("��",num0);
		int num2=xinxi.indexOf("ѧ",num1+1);
		int num3=xinxi.indexOf("��",num2+1);
		int num4=xinxi.indexOf("ѧ",num3+1);
		int num5=xinxi.indexOf("��",num4+1);
		int num6=xinxi.indexOf("\n",num5+1);
		num0=num6;
		
		String name=xinxi.substring(num1+1, num2);
		String zhanghao=xinxi.substring(num3+1, num4);
		String mima=xinxi.substring(num5+1, num6);
		jb[i].setFont(new Font("����", Font.BOLD, 20));
		jb[i].setText("<html>ѧ������:"+name+"<br>�˺�:"+zhanghao+"<br>����:"+mima+"</html>");}
		}
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jieshang a=new jieshang();
				a.setVisible(true);
				setVisible(false);
			}
		});
		
	}
}
class jieshang extends JFrame{
	jieshang(){
		Container container=getContentPane();
		setBounds(0, 100, 300, 350);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(null);
		JLabel jl1=new JLabel("ѧ����Ϣ¼��");
		JLabel jl2=new JLabel("ѧ������");
		JLabel jl3=new JLabel("ѧ���˺�");
		JLabel jl4=new JLabel("ѧ������");
		
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		
		jl1.setBounds(50, 0, 200, 100);
		jl2.setBounds(15, 55, 100, 100);
		jl3.setBounds(15, 105, 100, 100);
		jl4.setBounds(15, 155, 100, 100);
		
		jl1.setFont(new Font("����", Font.BOLD, 25));
		jl2.setFont(new Font("����", Font.BOLD, 20));
		jl3.setFont(new Font("����", Font.BOLD, 20));
		jl4.setFont(new Font("����", Font.BOLD, 20));

		JTextField jt1=new JTextField();
		JTextField jt2=new JTextField();
		JTextField jt3=new JTextField();

		JButton jb1=new JButton("¼��");
		container.add(jb1);
		jb1.setFont(new Font("����", Font.BOLD, 22));
		jb1.setBounds(80, 240, 100, 40);
		
		container.add(jt1);
		container.add(jt2);
		container.add(jt3);
		
		jt1.setBounds(115, 90, 130, 30);
		jt2.setBounds(115, 140, 130, 30);
		jt3.setBounds(115, 190, 130, 30);
		
		
		File file=new File("ѧ����Ϣ.txt");
		File file2=new File("ѧ���ɼ�.txt");
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=jt1.getText();
				String zhanghao=jt2.getText();
				String mima=jt3.getText();
				FileWriter fr;
				try {
					
					fr = new FileWriter(file,true);
					fr.write("ѧ������"+name+"ѧ���˺�"+zhanghao+"ѧ������"+mima+"\n");
					FileWriter fr2=new FileWriter(file2,true);
					fr2.write("\t"+name+"\t\t\n");
					fr.close();
					fr2.close();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
				setVisible(false);
				xueshengzhanghao a=new xueshengzhanghao();
				a.setVisible(true);
			}
		});

	}
}
class chengjiluru extends JFrame{
	public chengjiluru() {
		Container container=getContentPane();
		setBounds(0, 100, 420, 600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(new BorderLayout());
		JTextArea jt1=new JTextArea();
		JScrollPane js=new JScrollPane(jt1);
		container.add(js,BorderLayout.CENTER);
		JButton jb1=new JButton("ѧ���ɼ�¼��");
		container.add(jb1,BorderLayout.SOUTH);
		jb1.setFont(new Font("����", Font.BOLD, 25));
		jt1.append("\tѧ������\t\t�ɼ�\n\n");
		File file=new File("ѧ���ɼ�.txt");
		String xiangxi="";
		
		try {
			FileReader fr=new FileReader(file);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xiangxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		
		jt1.append(xiangxi);
		jt1.setFont(new Font("����", Font.BOLD, 20));
		jt1.setEditable(false);
		StringBuffer xiangxi1=new StringBuffer(xiangxi);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=JOptionPane.showInputDialog(null,"������ѧ������","�ɼ�¼��",JOptionPane.PLAIN_MESSAGE);
				
				
				int num1=xiangxi1.indexOf(name);
				if(num1!=-1) {
				String chengji=JOptionPane.showInputDialog(null,"������ѧ���ɼ�","�ɼ�¼��",JOptionPane.PLAIN_MESSAGE);
				int num2=xiangxi1.indexOf("\n", num1);
				xiangxi1.insert(num2, chengji);
				String xiangxi2=xiangxi1.toString();
				FileWriter fr;
				try {
					fr = new FileWriter(file);
					fr.write(xiangxi2);
					fr.close();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
				jt1.setText("");
				jt1.append("\tѧ������\t\t�ɼ�\n\n");
				jt1.append(xiangxi2);
			}
				else{JOptionPane.showMessageDialog(null, "û�д�ѧ��");
					}
				}
		});
	}
}
class chaxunxiugai extends JFrame{
	public chaxunxiugai() {
		Container container=getContentPane();
		setBounds(0, 100, 420, 600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(new BorderLayout());
		JTextArea jt1=new JTextArea();
		JScrollPane js=new JScrollPane(jt1);
		container.add(js,BorderLayout.CENTER);
		JButton jb1=new JButton("ѧ���ɼ��޸�");
		container.add(jb1,BorderLayout.SOUTH);
		jb1.setFont(new Font("����", Font.BOLD, 25));
		jt1.append("\tѧ������\t\t�ɼ�\n\n");
		File file=new File("ѧ���ɼ�.txt");
		String xiangxi="";
		
		try {
			FileReader fr=new FileReader(file);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xiangxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		
		jt1.append(xiangxi);
		jt1.setFont(new Font("����", Font.BOLD, 20));
		jt1.setEditable(false);
		StringBuffer xiangxi1=new StringBuffer(xiangxi);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=JOptionPane.showInputDialog(null,"������ѧ������","�ɼ��޸�",JOptionPane.PLAIN_MESSAGE);
				
				
				int num1=xiangxi1.indexOf(name);
				if(num1!=-1) {
				String chengji=JOptionPane.showInputDialog(null,"������ѧ���ɼ�","�ɼ��޸�",JOptionPane.PLAIN_MESSAGE);
				int num2=xiangxi1.indexOf("\n", num1);
				xiangxi1.insert(num2, chengji);
				int num4=xiangxi1.indexOf(chengji, num1+1);
				
				int num3=xiangxi1.lastIndexOf("\t",num4);
				
				xiangxi1.replace(num3, num4,"\t");
				String xiangxi2=xiangxi1.toString();
				FileWriter fr;
				try {
					fr = new FileWriter(file);
					fr.write(xiangxi2);
					fr.close();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
				jt1.setText("");
				jt1.append("\tѧ������\t\t�ɼ�\n\n");
				jt1.append(xiangxi2);
			}
				else{JOptionPane.showMessageDialog(null, "û�д�ѧ��");
					}
				}
		});
	}
}
class chakanquanbu extends JFrame{
	public chakanquanbu() {
		Container container=getContentPane();
		setBounds(0, 100, 420, 600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		container.setLayout(new BorderLayout());
		JTextArea jt1=new JTextArea();
		JScrollPane js=new JScrollPane(jt1);
		container.add(js,BorderLayout.CENTER);
		
		
		
		jt1.append("\tѧ������\t\t�ɼ�\n\n");
		File file=new File("ѧ���ɼ�.txt");
		String xiangxi="";
		
		try {
			FileReader fr=new FileReader(file);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xiangxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		
		jt1.append(xiangxi);
		jt1.setFont(new Font("����", Font.BOLD, 20));
		jt1.setEditable(false);
	}
}
class xueshenggongneng extends JFrame{
	public xueshenggongneng(String zhanghao) {
		Container container=getContentPane();
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new GridLayout(2, 3));
		JButton jb1=new JButton("�޸ĸ�������");
		JButton jb2=new JButton("<html>�鿴����<br><br>��Ϣ�ͳɼ�</html>");
		JButton jb3=new JButton();
		JButton jb4=new JButton();
		JButton jb5=new JButton();
		JButton jb6=new JButton();
		container.add(jb1);
		container.add(jb2);
		container.add(jb3);
		container.add(jb4);
		container.add(jb5);
		container.add(jb6);
		jb1.setFont(new Font("����", Font.BOLD, 23));
		jb2.setFont(new Font("����", Font.BOLD, 23));
		jb3.setFont(new Font("����", Font.BOLD, 23));
		jb4.setFont(new Font("����", Font.BOLD, 23));
		jb5.setFont(new Font("����", Font.BOLD, 23));
		jb6.setFont(new Font("����", Font.BOLD, 23));
		
		File file=new File("ѧ����Ϣ.txt");
		String xinxi="";
		
		try {
			FileReader fr=new FileReader(file);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(zhanghao);
		int num2=xinxi.indexOf("��",num1+1);
		int num3=xinxi.indexOf("\n",num2+1);
		String jiumima=xinxi.substring(num2+1, num3);
		StringBuffer xinxi1=new StringBuffer(xinxi);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xinmima=JOptionPane.showInputDialog(null,"������������","�����޸�",JOptionPane.PLAIN_MESSAGE);
				int num5=xinxi1.indexOf("\n",num2+1);
				xinxi1.replace(num2+1, num5, "");
				int num4=xinxi1.indexOf("\n",num2+1);
				xinxi1.insert(num4, xinmima);
				
				String xinxi2=xinxi1.toString();
				FileWriter fr;
				try {
					fr = new FileWriter(file);
					fr.write(xinxi2);
					fr.close();
				} catch (IOException e1) {
					// TODO �Զ����ɵ� catch ��
					e1.printStackTrace();
				}
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xueshenggeren a=new xueshenggeren(zhanghao);
				a.setVisible(true);
			}
		});
	}
}
class xueshenggeren extends JFrame{
	public xueshenggeren(String zhanghao) {
		Container container=getContentPane();
		setBounds(100, 100, 300, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);;
		container.setLayout(null);
		JLabel jl1=new JLabel("������Ϣ���ɼ�");
		JLabel jl2=new JLabel("����:");
		JLabel jl3=new JLabel("�˺�:");
		JLabel jl4=new JLabel("����:");
		JLabel jl5=new JLabel("�ɼ�:");
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		container.add(jl5);
		
		jl1.setBounds(45, 0, 200, 100);
		jl2.setBounds(50, 60, 100, 100);
		jl3.setBounds(50, 110, 100, 100);
		jl4.setBounds(50,160, 100, 100);
		jl5.setBounds(50, 210, 100, 100);
		
		jl1.setFont(new Font("����", Font.BOLD, 25));
		jl2.setFont(new Font("����", Font.BOLD, 20));
		jl3.setFont(new Font("����", Font.BOLD, 20));
		jl4.setFont(new Font("����", Font.BOLD, 20));
		jl5.setFont(new Font("����", Font.BOLD, 20));

		File file=new File("ѧ����Ϣ.txt");
		String xinxi="";
		
		try {
			FileReader fr=new FileReader(file);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(zhanghao);
		int num2=xinxi.lastIndexOf("��", num1);
		int num3=xinxi.indexOf("ѧ",num2+1);
		int num4=xinxi.indexOf("��",num1+1);
		int num5=xinxi.indexOf("\n",num4+1);
		String name=xinxi.substring(num2+1, num3);
		String mima=xinxi.substring(num4+1, num5);
		JLabel jl6=new JLabel(name);
		JLabel jl7=new JLabel(zhanghao);
		JLabel jl8=new JLabel(mima);
		container.add(jl6);
		container.add(jl7);
		container.add(jl8);
		
		
		jl6.setBounds(110, 60, 200, 100);
		jl7.setBounds(110, 110, 100, 100);
		jl8.setBounds(110, 160, 100, 100);
		
		
		jl6.setFont(new Font("����", Font.BOLD, 25));
		jl7.setFont(new Font("����", Font.BOLD, 20));
		jl8.setFont(new Font("����", Font.BOLD, 20));
		
		File file2=new File("ѧ���ɼ�.txt");
		String xinxi2="";
		
		try {
			FileReader fr=new FileReader(file2);
			char linshi[]=new char[1024];
			int hasread=-1;
			while((hasread=fr.read(linshi))!=-1) {
				 xinxi2=new String(linshi,0,hasread);
				fr.close();
				break;
			}
		} catch (FileNotFoundException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
		int num6=xinxi2.indexOf(name);
		int num7=xinxi2.indexOf("\n",num6);
		int num8=xinxi2.lastIndexOf("\t", num7);
		String chengji1=xinxi2.substring(num8, num7);
		chengji1.replace("\t", "");
		
		JLabel jl9=new JLabel(chengji1);
		
		container.add(jl9);
		jl9.setBounds(110, 210, 100, 100);
		jl9.setFont(new Font("����", Font.BOLD, 20));
		
	}
}