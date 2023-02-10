package com.mc.CrudEmpresaA.Email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailClass {

	public static void main(String[] args) {
		//a quie se lo vamos a enviar
		String to = "rodriguezsantiagoefren@gmail.com";
		//de donde lo vamos a enviar
		String from = "efren.rodriguez.sa@gmail.com";
		//asumiendo que tu envias email de from localhost
		String host ="192.168.0.104";
		//Get system properties
		Properties properties = System.getProperties();
		//setup mail server
		properties.setProperty("mail.smtp.host", host);
		//get default sesion object
		Session session = Session.getDefaultInstance(properties);
		//
		try {
			//create a default mimesage object
			MimeMessage message = new MimeMessage(session);
			//set from
			message.setFrom(new InternetAddress(from));
			//set to
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			//set subject
			message.setSubject("este es la linea subjetiva");
			//now
			message.setText("es un mensaje actual");
			//
			Transport.send(message);
			System.out.println("envia mensaje succefull");
			
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
		
	}

}
