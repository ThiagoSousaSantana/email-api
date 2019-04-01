package br.com.emailapi.service;

import br.com.emailapi.models.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SmtpEmailService {

    @Autowired
    private MailSender mailSender;

    @Value("${email}")
    private String toEmail;

    public void sendEmail(Email email){
        mailSender.send(prepareSimpleMailMessageFromEmail(email));
    }

    private SimpleMailMessage prepareSimpleMailMessageFromEmail(Email email){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(toEmail);
        mailMessage.setText(
                "Name: " + email.getName() +
                "\nEmail: " + email.getEmailAdress() +
                "\nMessage: " + email.getMessage());
        mailMessage.setSubject("Contact email");
        return mailMessage;
    }
}
