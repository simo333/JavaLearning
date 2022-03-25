package javalearning.ocpjavabook.practicetesting.nio2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewFlashCard implements ActionListener {
    JFrame f = new JFrame("OCP Java SE 7 - New FlashCard");
    JTextField tfMainObj = null;
    JTextField tfSubObj = null;
    JTextField tfNote = null;
    JButton btnSave = null;
    JButton btnClear = null;
    JButton btnExit = null;
    private void buildUI() {
        tfMainObj = new JTextField();
        tfSubObj = new JTextField();
        tfNote = new JTextField();
        btnSave = new JButton("Save");
        btnSave.addActionListener(this);
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(6,2));
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(" Main objective number"));
        topPanel.add(tfMainObj);
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(" Sub objective number"));
        topPanel.add(tfSubObj);
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(""));
        topPanel.add(new JLabel(" Flashcard text:"));
        topPanel.add(new JLabel(""));
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BorderLayout());
        middlePanel.add(tfNote);
        JPanel bottomPanel = new JPanel();
        bottomPanel.add(btnSave);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(BorderLayout.NORTH, topPanel);
        mainPanel.add(BorderLayout.CENTER, middlePanel);
        mainPanel.add(BorderLayout.SOUTH, bottomPanel);
        f.getContentPane().setLayout(new BorderLayout());
        f.setSize(500, 250);
        f.getContentPane().add(mainPanel);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String baseDir = "C:\\Users\\SimoPc\\IdeaProjects\\AccessModifiers\\NIO2 Tests\\FlashCardApp\\";
        String subDir = tfMainObj.getText();
        String fileName = tfSubObj.getText() + ".txt";
        Path filePath = Paths.get(baseDir, subDir, fileName);
        JOptionPane.showMessageDialog(f, filePath.toString());

        try {
            if (Files.notExists(filePath.getParent()))
                Files.createDirectory(filePath.getParent());
            if (!Files.exists(filePath))
                Files.createFile(filePath);
            PrintWriter pw = new PrintWriter(
                    new FileWriter(filePath.toFile(), true));
            pw.println(tfNote.getText());
            pw.flush();
        }
        catch (IOException ioe) {
            JOptionPane.showMessageDialog(f, ioe.toString());
        }
    }

    public static void main(String[] args) {
        NewFlashCard nfc = new NewFlashCard();
        nfc.buildUI();
    }
}
