package Buffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/**
 * Created by seongwonlee on 2017. 4. 1..
 * ByteBuffer <-> String
 **/
public class ByteBufferToStringExample {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");

        // 문자열 -> 인코딩 -> ByteBuffer
        String data = "안녕하세요";
        ByteBuffer byteBuffer = charset.encode(data);

        // 문자열 -> 디코딩 -> ByteBuffer
        data = charset.decode(byteBuffer).toString();
        System.out.println("문자열 복원 : " + data);
    }
}
