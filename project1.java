import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException,IOException,LineUnavailableException{
        File file=new File("/home/vasa/Загрузки/Sting - Fields Of Gold (dizer.net).wav");
        Scanner scanner=new Scanner(System.in);
        AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audioInputStream);
      //  String response="";

        //while(!response.equals("Q"))
        //{

          //  System.out.println("P=Play, S=Stop, R=Reset, Q=Quit");
           // System.out.println("Enter your choice");
          //  response=scanner.next();
          //  response=response.toUpperCase();
        /*  switch (response)
            {

                case("P"):clip.start();
                    break;
                case("S"):clip.stop();
                    break;
                case("R"):clip.setMicrosecondPosition(0);
                    break;

            } */

        JFrame frame=new JFrame();
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton myButton=new JButton("Play"); //Создаем кнопку
        JButton myButton2=new JButton("Stop");
        JButton myButton3=new JButton("Reset");
        myButton.setBounds(50,50, 100,50);
        myButton2.setBounds(200,50,100,50);
        myButton3.setBounds(350,50 ,100,50);
        myButton.addActionListener(

                (e) ->

                        clip.start()

        );
        myButton2.addActionListener(
                (e)->

                clip.stop()



        );
        myButton3.addActionListener(
                (e)->


             clip.setMicrosecondPosition(0)



        );

        frame.add(myButton);
        frame.add(myButton2);
        frame.add(myButton3);
        frame.setVisible(true);




    }
}

