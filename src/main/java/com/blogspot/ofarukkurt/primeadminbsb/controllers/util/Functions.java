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

    public static Object getCast(String value, String rowKey) {
        Object obj=null;
        if (value.contains("String")) {
            obj= rowKey;
        } else if (value.contains("Short")) {
            obj= Short.parseShort(rowKey);
        } else if (value.contains("Integer") || value.contains("int")) {
            obj= Integer.parseInt(rowKey);
        } 
        return obj;
    }
    
    public static String pkFieldType(Class clazz) {

        for (java.lang.reflect.Field field : clazz.getDeclaredFields()) {
            java.lang.annotation.Annotation[] annotations = field.getDeclaredAnnotations();
            for (java.lang.annotation.Annotation annotation : annotations) {
                if (annotation.toString().contains("javax.persistence.Id")) {
                    return field.getType().toString();
                } else if (annotation.toString().contains("javax.persistence.EmbeddedId")) {
                    return field.getType().toString();
                }
            }
        }
        return null;
    }

    public static String subClassFieldType(String className) {
        try {
            Class clazz = Class.forName(className);
            java.lang.reflect.Field field = clazz.getDeclaredFields()[0];
            return field.getType().toString();
        } catch (ClassNotFoundException e) {
            return "";
        }
    }

    public static String getPKType(String className) throws ClassNotFoundException {
        Class clazz = Class.forName(className);
        java.lang.reflect.Field field = clazz.getDeclaredFields()[0];
        return field.getName();
    }

    public static Object stringToClass(String className) throws ClassNotFoundException {
        Class clazz = Class.forName(className.split(" ")[1]);
        return clazz;
    }

    public static String firstLetterLowerCase(String value) {
        char first = Character.toLowerCase(value.charAt(0));
        String fullName = first + value.substring(1);
        return fullName;
    }
}
