package dvh;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.PointerInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyListenerImpl implements KeyListener {
    public KeyListenerImpl() {
        super();
    }

    /** Handle the key typed event from the text field. */
    public void keyTyped(KeyEvent e) {
        System.out.println("KEY TYPED: " + e.getKeyChar());

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("Up pressed");
        }
    }

    /** Handle the key pressed event from the text field. */
    public void keyPressed(KeyEvent e) {
        System.out.println("KEY PRESSED: " + e.getKeyChar());
    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        System.out.println("KEY RELEASED: " + e.getKeyChar());
    }

    public static void main(String args[]) {
        try {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

            String input;

            while ((input = br.readLine()) != null) {
                System.out.println(input);
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
