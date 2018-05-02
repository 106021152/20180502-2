import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private int count = 100;
    private JButton jbtnLeft = new JButton("＜－－");
    private JButton jbtnRight = new JButton("－－＞");
    private JButton jbtnExit = new JButton("Exit");
    private JLabel jlb = new JLabel(">___3___<");
    private JLabel jlb2 = new JLabel("<><><><>");
    public MainFrame(){
        this.init();
        this.setTitle("Class2");
    }
    public void init(){
        this.add(jbtnLeft);
        this.add(jbtnRight);
        this.add(jbtnExit);
        this.add(jlb);
        this.setLayout(null);
        this.setLocation(80,60);
        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbtnLeft.setBounds(80,60,100,100);
        jbtnRight.setBounds(280,60,100,100);
        jbtnExit.setBounds(480,60,100,100);
        jlb.setBounds(count,200,150,150);
        jlb2.setBounds(count,200,150,150);
        jbtnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count -=10;
                jlb.setBounds(count,200,150,150);
            }
        });
        jbtnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count +=10;
                jlb.setBounds(count,200,150,150);
            }
        });
        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
