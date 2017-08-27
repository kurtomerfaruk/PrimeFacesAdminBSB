package com.blogspot.ofarukkurt.primeadminbsb.controllers.util;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 *
 * @author Omer Faruk KURT
 * * @blog : https://ofarukkurt.blogspot.com.tr/
 * @Created on date 13/02/2017 12:15:31
 */
public class Functions {

    public static UUID asUuid(byte[] bytes) {
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        long firstLong = bb.getLong();
        long secondLong = bb.getLong();
        return new UUID(firstLong, secondLong);
    }

    public static byte[] asBytes(UUID uuid) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
        bb.putLong(uuid.getMostSignificantBits());
        bb.putLong(uuid.getLeastSignificantBits());
        return bb.array();
    }
    
    public static String crypto(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte mdArray[] = md.digest();
            StringBuilder sb32 = new StringBuilder();
            for (int i = 0; i < mdArray.length; i++) {
                sb32.append(Integer.toString((mdArray[i] & 0xff) + 0x100, 32));
            }
            return sb32.toString();
        } catch (NoSuchAlgorithmException ex) {
            System.err.println(ex);
        }
        return null;
    }
}
