import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Shekhar on 21-01-2017.
 */
class AboutDialog extends Dialog implements ActionListener {
    AboutDialog(Frame parent, String title) {
        super(parent, title, false);
        this.setResizable(false);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(800, 500);
    }

    public void actionPerformed(ActionEvent ae) {
        dispose();
    }
}
