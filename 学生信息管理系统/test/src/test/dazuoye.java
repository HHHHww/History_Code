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
				// TODO 自动生成的 catch 块
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
				// TODO 自动生成的 catch 块
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
		JLabel jl1=new JLabel("用户登录");
		jl1.setFont(new Font("宋体",Font.BOLD, 25));
		
		jp1.setLayout(new BorderLayout());
		jp1.add(jl1,BorderLayout.CENTER);
		jl1.setBorder(BorderFactory.createEmptyBorder(25, 135, 0, 0));
		jp2.setLayout(null);
		
		
		
		JLabel jl2=new JLabel("账号");
		JLabel jl3=new JLabel("密码");
		

		jp2.add(jl2);
		jp2.add(jl3);
		
		JTextField jt1=new JTextField(20);
		JPasswordField jpass=new JPasswordField();
		jp2.add(jt1);
		jp2.add(jpass);
		jl2.setBounds(60, 10, 50, 50);
		jl3.setBounds(60, 60, 50, 50);
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jt1.setBounds(115, 20, 200, 30);
		jpass.setBounds(115, 70, 200, 30);
		JRadioButton jr1=new JRadioButton("管理员");
		JRadioButton jr2=new JRadioButton("教师");
		JRadioButton jr3=new JRadioButton("学生");
		jr1.setFont(new Font("宋体", Font.BOLD, 15));
		jr2.setFont(new Font("宋体", Font.BOLD, 15));
		jr3.setFont(new Font("宋体", Font.BOLD, 15));
		

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
		JButton jb1=new JButton("登录");
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
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
						JOptionPane.showMessageDialog(null,"账号或密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);
					}
				}
					else{
						JOptionPane.showMessageDialog(null,"账号或密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);	}
					}
				
				if(jr2.isSelected()) {
					File file1=new File("教师信息.txt");
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
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					int num1=xinxi.indexOf(zhanghao2);
					
					if(num1==-1) {
						JOptionPane.showMessageDialog(null,"账号或密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);
					}
					else {
						int num2=xinxi.indexOf("码",num1+1);
						int num3=xinxi.indexOf("\n",num2+1);
						String mima4=xinxi.substring(num2+1, num3);
						if(mima4.equals(mima2)) {
							jiaoshigongneng aa=new jiaoshigongneng(zhanghao2);
							aa.setVisible(true);
							setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(null,"账号或密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);
						}
					}
				}
				if(jr3.isSelected()) {
					File file1=new File("学生信息.txt");
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
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
					int num1=xinxi.indexOf(zhanghao2);
					
					if(num1==-1) {
						JOptionPane.showMessageDialog(null,"账号或密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);
					}
					else {
						int num2=xinxi.indexOf("码",num1+1);
						int num3=xinxi.indexOf("\n",num2+1);
						String mima4=xinxi.substring(num2+1, num3);
						if(mima4.equals(mima2)) {
							xueshenggongneng aa=new xueshenggongneng(zhanghao2);
							aa.setVisible(true);
							setVisible(false);
						}
						else {
							JOptionPane.showMessageDialog(null,"账号或密码错误","登陆失败",JOptionPane.WARNING_MESSAGE);
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
		JButton jb1=new JButton("修改密码");
		JButton jb2=new JButton("<html>录入教师<br><br>账号和密码</html>");
		JButton jb3=new JButton("<html>修改或删除<br><br>教师信息</html>");
		JButton jb4=new JButton("查看个人信息");
		JButton jb5=new JButton("<html>查看所有教师<br><br>账号信息</html>");
		JButton jb6=new JButton("<html>按姓名查找<br><br>某个教师信息</html>");
		container.add(jb1);
		container.add(jb2);
		container.add(jb3);
		container.add(jb4);
		container.add(jb5);
		container.add(jb6);
		jb1.setFont(new Font("宋体", Font.BOLD, 23));
		jb2.setFont(new Font("宋体", Font.BOLD, 23));
		jb3.setFont(new Font("宋体", Font.BOLD, 23));
		jb4.setFont(new Font("宋体", Font.BOLD, 23));
		jb5.setFont(new Font("宋体", Font.BOLD, 23));
		jb6.setFont(new Font("宋体", Font.BOLD, 23));
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xinmima=JOptionPane.showInputDialog(null,"请输入新密码","修改密码",JOptionPane.PLAIN_MESSAGE);
				File file1=new File("guanliyuanmima.txt");
				try {
					FileWriter fw=new FileWriter(file1);
					fw.write(xinmima);
					fw.close();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
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
		String name=JOptionPane.showInputDialog(null,"请输入要查找的教师姓名","信息查找",JOptionPane.PLAIN_MESSAGE);
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
		JLabel jl1=new JLabel("教师姓名");
		JLabel jl2=new JLabel("教师账号");
		JLabel jl3=new JLabel("教师密码");
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
		jl1.setFont(new Font("宋体", Font.BOLD, 20));
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		JLabel jl4=new JLabel("教师信息录入");
		container.add(jl4);
		jl4.setBounds(80, -10, 200, 100);
		jl4.setFont(new Font("宋体", Font.BOLD, 30));
		JButton jb1=new JButton("录 入");
		container.add(jb1);
		jb1.setBounds(105, 225, 120, 35);
		jb1.setFont(new Font("宋体", Font.BOLD, 20));
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String xingming=jt1.getText();
				File file1=new File("教师信息.txt");
				if(!file1.exists()) {
					try {
						file1.createNewFile();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				String zhanghao=jt2.getText();
				String mima=jt3.getText();
				FileWriter fw;
				try {
					fw = new FileWriter(file1, true);
					fw.write("教师姓名"+xingming+"教师账号"+zhanghao+"教师密码"+mima+"\n");
					fw.close();
					setVisible(false);
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
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
			jb[i].setFont(new Font("宋体", Font.BOLD, 20));
			container.add(jb[i]);
		}
		File file1=new File("教师信息.txt");
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		int num1=0;
		int num2=0;
		int num3=0;

		for(int i=0;i<6;i++) {
		 num1=xinxi.indexOf("名",num3);
		 if(num1==-1) {
			 break;
		 }
		 num2=xinxi.indexOf("号",num1);
		 num3=xinxi.indexOf("码",num2);
		String name=xinxi.substring(num1+1, num2-3);
		String zhanghao=xinxi.substring(num2+1, num3-3);
		String mima=xinxi.substring(num3+1, xinxi.indexOf("\n",num3));
		String wenben="<html>教师姓名:"+name+"<br>账号:"+zhanghao+"<br>密码:"+mima+"</html>";
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
			jb[i].setFont(new Font("宋体", Font.BOLD, 20));
			jp1.add(jb[i]);
		}
		File file1=new File("教师信息.txt");
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		int num1=0;
		int num2=0;
		int num3=0;

		for(int i=0;i<6;i++) {
		 num1=xinxi.indexOf("名",num3);
		 if(num1==-1) {
			 break;
		 }
		 num2=xinxi.indexOf("号",num1);
		 num3=xinxi.indexOf("码",num2);
		String name=xinxi.substring(num1+1, num2-3);
		String zhanghao=xinxi.substring(num2+1, num3-3);
		String mima=xinxi.substring(num3+1, xinxi.indexOf("\n",num3));
		String wenben="<html>教师姓名:"+name+"<br>账号:"+zhanghao+"<br>密码:"+mima+"</html>";
		jb[i].setText(wenben);
		}
		JButton jb7=new JButton("修改账号");
		JButton jb8=new JButton("修改密码");
		JButton jb9=new JButton("删除账号");
		jp2.add(jb7);
		jp2.add(jb8);
		jp2.add(jb9);
		jb7.setFont(new Font("宋体", Font.BOLD, 20));
		jb8.setFont(new Font("宋体", Font.BOLD, 20));
		jb9.setFont(new Font("宋体", Font.BOLD, 20));
		System.out.println(xinxi);
		String xinxi1=xinxi;
		System.out.println(xinxi1);
		jb7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xinxi="";
				File file1=new File("教师信息.txt");
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
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				int num5=0;
				int num6=0;
				int num7=0;
				String xingming=JOptionPane.showInputDialog(null,"请输入要修改账号的教师姓名","修改账号",JOptionPane.PLAIN_MESSAGE);
				num5=xinxi.indexOf(xingming);
				if(num5!=-1) {
				num6=xinxi.indexOf("教",num5);
				num7=xinxi.indexOf("教",num6+1);
				System.out.println(num7);
				String jiu=xinxi.substring(num6+4, num7);
				String zhanghao=JOptionPane.showInputDialog(null,"请输入新的账号","修改账号",JOptionPane.PLAIN_MESSAGE);
				String xinxi2=xinxi.replaceFirst(jiu, zhanghao);
			
				File file2=new File("教师信息.txt");
				try {
					FileWriter fr=new FileWriter(file2);
					fr.write(xinxi2);
					fr.close();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				int num1=0;
				int num2=0;
				int num3=0;
				for(int i=0;i<6;i++) {
					  num1=xinxi2.indexOf("名",num3);
					 if(num1==-1) {
						 break;
					 }
					 num2=xinxi2.indexOf("号",num1);
					  num3=xinxi2.indexOf("码",num2);
					String name=xinxi2.substring(num1+1, num2-3);
					String zhanghao1=xinxi2.substring(num2+1, num3-3);
					String mima=xinxi2.substring(num3+1, xinxi2.indexOf("\n",num3));
					String wenben="<html>教师姓名:"+name+"<br>账号:"+zhanghao1+"<br>密码:"+mima+"</html>";
					jb[i].setText(wenben);
					}
				
			}
				else{JOptionPane.showMessageDialog(null, "查无此人");
					}
				}
		});
		
jb8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xinxi="";
				File file1=new File("教师信息.txt");
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
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				int num5=0;
				int num6=0;
				int num7=0;
				String xingming=JOptionPane.showInputDialog(null,"请输入要修改账号的教师姓名","修改密码",JOptionPane.PLAIN_MESSAGE);
				num5=xinxi.indexOf(xingming);
				if(num5!=-1) {
				num6=xinxi.indexOf("码",num5+1);
				num7=xinxi.indexOf("\n",num6+1);
			
				String jiu=xinxi.substring(num6+1, num7);
				String mima=JOptionPane.showInputDialog(null,"请输入新的密码","修改密码",JOptionPane.PLAIN_MESSAGE);
				String xinxi2=xinxi.replaceFirst(jiu, mima);
				File file2=new File("教师信息.txt");
				try {
					FileWriter fr=new FileWriter(file2);
					fr.write(xinxi2);
					fr.close();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				int num1=0;
				int num2=0;
				int num3=0;
				for(int i=0;i<6;i++) {
					  num1=xinxi2.indexOf("名",num3);
					 if(num1==-1) {
						 break;
					 }
					 num2=xinxi2.indexOf("号",num1);
					  num3=xinxi2.indexOf("码",num2);
					String name=xinxi2.substring(num1+1, num2-3);
					String zhanghao1=xinxi2.substring(num2+1, num3-3);
					String mima1=xinxi2.substring(num3+1, xinxi2.indexOf("\n",num3));
					String wenben="<html>教师姓名:"+name+"<br>账号:"+zhanghao1+"<br>密码:"+mima1+"</html>";
					jb[i].setText(wenben);
					}
				
			}
				else{JOptionPane.showMessageDialog(null, "查无此人");
					}
				}
		});
jb9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String xinxi="";
		File file1=new File("教师信息.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		int num5=0;
		int num6=0;
		int num7=0;
		String xingming=JOptionPane.showInputDialog(null,"请输入要删除账号的教师姓名","删除账号",JOptionPane.PLAIN_MESSAGE);
		num5=xinxi.indexOf(xingming);
		if(num5!=-1) {
		num5=num5-4;
		num7=xinxi.indexOf("\n",num5);
		num7=num7+1;
		String jiu=xinxi.substring(num5, num7);
		
		String xinxi2=xinxi.replaceAll(jiu, "");
		File file2=new File("教师信息.txt");
		try {
			FileWriter fr=new FileWriter(file2);
			fr.write(xinxi2);
			fr.close();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		int num1=0;
		int num2=0;
		int num3=0;
		System.out.println(xinxi2);
		for(int i=0;i<6;i++) {
			  num1=xinxi2.indexOf("名",num3);
			 if(num1==-1) {
				 jb[i].setText("");
			 }
			 else {
			 num2=xinxi2.indexOf("号",num1);
			  num3=xinxi2.indexOf("码",num2);
			String name=xinxi2.substring(num1+1, num2-3);
			String zhanghao1=xinxi2.substring(num2+1, num3-3);
			String mima1=xinxi2.substring(num3+1, xinxi2.indexOf("\n",num3));
			String wenben="<html>教师姓名:"+name+"<br>账号:"+zhanghao1+"<br>密码:"+mima1+"</html>";
			jb[i].setText(wenben);}
			}
		
	}else{JOptionPane.showMessageDialog(null, "查无此人");
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
		JLabel jl1=new JLabel("管理员个人信息");
		JLabel jl2=new JLabel("管理员姓名");
		JLabel jl3=new JLabel("账号");
		JLabel jl4=new JLabel("密码");
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		jl1.setFont(new Font("宋体", Font.BOLD, 25));
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jl4.setFont(new Font("宋体", Font.BOLD, 20));

		jl1.setBounds(65, 5, 200, 100);
		jl2.setBounds(55, 55, 200, 100);
		jl3.setBounds(55, 100, 200, 100);
		jl4.setBounds(55, 145, 200, 100);
		
		JLabel jl5=new JLabel("HWW");
		container.add(jl5);
		jl5.setBounds(190, 55, 200, 100);
		jl5.setFont(new Font("宋体", Font.BOLD, 20));
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		JLabel jl6=new JLabel(zhanghao);
		container.add(jl6);
		jl6.setBounds(190, 100, 200, 100);
		jl6.setFont(new Font("宋体", Font.BOLD, 20));
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		JLabel jl7=new JLabel(mima);
		container.add(jl7);
		jl7.setBounds(190, 145, 200, 100);
		jl7.setFont(new Font("宋体", Font.BOLD, 20));
	}
}
class chazhao extends JFrame{
	public chazhao(String name) {
		Container container=getContentPane();
		setBounds(100, 100, 350, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("教师详细信息");
		container.setLayout(null);
		JLabel jl1=new JLabel("教师信息信息");
		JLabel jl2=new JLabel("教师姓名");
		JLabel jl3=new JLabel("账号");
		JLabel jl4=new JLabel("密码");
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		jl1.setFont(new Font("宋体", Font.BOLD, 25));
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jl4.setFont(new Font("宋体", Font.BOLD, 20));

		jl1.setBounds(65, 5, 200, 100);
		jl2.setBounds(55, 55, 200, 100);
		jl3.setBounds(55, 100, 200, 100);
		jl4.setBounds(55, 145, 200, 100);
		
		JLabel jl5=new JLabel(name);
		container.add(jl5);
		jl5.setBounds(190, 55, 200, 100);
		jl5.setFont(new Font("宋体", Font.BOLD, 20));
		File file1=new File("教师信息.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(name);
		int num2=xinxi.indexOf("号",num1+1);
		int num3=xinxi.indexOf("教",num2+1);
		String zhanghao=xinxi.substring(num2+1, num3);
		JLabel jl6=new JLabel(zhanghao);
		container.add(jl6);
		jl6.setBounds(190, 100, 200, 100);
		jl6.setFont(new Font("宋体", Font.BOLD, 20));
		
		int num4=xinxi.indexOf("码",num1+1);
		int num5=xinxi.indexOf("\n",num4+1);
		String mima=xinxi.substring(num4+1, num5);
		JLabel jl7=new JLabel(mima);
		container.add(jl7);
		jl7.setBounds(190, 145, 200, 100);
		jl7.setFont(new Font("宋体", Font.BOLD, 20));
	}
}
class jiaoshigongneng extends JFrame{
	public jiaoshigongneng(String zhanghao) {
		Container container=getContentPane();
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new GridLayout(2, 3));
		JButton jb1=new JButton("修改个人密码");
		JButton jb2=new JButton("<html>录入学生<br><br>账号和密码</html>");
		JButton jb3=new JButton("<html>查询或修改<br><br>学生成绩</html>");
		JButton jb4=new JButton("查看个人信息");
		JButton jb5=new JButton("<html>录入学生成绩</html>");
		JButton jb6=new JButton("<html>查看所有<br><br>学生成绩</html>");
		container.add(jb1);
		container.add(jb2);
		container.add(jb3);
		container.add(jb4);
		container.add(jb5);
		container.add(jb6);
		jb1.setFont(new Font("宋体", Font.BOLD, 23));
		jb2.setFont(new Font("宋体", Font.BOLD, 23));
		jb3.setFont(new Font("宋体", Font.BOLD, 23));
		jb4.setFont(new Font("宋体", Font.BOLD, 23));
		jb5.setFont(new Font("宋体", Font.BOLD, 23));
		jb6.setFont(new Font("宋体", Font.BOLD, 23));
		File file1=new File("教师信息.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(zhanghao);
		int num2=xinxi.lastIndexOf("名",num1);
		int num3=xinxi.indexOf("教",num2);
		int num4=xinxi.indexOf("码",num1);
		int num5=xinxi.indexOf("\n",num4);
		String mima=xinxi.substring(num4+1, num5);
		String name=xinxi.substring(num2+1, num3);
		String xinxi1=xinxi;
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 String xinmima=JOptionPane.showInputDialog(null,"请输入新的密码","修改密码",JOptionPane.PLAIN_MESSAGE);
				String xinxi2=xinxi1.replace(mima, xinmima);
				
				try {
					FileWriter fr=new FileWriter(file1);
					fr.write(xinxi2);
					fr.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
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
		JLabel jl1=new JLabel("教师个人信息");
		JLabel jl2=new JLabel("教师姓名");
		JLabel jl3=new JLabel("账号");
		JLabel jl4=new JLabel("密码");
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		jl1.setFont(new Font("宋体", Font.BOLD, 25));
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jl4.setFont(new Font("宋体", Font.BOLD, 20));

		jl1.setBounds(65, 5, 200, 100);
		jl2.setBounds(55, 55, 200, 100);
		jl3.setBounds(55, 100, 200, 100);
		jl4.setBounds(55, 145, 200, 100);
		
		JLabel jl5=new JLabel(name);
		container.add(jl5);
		jl5.setBounds(190, 55, 200, 100);
		jl5.setFont(new Font("宋体", Font.BOLD, 20));
		
		JLabel jl6=new JLabel(zhanghao);
		container.add(jl6);
		jl6.setBounds(190, 100, 200, 100);
		jl6.setFont(new Font("宋体", Font.BOLD, 20));
		
		File file1=new File("教师信息.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(zhanghao);
		int num2=xinxi.lastIndexOf("名",num1);
		int num3=xinxi.indexOf("教",num2);
		int num4=xinxi.indexOf("码",num1);
		int num5=xinxi.indexOf("\n",num4);
		String mima=xinxi.substring(num4+1, num5);
	
		
		
		JLabel jl7=new JLabel(mima);
		container.add(jl7);
		jl7.setBounds(190, 145, 200, 100);
		jl7.setFont(new Font("宋体", Font.BOLD, 20));
	}
}
class xueshengzhanghao extends JFrame{
	public xueshengzhanghao() {
		Container container=getContentPane();
		setBounds(0, 100, 1000, 700);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		File file1=new File("学生信息.txt");
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		File file2=new File("学生成绩.txt");
		if(!file2.exists()) {
			try {
				file2.createNewFile();
				String chengjichushi="\t学生姓名\t学生成绩\n";
				FileWriter fw=new FileWriter(file2);
				fw.write(chengjichushi);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
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
		JButton jb1=new JButton("学生账号和密码录入");
		jp2.add(jb1);
		jb1.setFont(new Font("宋体", Font.BOLD, 30));
		
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		System.out.println(xinxi);
		int num0=0;
		for(int i=0;i<20;i++) {
			
		
		if(xinxi.indexOf("名",num0)!=-1) {
		int num1=xinxi.indexOf("名",num0);
		int num2=xinxi.indexOf("学",num1+1);
		int num3=xinxi.indexOf("号",num2+1);
		int num4=xinxi.indexOf("学",num3+1);
		int num5=xinxi.indexOf("码",num4+1);
		int num6=xinxi.indexOf("\n",num5+1);
		num0=num6;
		
		String name=xinxi.substring(num1+1, num2);
		String zhanghao=xinxi.substring(num3+1, num4);
		String mima=xinxi.substring(num5+1, num6);
		jb[i].setFont(new Font("宋体", Font.BOLD, 20));
		jb[i].setText("<html>学生姓名:"+name+"<br>账号:"+zhanghao+"<br>密码:"+mima+"</html>");}
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
		JLabel jl1=new JLabel("学生信息录入");
		JLabel jl2=new JLabel("学生姓名");
		JLabel jl3=new JLabel("学生账号");
		JLabel jl4=new JLabel("学生密码");
		
		container.add(jl1);
		container.add(jl2);
		container.add(jl3);
		container.add(jl4);
		
		jl1.setBounds(50, 0, 200, 100);
		jl2.setBounds(15, 55, 100, 100);
		jl3.setBounds(15, 105, 100, 100);
		jl4.setBounds(15, 155, 100, 100);
		
		jl1.setFont(new Font("宋体", Font.BOLD, 25));
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jl4.setFont(new Font("宋体", Font.BOLD, 20));

		JTextField jt1=new JTextField();
		JTextField jt2=new JTextField();
		JTextField jt3=new JTextField();

		JButton jb1=new JButton("录入");
		container.add(jb1);
		jb1.setFont(new Font("宋体", Font.BOLD, 22));
		jb1.setBounds(80, 240, 100, 40);
		
		container.add(jt1);
		container.add(jt2);
		container.add(jt3);
		
		jt1.setBounds(115, 90, 130, 30);
		jt2.setBounds(115, 140, 130, 30);
		jt3.setBounds(115, 190, 130, 30);
		
		
		File file=new File("学生信息.txt");
		File file2=new File("学生成绩.txt");
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=jt1.getText();
				String zhanghao=jt2.getText();
				String mima=jt3.getText();
				FileWriter fr;
				try {
					
					fr = new FileWriter(file,true);
					fr.write("学生姓名"+name+"学生账号"+zhanghao+"学生密码"+mima+"\n");
					FileWriter fr2=new FileWriter(file2,true);
					fr2.write("\t"+name+"\t\t\n");
					fr.close();
					fr2.close();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
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
		JButton jb1=new JButton("学生成绩录入");
		container.add(jb1,BorderLayout.SOUTH);
		jb1.setFont(new Font("宋体", Font.BOLD, 25));
		jt1.append("\t学生姓名\t\t成绩\n\n");
		File file=new File("学生成绩.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		
		jt1.append(xiangxi);
		jt1.setFont(new Font("宋体", Font.BOLD, 20));
		jt1.setEditable(false);
		StringBuffer xiangxi1=new StringBuffer(xiangxi);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=JOptionPane.showInputDialog(null,"请输入学生姓名","成绩录入",JOptionPane.PLAIN_MESSAGE);
				
				
				int num1=xiangxi1.indexOf(name);
				if(num1!=-1) {
				String chengji=JOptionPane.showInputDialog(null,"请输入学生成绩","成绩录入",JOptionPane.PLAIN_MESSAGE);
				int num2=xiangxi1.indexOf("\n", num1);
				xiangxi1.insert(num2, chengji);
				String xiangxi2=xiangxi1.toString();
				FileWriter fr;
				try {
					fr = new FileWriter(file);
					fr.write(xiangxi2);
					fr.close();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				jt1.setText("");
				jt1.append("\t学生姓名\t\t成绩\n\n");
				jt1.append(xiangxi2);
			}
				else{JOptionPane.showMessageDialog(null, "没有此学生");
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
		JButton jb1=new JButton("学生成绩修改");
		container.add(jb1,BorderLayout.SOUTH);
		jb1.setFont(new Font("宋体", Font.BOLD, 25));
		jt1.append("\t学生姓名\t\t成绩\n\n");
		File file=new File("学生成绩.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		
		jt1.append(xiangxi);
		jt1.setFont(new Font("宋体", Font.BOLD, 20));
		jt1.setEditable(false);
		StringBuffer xiangxi1=new StringBuffer(xiangxi);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=JOptionPane.showInputDialog(null,"请输入学生姓名","成绩修改",JOptionPane.PLAIN_MESSAGE);
				
				
				int num1=xiangxi1.indexOf(name);
				if(num1!=-1) {
				String chengji=JOptionPane.showInputDialog(null,"请输入学生成绩","成绩修改",JOptionPane.PLAIN_MESSAGE);
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
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}
				jt1.setText("");
				jt1.append("\t学生姓名\t\t成绩\n\n");
				jt1.append(xiangxi2);
			}
				else{JOptionPane.showMessageDialog(null, "没有此学生");
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
		
		
		
		jt1.append("\t学生姓名\t\t成绩\n\n");
		File file=new File("学生成绩.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		
		jt1.append(xiangxi);
		jt1.setFont(new Font("宋体", Font.BOLD, 20));
		jt1.setEditable(false);
	}
}
class xueshenggongneng extends JFrame{
	public xueshenggongneng(String zhanghao) {
		Container container=getContentPane();
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		container.setLayout(new GridLayout(2, 3));
		JButton jb1=new JButton("修改个人密码");
		JButton jb2=new JButton("<html>查看个人<br><br>信息和成绩</html>");
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
		jb1.setFont(new Font("宋体", Font.BOLD, 23));
		jb2.setFont(new Font("宋体", Font.BOLD, 23));
		jb3.setFont(new Font("宋体", Font.BOLD, 23));
		jb4.setFont(new Font("宋体", Font.BOLD, 23));
		jb5.setFont(new Font("宋体", Font.BOLD, 23));
		jb6.setFont(new Font("宋体", Font.BOLD, 23));
		
		File file=new File("学生信息.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(zhanghao);
		int num2=xinxi.indexOf("码",num1+1);
		int num3=xinxi.indexOf("\n",num2+1);
		String jiumima=xinxi.substring(num2+1, num3);
		StringBuffer xinxi1=new StringBuffer(xinxi);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String xinmima=JOptionPane.showInputDialog(null,"请输入新密码","密码修改",JOptionPane.PLAIN_MESSAGE);
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
					// TODO 自动生成的 catch 块
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
		JLabel jl1=new JLabel("个人信息及成绩");
		JLabel jl2=new JLabel("姓名:");
		JLabel jl3=new JLabel("账号:");
		JLabel jl4=new JLabel("密码:");
		JLabel jl5=new JLabel("成绩:");
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
		
		jl1.setFont(new Font("宋体", Font.BOLD, 25));
		jl2.setFont(new Font("宋体", Font.BOLD, 20));
		jl3.setFont(new Font("宋体", Font.BOLD, 20));
		jl4.setFont(new Font("宋体", Font.BOLD, 20));
		jl5.setFont(new Font("宋体", Font.BOLD, 20));

		File file=new File("学生信息.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
		int num1=xinxi.indexOf(zhanghao);
		int num2=xinxi.lastIndexOf("名", num1);
		int num3=xinxi.indexOf("学",num2+1);
		int num4=xinxi.indexOf("码",num1+1);
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
		
		
		jl6.setFont(new Font("宋体", Font.BOLD, 25));
		jl7.setFont(new Font("宋体", Font.BOLD, 20));
		jl8.setFont(new Font("宋体", Font.BOLD, 20));
		
		File file2=new File("学生成绩.txt");
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
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
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
		jl9.setFont(new Font("宋体", Font.BOLD, 20));
		
	}
}