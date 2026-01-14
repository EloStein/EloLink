package de.spring.elolink_spring.encryption;

import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.security.KeyPair;
import java.time.LocalDateTime;

public class TestEncryption {

//    public static void main(String[] args) throws Exception {
//        KeyPair receiverRsaKeyPair = KeyGenerator.genRsaKeyPair();
//        KeyPair senderRsaKeyPair = KeyGenerator.genRsaKeyPair();
//
//        SecretKey aesKey = KeyGenerator.genAesKey();
//        System.out.println("Unencrypted Aes Key: " + aesKey);
//        byte[] encryptedAesKeyRec = Encrypter.encryptAesKey(receiverRsaKeyPair.getPublic(), aesKey);
//        byte[] encryptedAesKeyOwn = Encrypter.encryptAesKey(senderRsaKeyPair.getPublic(), aesKey);
//
//        System.out.println("Rec decrypted Aes Key like: " + Decrypter.decryptAesKey(receiverRsaKeyPair.getPrivate(), encryptedAesKeyRec));
//        System.out.println("Own decrypted Aes Key like: " + Decrypter.decryptAesKey(senderRsaKeyPair.getPrivate(), encryptedAesKeyOwn));
//
//        GCMParameterSpec spec = KeyGenerator.genSpec();
//        byte[] encryptedText = Encrypter.encryptText("TestNachricht", aesKey, spec);
//        System.out.println("Encrypted Message: " + new String(encryptedText));
//
//        SecretKey decryptedAesKeyRec = Decrypter.decryptAesKey(receiverRsaKeyPair.getPrivate(), encryptedAesKeyRec);
//        SecretKey decryptedAesKeyOwn = Decrypter.decryptAesKey(senderRsaKeyPair.getPrivate(), encryptedAesKeyOwn);
//
//        byte[] decryptedMessageRec = Decrypter.decryptText(encryptedText, decryptedAesKeyRec, spec);
//        byte[] decryptedMessageOwn = Decrypter.decryptText(encryptedText, decryptedAesKeyOwn, spec);
//        System.out.println("Decrypted Message by Rec: " + new String(decryptedMessageRec));
//        System.out.println("Decrypted Message by Own: " + new String(decryptedMessageRec));
//
//    }

    public static void main(String[] args) throws Exception {
        KeyPair keyPair = KeyGenerator.genRsaKeyPair();
        System.out.println("PUBLIC: " + keyPair.getPublic());
        System.out.println("PRIVATE: " + keyPair.getPrivate());

        String privateKeyBase64 = Base64Encoder.toBase64(keyPair.getPrivate());
        String publicKeyBase64 = Base64Encoder.toBase64(keyPair.getPublic());
        System.out.println("BASE64 PRIVATE: " + privateKeyBase64);
        System.out.println("BASE64 PUBLIC: " + publicKeyBase64);

        System.out.println(LocalDateTime.now());



    }
}
