package org.agoncal.book.javaee7.chapter21;

import javax.jws.WebService;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@WebService
public class CardValidator {

    // ======================================
    // =           Public Methods           =
    // ======================================

    public boolean validate(CreditCard creditCard) {

        Character lastDigit = creditCard.getNumber().charAt(creditCard.getNumber().length() - 1);

        if (Integer.parseInt(lastDigit.toString()) % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}