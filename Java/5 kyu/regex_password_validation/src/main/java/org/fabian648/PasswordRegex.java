package org.fabian648;

/**
 * Stellt einen regulären Ausdruck zur Validierung sicherer Passwörter bereit.
 * <p>
 * Die Regelanforderungen für ein gültiges Passwort sind:
 * <ul>
 *   <li>Mindestens 6 Zeichen lang</li>
 *   <li>Mindestens ein Kleinbuchstabe (a-z)</li>
 *   <li>Mindestens ein Großbuchstabe (A-Z)</li>
 *   <li>Mindestens eine Ziffer (0-9)</li>
 *   <li>Nur Buchstaben und Ziffern erlaubt</li>
 * </ul>
 * <p>
 * Der reguläre Ausdruck kann z.B. mit {@code String.matches(REGEX)} verwendet werden.
 *
 * Link-Aufgabe: https://www.codewars.com/kata/52e1476c8147a7547a000811
 * Link-Ersteller-Aufgabe: https://www.codewars.com/users/EricFreeman
 */
public class PasswordRegex {
    public static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$";
}