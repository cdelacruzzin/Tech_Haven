import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Gui extends JFrame implements ActionListener{
    protected JTextField tf1, tf2;
    protected JButton btnAdd;
    protected JTextArea txtArea;
    protected JPanel panel;


    public static void main(String[] args){
        new Gui();
    }

    Gui(){
        super("GUI App");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        txtArea = new JTextArea();
        txtArea.setEditable(false);
        c.add(txtArea, BorderLayout.NORTH);


        panel = new JPanel(new GridLayout(1, 2));
        panel.setSize(200,100);
        tf1 = new JTextField();
        tf2 = new JTextField();
        panel.add(tf1);
        panel.add(tf2);
        c.add(panel,BorderLayout.CENTER);

        btnAdd = new JButton("add");
        btnAdd.addActionListener(this);
        c.add(btnAdd, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(this.tf1.getText());
        int n2 = Integer.parseInt(this.tf2.getText());
        if (isDigit(this.tf1.getText()) && isDigit(this.tf2.getText())){
            this.txtArea.setText(String.valueOf((n1 + n2)));
        }
    }

    public static boolean isDigit(String s) {
        return s.matches("^[0-9]+$");
    }

}
//Write a Java GUI application that can perform below action:
//a. Two TextFields that takes two numbers as input
//b. A button that performs addition on the two numbers (from the TextFields)
//c. An un-editable TextArea that shows the output of the addition operation.
//d. A close button at the top corner that closes the window