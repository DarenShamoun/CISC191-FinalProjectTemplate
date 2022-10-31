package edu.sdccd.cisc191.template;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Client
{
    static Socket s;
    static JTextArea chattingBoard;

    public static void main(String[] args)
    {
        try
        {
            s = new Socket("LocalHost",4044);
            chat();

        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void chat()
    {
        JFrame jFrame = new JFrame("Online Customer Service");
        jFrame.setSize(600,450);
        jFrame.setLayout(new BorderLayout());
        jFrame.setLocation(900,200);

        // at the top showing who is talking to you
        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("User Interface");
        jPanel.add(jLabel);

        // new JText for chattingBoard
        chattingBoard = new JTextArea();
        //set size
        chattingBoard.setPreferredSize(new Dimension(200, 150));
        //automatic NextLine true
        chattingBoard.setLineWrap(true);
        //display the context but not allow to edit
        chattingBoard.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(chattingBoard);

        //add a bottom panel
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        //make a user text box Label in front of the userTextBox
        JLabel tlMsg = new JLabel("iMessage：");
        //create the textField
        JTextField tfMsg = new JTextField("");
        tfMsg.setPreferredSize(new Dimension(200, 30));

        //create a button to sent message
        JButton sendButton = new JButton("send");
        sendButton.setPreferredSize(new Dimension(80, 30));
        bottomPanel.add(tlMsg);
        bottomPanel.add(tfMsg);
        bottomPanel.add(sendButton);


        jFrame.add(jPanel, BorderLayout.NORTH);
        jFrame.add(scrollPane, BorderLayout.CENTER);
        jFrame.add(bottomPanel, BorderLayout.SOUTH);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        tfMsg.grabFocus();

        //add an ActionListener
        sendButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String message =  tfMsg.getText();
                if (message.equals(""))
                {
                    JOptionPane.showMessageDialog(jFrame, "cannot be blank");
                    return;
                }

                try
                {
                    OutputStream outputStream = s.getOutputStream();
                    // socket sent out the message
                    PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));

                    chattingBoard.append("I：" + message + "\n");
                    pw.println("Client：" + message);


                    //good practice
                    pw.flush();
                    tfMsg.setText("");


                }
                catch (IOException ee)
                {
                    ee.printStackTrace();
                }
            }
        });

        // use thread to receive
        new ReceiveThread(s, chattingBoard).start();
    }
}