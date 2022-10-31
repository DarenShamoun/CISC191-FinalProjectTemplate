package edu.sdccd.cisc191.template;

import java.net.Socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JTextArea;

public class ReceiveThread extends Thread
{

    private Socket s;
    static String receiveMessage = "";
    static JTextArea chattingBoard;

    public ReceiveThread(Socket s, JTextArea chattingBoard)
    {
        this.s = s;
        this.chattingBoard = chattingBoard;
    }

    public void run()
    {
        try
        {
            //input stream from client
            InputStream in = s.getInputStream();
            //Read the messages from client
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

            while(true)
            {
                receiveMessage = bufferedReader.readLine();
                // display message + next line
                chattingBoard.append(receiveMessage + "\n");

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
