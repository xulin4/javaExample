package org.example.JavaMail;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {


    public static void main(String[] args) {


        // 发件人邮箱、密码（如果是授权码，则填写授权码）
        String from = "3137811409@qq.com";
        String password = "tkomyjcffohsgdchj";

        // 收件人邮箱
        String to = "xulin@dcrays.cn";

        // 邮件服务器配置
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.qq.com"); // SMTP服务器地址
        props.put("mail.smtp.port", "465"); // SMTP服务器端口
        props.put("mail.smtp.auth", "true"); // 是否需要身份验证
        props.put("mail.smtp.ssl.enable", "true"); // 启用TLS加密

        // 创建Session实例
        Session session = Session.getInstance(props, new Authenticator() {


            protected PasswordAuthentication getPasswordAuthentication() {


                return new PasswordAuthentication(from, password);
            }
        });

        try {


            // 创建邮件实例
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("JavaMail Test"); // 邮件主题
            message.setText("Hello, this is a test email sent by JavaMail."); // 邮件正文

            // 发送邮件
            Transport.send(message);
            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {


            throw new RuntimeException(e);
        }
    }
}
