package EncodingDecoding;

import java.util.Base64;
import java.util.UUID;

/**
 * Created by Jagriti on 10/8/2018.
 */
public class EncDec {
    public static void main(String[] args) {
        String originalInput = "neosphere institute";
        String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
        System.out.println("the encoded string is "+encodedString);
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("the decoded string is "+decodedString);
        String encodedString2 = Base64.getEncoder().withoutPadding().encodeToString(originalInput.getBytes());
        System.out.println(" encoded wihtot padding "+encodedString2);
        String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
        System.out.println("encode url is "+encodedUrl);
        byte[] decodedBytes1 = Base64.getUrlDecoder().decode(encodedUrl);
        String decodedUrl = new String(decodedBytes1);
        System.out.println("decode url is "+decodedUrl);

        StringBuilder buffer = getMimeBuffer();
        byte[] encodedAsBytes = buffer.toString().getBytes();
        String encodedMime = Base64.getMimeEncoder().encodeToString(encodedAsBytes);

        byte[] decodedBytes2 = Base64.getMimeDecoder().decode(encodedMime);
        String decodedMime = new String(decodedBytes2);
        System.out.println("mime types "+decodedMime);
    }
    private static StringBuilder getMimeBuffer() {
        StringBuilder buffer = new StringBuilder();
        for (int count = 0; count < 10; ++count) {
            buffer.append(UUID.randomUUID().toString());
        }
        return buffer;
    }
}
