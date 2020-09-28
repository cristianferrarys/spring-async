package com.spring.async.app.serviceImpl;

import com.spring.async.app.service.MailTest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class MailTestImpl implements MailTest {

  @Override
  @Async
  public void envioSend(final String msj) {
    System.out.println("Empezó  el envío: " + msj + " " + Calendar.getInstance().getTime());
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Se envío: " + msj + " " + Calendar.getInstance().getTime());
  }

}
