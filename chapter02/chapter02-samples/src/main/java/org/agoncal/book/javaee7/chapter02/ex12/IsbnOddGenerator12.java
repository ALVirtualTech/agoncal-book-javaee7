package org.agoncal.book.javaee7.chapter02.ex12;


import java.util.Random;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@ThirteenDigits12
@Odd12
public class IsbnOddGenerator12 implements NumberGenerator12 {

  // ======================================
  // =          Business methods          =
  // ======================================

  public String generateNumber() {
    return "131-84356-" + Math.abs(new Random().nextInt());
  }
}