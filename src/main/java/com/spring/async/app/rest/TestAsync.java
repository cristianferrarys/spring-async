package com.spring.async.app.rest;

import com.spring.async.app.service.MailTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class TestAsync {

  @Autowired
  private MailTest mailTest;

  @GetMapping("/api/test")
  public String emailTest() {
    final long start = System.currentTimeMillis();
    mailTest.envioSend("mensaje 1");
    mailTest.envioSend("mensaje 2");
    mailTest.envioSend("mensaje 3");
    final long end = System.currentTimeMillis();
    final long tiempoFinal = end - start;
    System.out.println("Tiempo total de envío: " + tiempoFinal);
    System.out.println("Final de envíos: " + Calendar.getInstance().getTime());
    return "enviado";
  }

}
