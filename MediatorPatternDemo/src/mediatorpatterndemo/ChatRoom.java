/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpatterndemo;

import java.util.Date;

/**
 *
 * @author Nicolas Sá de Souza
 */
public class ChatRoom{
   public static void showMessage(User user,String message){
      System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
  }
}
