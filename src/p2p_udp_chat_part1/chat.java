/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p_udp_chat_part1;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

/**
 *
 * @author Eng_Obada Qasrawi
 */
public class chat extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form chat
     */
    
 public Channel channel = new Channel();
 public  InetSocketAddress address ;
 public String name;
      DefaultListModel<String> model = new DefaultListModel<>();
    public chat()  {
      
		
		initComponents();
      jButton1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_messege = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_sorce_port = new javax.swing.JTextField();
        jTextField_dest_ip = new javax.swing.JTextField();
        jTextField_dest_port = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_status = new javax.swing.JTextField();
        jTextField_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_sorce_ip = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField_Serverport = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(800, 500));

        jButton1.setText("Send ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea_messege.setColumns(20);
        jTextArea_messege.setRows(5);
        jTextArea_messege.setText("Enter massege");
        jTextArea_messege.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextArea_messegeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextArea_messegeFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea_messege);

        jLabel2.setText("Available Interface");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Local IP:");

        jLabel3.setText("Local Port:");

        jLabel4.setText("Remot IP:");

        jLabel5.setText("Remote Port :");

        jTextField_dest_ip.setText("192.168.1.110");

        jLabel6.setText("Status : ");

        jTextField_status.setEnabled(false);

        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });

        jLabel7.setText("Username:");

        jTextField_sorce_ip.setText("192.168.1.110");
        jTextField_sorce_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_sorce_ipActionPerformed(evt);
            }
        });

        jButton2.setText("test_con");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jTextPane1);

        jScrollPane1.setViewportView(jList1);

        jButton3.setText("Login");
        jButton3.setActionCommand("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Logout");
        jButton4.setToolTipText("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField_Serverport.setText("9876");

        jLabel8.setText("TCP Server IP ");

        jLabel9.setText("TCP Server Port ");

        jLabel10.setText("Online users ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_status, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_sorce_port, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_dest_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_dest_port, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_sorce_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Serverport, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3)
                                .addComponent(jButton4)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Serverport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel3)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel4)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_sorce_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextField_sorce_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jTextField_dest_ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jTextField_dest_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addComponent(jTextField_status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jTextField_sorce_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_sorce_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_sorce_ipActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
        
        

            
            String msg = jTextArea_messege.getText();
            jTextArea_messege.setText("");
            if( !msg.isEmpty()){
                
            msg = name + " >> " + msg;
            
            try {
                channel.sendTo(address, msg);
            } catch (IOException ex) {
                Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(msg);
            //jTextArea_chat.append(msg +"\n");
            appendToPane(jTextPane1,msg +"\n",Color.RED);
          
    
            }
        //channel.stop();

    }//GEN-LAST:event_jButton1ActionPerformed
  private void appendToPane(JTextPane tp, String msg, Color c)
    {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

        int len = tp.getDocument().getLength();
        tp.setCaretPosition(len);
        tp.setCharacterAttributes(aset, false);
        tp.replaceSelection(msg);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int sourcePort =0;
         String destinationIP ="";
         int destinationPort =0;
       if(!jTextField_dest_ip.getText().equals(destinationIP) || Integer.parseInt(jTextField_sorce_port.getText())!=sourcePort || Integer.parseInt(jTextField_dest_port.getText())!=destinationPort )
        try {
            name = jTextField_name.getText();
            
            sourcePort = Integer.parseInt(jTextField_sorce_port.getText());

             destinationIP = jTextField_dest_ip.getText();

             destinationPort = Integer.parseInt(jTextField_dest_port.getText());
            
            
            channel.bind(sourcePort);
            channel.start(); // Start Receive
            
            
          address = new InetSocketAddress(destinationIP, destinationPort);  
          
          jTextField_status.setText(name);
        } catch (SocketException ex) {
            Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextArea_messegeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea_messegeFocusGained
       
        if(jTextArea_messege.getText().trim().equals("Enter massege"))
            jTextArea_messege.setText("");
        
    }//GEN-LAST:event_jTextArea_messegeFocusGained

    private void jTextArea_messegeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextArea_messegeFocusLost
        if(jTextArea_messege.getText().trim().equals(""))
            jTextArea_messege.setText("Enter massege");
    }//GEN-LAST:event_jTextArea_messegeFocusLost
   boolean login =false;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//     jButton3.addMouseListener(new MouseAdapter(){
//  public void mouseClicked(MouseEvent me){

 
  
        try {
             InetAddress host;
         
             host = InetAddress.getLocalHost();
        
         Socket socket = null;
         ObjectOutputStream oos = null;
         ObjectInputStream ois = null;
        
             
                 
                 //establish socket connection to server
                 socket = new Socket(host.getHostName(), Integer.valueOf(jTextField_Serverport.getText()));
                 
                 //write to socket using ObjectOutputStream
                 oos = new ObjectOutputStream(socket.getOutputStream());
                 System.out.println("Sending request to Socket Server");
                // if(i==4)oos.writeObject("exit");
                  oos.writeObject( "login"+jTextField_sorce_ip.getText() +":"+ jTextField_sorce_port.getText());
                 //read the server response message
                 ois = new ObjectInputStream(socket.getInputStream());
                 String message;
                 
                 model =  (DefaultListModel<String>) ois.readObject();
                 login = true;
               //  System.out.println("Message: " + message);
               jList1.setModel(model);
                 //close resources
                 ois.close();
                 oos.close();
                 Thread.sleep(100);
         
             } catch (InterruptedException ex) {
                 Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
             }catch (IOException ex) {
                 Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
             }catch (ClassNotFoundException ex) {
                 Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
             }
            if(login){
jButton3.setEnabled(false);
jButton1.setEnabled(true);}
   new Thread() {
@Override
public void run() { 
    
    try {
            ServerSocket server;
            //socket server port on which it will listen
            int port = Integer.valueOf(jTextField_sorce_port.getText());
            server = new ServerSocket(port);
            //keep listens indefinitely until receives 'exit' call or program terminates
            while(true){
                System.out.println("Waiting for the client request");
                //creating socket and waiting for client connection
                Socket socket = server.accept();
                //read from socket to ObjectInputStream object
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //convert ObjectInputStream object to String
                String message;
              
                    model =  (DefaultListModel<String>) ois.readObject();
//               if(message.contains("login")){
//                   message =message.replace("login", "");
//                     model.addElement(message);
//             
//                if(message.contains("logout")){
//                    message =message.replace("logout", "");
//                   model.removeElement(message);
//               }
               jList1.setModel(model);
            //    System.out.println("Message Received: " + message);
              
                //create ObjectOutputStream object
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                //write object to Socket
                
                oos.writeObject(model);
              
                //close resources
                ois.close();
                oos.close();
                socket.close();
                //terminate the server if client sends exit reque st
              // if(message.equalsIgnoreCase("exit")) break;
            }
           // System.out.println("Shutting down Socket server!!");
            //close the ServerSocket object

        } catch (IOException ex) {
            Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
                    Logger.getLogger(TCPServer.class.getName()).log(Level.SEVERE, null, ex);
                }
   
        }
}.start();  
      
// };   
//});
     jList1.addMouseListener(mouseListener);
             
    }//GEN-LAST:event_jButton3ActionPerformed

    MouseListener mouseListener = new MouseAdapter() {
        
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            
            System.out.println(".mouseClicked()");
          String[] stringarry = jList1.getSelectedValue().split(":");
            
                 jTextField_dest_ip.setText(stringarry[0]);
                         jTextField_dest_port.setText(stringarry[1]);

        }
    }
};

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
                InetAddress host;
         
                host = InetAddress.getLocalHost();
        
                Socket socket = null;
                ObjectOutputStream oos = null;
                ObjectInputStream ois = null;
        
             
                 
                 //establish socket connection to server
                 socket = new Socket(host.getHostName(), Integer.valueOf(jTextField_Serverport.getText()));
                 
                 //write to socket using ObjectOutputStream
                 oos = new ObjectOutputStream(socket.getOutputStream());
                 System.out.println("Sending request to Socket Server");
                // if(i==4)oos.writeObject("exit");
                  oos.writeObject( "logout"+jTextField_sorce_ip.getText()+":" + jTextField_sorce_port.getText());
                 //read the server response message
                 ois = new ObjectInputStream(socket.getInputStream());
                 String message ="";
                 
                 model =  (DefaultListModel<String>) ois.readObject();
                 login = true;
                 System.out.println("Message: " + message);
                 //close resources
                 ois.close();
                 oos.close();
                 Thread.sleep(100);
         
             } catch (InterruptedException ex) {
                 Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
             }catch (IOException ex) {
                 Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
             }catch (ClassNotFoundException ex) {
                 Logger.getLogger(chat.class.getName()).log(Level.SEVERE, null, ex);
             }    
 jList1.setModel(model);
login= true;
jButton3.setEnabled(login);
jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat().setVisible(true);
            }
        });
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public class Channel implements Runnable
{
	private DatagramSocket socket;
	private boolean running;
	String msg = "a";
	public void bind(int port) throws SocketException
	{
		socket = new DatagramSocket(port);
	}
	
	public void start()
	{
		Thread thread = new Thread(this);
		thread.start();
	}
	
	public void stop()
	{
		running = false;
		socket.close();
	}

	@Override
	public void run()
	{
		byte[] buffer = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		
		running = true;
		while(running)
		{
			try
			{
				socket.receive(packet);
				
				 msg = new String(buffer, 0, packet.getLength());
				
                                appendToPane(jTextPane1,channel.getmessege()+"\n",Color.BLUE);
                                String msg2= "Received from:IP="+packet.getAddress()+", Port ="+packet.getPort();
                                jTextField_status.setText(msg2);
			} 
			catch (IOException e)
			{
				break;
			}
		}
	}
        public  String getmessege(){
    
            
            return msg;
        }
	public void sendTo(InetSocketAddress address, String msg) throws IOException
	{
		byte[] buffer = msg.getBytes();
		
		DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
		packet.setSocketAddress(address);
		
		socket.send(packet);
	}
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea_messege;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField_Serverport;
    private javax.swing.JTextField jTextField_dest_ip;
    private javax.swing.JTextField jTextField_dest_port;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextField_sorce_ip;
    private javax.swing.JTextField jTextField_sorce_port;
    private javax.swing.JTextField jTextField_status;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
