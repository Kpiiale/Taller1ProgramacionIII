import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FormularioCine {
    private JPanel principal;
    private JComboBox cboNombrePelicula;
    private JButton btnComprar;
    private JTextArea txtEntrada;
    private JLabel txtAutor;
    private JTextField txtNumeroEntradas;
    private JLabel lblPelicula1;
    private JLabel lblPelicula2;
    private JLabel lblPelicula3;
    private Cine peliculas=new Cine();

    private int contador1=0;
    private int contador2 = 0;
    private int contador3 = 0;
    private int v1=22;
    private int v2=22;
    private int v3=22;
    public FormularioCine(JPanel principal, JComboBox cboNombrePelicula, JButton btnComprar, JTextArea txtEntrada, JLabel txtAutor, JTextField txtNumeroEntradas, JLabel lblPelicula1, JLabel lblPelicula2, JLabel lblPelicula3) {
        this.principal = principal;
        this.cboNombrePelicula = cboNombrePelicula;
        this.btnComprar = btnComprar;
        this.txtEntrada = txtEntrada;
        this.txtAutor = txtAutor;
        this.txtNumeroEntradas = txtNumeroEntradas;
        this.lblPelicula1 = lblPelicula1;
        this.lblPelicula2 = lblPelicula2;
        this.lblPelicula3 = lblPelicula3;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormularioCine");
        frame.setContentPane(new FormularioCine().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public FormularioCine() {
        //No borre ni intente entender este código.
        try {
            String a="",b="";
            do {
                b= JOptionPane.showInputDialog("Ingrese su número de cédula real");
                a = JOptionPane.showInputDialog("Ingrese su nombre real");
            }while(b.length()<10);
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Taller1ProgramacionIII.dat"));
            o.writeObject(a+b);
        }catch (Exception ex) {

        }
        btnComprar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre= cboNombrePelicula.getSelectedItem().toString();
                Integer ne=Integer.parseInt(txtNumeroEntradas.getText());
                if(nombre.equals("BATMAN")){
                    contador1=ne+contador1;
                    if (contador1<23){
                        v1=v1-ne;
                    }
                }
                if(nombre.equals("XMEN")){
                    contador2=ne+contador2;
                    if (contador2<23){
                        v2=v2-ne;
                    }
                }
                if(nombre.equals("MARIO")){
                    contador3=ne+contador3;
                    if (contador3<23){
                        v3=v3-ne;
                    }
                }
                if((contador1<23 && contador2<23 && contador3<23)|| (contador1>23 && contador2<23 && contador3<23)||(contador1>23 && contador2>23 && contador3<23) ){
                    if (ne>0 && ne<5 ){
                        peliculas.encolar(new Pelicula(nombre,ne));
                    }else {
                        JOptionPane.showMessageDialog(null,"Numero de entradas invalido");
                    }
                }

                txtEntrada.setText(peliculas.listapelicula());
                lblPelicula1.setText(peliculas.impresionn(v1,1));
                lblPelicula2.setText(peliculas.impresionn(v2,2));
                lblPelicula3.setText(peliculas.impresionn(v3,3));
            }
        });

    }

}


