import javax.swing.*;
import java.awt.*;//maneja el formato de la ventana
import java.awt.event.*;//maneja los eventos de la ventana

public class Interface extends JFrame implements ActionListener{
	
	private JLabel jlbl_a,jlbl_b,jlbl_c;
	private JTextField jtxt_ladoa,jtxt_ladob,jtxt_ladoc;
	private JButton jbt_boton1,jbt_boton2;
	
	
	public Interface (){
		super("Ventana");
		this.setLayout(null);
		this.definirComponentes();
		this.ajustarComponentes();
		this.setResizable(false);//para que el usuario no pueda modificar el tamaño de la ventana
		this.setLocationRelativeTo(null);//pra que la ventana aparezca centrada
		this.setBounds(300,150,400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//esto es para que cuando se cierra la ventana se desocupe a la memoria de la computadora
		this.setVisible(true);
	
	}
	public void definirComponentes(){
		
		//this.setLayout(new FlowLayout());//es una forma de ordenar componentes
		jbt_boton1=new JButton("comprobar");
		jbt_boton2=new JButton("actualizar");
		
		jtxt_ladoa=new JTextField();
		jtxt_ladob=new JTextField();
		jtxt_ladoc=new JTextField();
		
		jlbl_a=new JLabel();
		jlbl_b=new JLabel();
		jlbl_c=new JLabel();

		this.add(jlbl_a);
		this.add(jlbl_b);
		this.add(jlbl_c);
		
		this.add(jtxt_ladoa);
		this.add(jtxt_ladob);
		this.add(jtxt_ladoc);
		
		this.add(jbt_boton1);
		this.add(jbt_boton2);
		jbt_boton1.addActionListener(this);//escucha los eventos de mi boton1
		jbt_boton2.addActionListener(this);
	}
	private void ajustarComponentes(){
		jlbl_a.setText("lado a:");
		jlbl_b.setText("lado b:");
		jlbl_c.setText("lado c:");
		
		jlbl_a.setBounds(10, 20, 120, 25);
		jlbl_b.setBounds(10, 50, 120, 25);
		jlbl_c.setBounds(10, 80, 120, 25);
		
		jtxt_ladoa.setBounds(80,20,100,25);
		jtxt_ladob.setBounds(80,50,100,25);
		jtxt_ladoc.setBounds(80,80,100,25);
		
		jbt_boton1.setBounds(10,150,120,25);
		jbt_boton2.setBounds(10,180,120,25);
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jbt_boton1){//llamo a get source la fuente de donde se produjo el evento si se coincide con el boton es por que se hizo click en el boton1
			int cont=0;
			int aux=0;
			int a,b,c;
			a = Integer.parseInt(jtxt_ladoa.getText());
			b = Integer.parseInt(jtxt_ladob.getText());
			c = Integer.parseInt(jtxt_ladoc.getText());
			if(a!=0 || b!=0 ||c!=0){
				if((b+c)>=a && (a+c)>=b && (b+a)>=c)
					aux=1;
				if(a==b && c==b)
					aux=1;
				if(aux==1){
					if(a==b)
						cont++;
					if (a==c)
						cont++;
					if(b==c)
						cont++;
					if(cont==1)
						JOptionPane.showMessageDialog(null, "triangulo isosceles" );
					if(cont==3)
						JOptionPane.showMessageDialog(null, "triangulo equilatero" );
					if(cont==0)
						JOptionPane.showMessageDialog(null, "triangulo escaleno" );
				}else
					JOptionPane.showMessageDialog(null, "Los datos no componen un triangulo" );
			}else
				JOptionPane.showMessageDialog(null,"Los datos no componen un triangulo");
				
			
		}
		else if(e.getSource()==jbt_boton2){
			jtxt_ladoa.setText("");
			jtxt_ladob.setText("");
			jtxt_ladoc.setText("");
			
		}
		
		
		
	}
	public static void main(String arg[]){
		Interface i=new Interface();
	}
	
	

}
