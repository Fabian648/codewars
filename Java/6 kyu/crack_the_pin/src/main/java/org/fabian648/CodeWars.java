package org.fabian648;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;

public class CodeWars {

    /**
     * Brute-Force-Methode zum Knacken eines 5-stelligen PINs anhand seines MD5-Hashes.
     * <p>
     * Die Methode testet alle PINs von {@code "00000"} bis {@code "99999"}, berechnet
     * jeweils den MD5-Hash und vergleicht ihn mit dem übergebenen Hash.
     * Sobald ein Treffer gefunden wird, wird der passende PIN als String zurückgegeben.
     *
     * @param hash der MD5-Hash eines 5-stelligen PINs in hexadezimaler Darstellung
     * @return der geknackte PIN als 5-stelliger String (z.B. "00078"), oder {@code null},
     *         falls kein passender PIN gefunden wurde
     * @throws UnsupportedEncodingException wenn das verwendete Zeichen-Encoding nicht unterstützt wird
     * @throws NoSuchAlgorithmException wenn der MD5-Algorithmus nicht verfügbar ist
     *
     * Link-Aufgabe: https://www.codewars.com/kata/5efae11e2d12df00331f91a6
     * Link-Ersteller-Aufgabe: https://www.codewars.com/users/zLuki
     */

    public String crack(String hash) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        for(int i = 0; i < 100000; i++) {
            String pin = String.format("%05d", i);

            byte[] digest = md.digest(pin.getBytes(StandardCharsets.UTF_8));

            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b)); // Hex-Format
            }
            if(sb.toString().equals(hash)) return pin;

        }
        return null;
    }
}