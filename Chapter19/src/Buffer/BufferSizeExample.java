package Buffer;

import java.nio.ByteBuffer;

/**
 * Created by seongwonlee on 2017. 4. 1..
 * 넌다이렉트와 다이렉트 크기 비교
 */
public class BufferSizeExample {
    public static void main(String[] args) {
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(500 * 1024 * 1024);
        System.out.println("다이럭트 버퍼가 생성되었습니다"); // os memory

        ByteBuffer nonDirectBuffer = ByteBuffer.allocate(200 * 1024 * 1024);
        System.out.println("넌다이렉트 버퍼가 생성되었습니다"); // jvm heap memory
    }
}
