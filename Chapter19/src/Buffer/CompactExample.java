package Buffer;

import java.nio.ByteBuffer;

/**
 * Created by seongwonlee on 2017. 4. 1..
 * compact() 메소드의 역할
 */
public class CompactExample {

    public static void main(String[] args) {
        System.out.println("[ 7바이트 크기로 버퍼생성 ]");
        ByteBuffer buffer = ByteBuffer.allocateDirect(7); // 7Byte 생성

        buffer.put((byte)10);
        buffer.put((byte)11);
        buffer.put((byte)12);
        buffer.put((byte)13);
        buffer.put((byte)14);
        printState(buffer);

        buffer.flip();
        buffer.get(new byte[3]);
        System.out.println("[ 3바이트 읽음 ]");

        buffer.compact();
        System.out.println("[compact() 실행후");
        printState(buffer);
    }

    public static void printState(ByteBuffer buffer) {
        System.out.print(buffer.get(0) + ", ");
        System.out.print(buffer.get(1) + ", ");
        System.out.print(buffer.get(2) + ", ");
        System.out.print(buffer.get(3) + ", ");
        System.out.println(buffer.get(4));

        System.out.print("position : " + buffer.position() + ", ");
        System.out.print("limit : " + buffer.limit() + ", ");
        System.out.println("capacity : " + buffer.capacity());
    }
}