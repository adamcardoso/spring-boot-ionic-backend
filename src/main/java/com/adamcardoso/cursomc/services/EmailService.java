package com.adamcardoso.cursomc.services;

import com.adamcardoso.cursomc.domain.Cliente;
import com.adamcardoso.cursomc.domain.Pedido;
import org.springframework.mail.SimpleMailMessage;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);

    void sendNewPasswordEmail(Cliente cliente, String newPass);
}
