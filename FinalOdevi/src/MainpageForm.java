import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainpageForm extends JFrame{
    private JPanel panel1;
    private JButton btnExit;
    private JButton btnStok;


    public MainpageForm() {
        setTitle("Mainpage");
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,700);
        setLocation(400, 50);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });


        btnStok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                LoginForm loginForm = new LoginForm(1);
                LoginForm.setVisible();
                setVisible(false);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() { MainpageForm MainpageForm = new MainpageForm();
            }

        });
    }
}
