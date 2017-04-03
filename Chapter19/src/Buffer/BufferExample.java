package Buffer;

import java.nio.ByteBuffer;


/**
 * Created by seongwonlee on 2017. 4. 1..
 * Buffer 위치 속성값
 */
public class BufferExample {
    public static void main(String[] args) {
        System.out.println("[7바이트 크기로 버퍼 생성]");
        ByteBuffer buffer = ByteBuffer.allocateDirect(7);
        printState(buffer);
        System.out.println();

        buffer.put((byte)10);
        buffer.put((byte)11);
        System.out.println("[ 2바이트 저장후 ]");
        printState(buffer);
        System.out.println();

        buffer.put((byte)12);
        buffer.put((byte)13);
        buffer.put((byte)14);
        System.out.println("[ 3바이트 저장후 ]");
        printState(buffer);
        System.out.println();

        buffer.flip(); // 데이터를 읽기 위해 위치 속성값 변경
        System.out.println("[ flip() 실행후 ");
        printState(buffer);
        System.out.println();

        buffer.get(new byte[3]);
        System.out.println("[ 3바이트 읽은 후 ]");
        printState(buffer);
        System.out.println();

        buffer.mark(); // mark 하기 , 현재 위치
        System.out.println("------ [ 현재 위치 하크함 ]");
        System.out.println();

        buffer.get(new byte[2]);
        System.out.println("[ 2바이트 읽은후 ]");
        printState(buffer);
        System.out.println();

        buffer.reset(); // mark 위치로 position 이동
        System.out.println("------ [ position 을 마크 위치로 이동 ]");
        printState(buffer);
        System.out.println();

        buffer.rewind();
        System.out.println("[ rewind() 실행 후 ]");
        printState(buffer);
        System.out.println();

        buffer.clear(); // 모든 속성값을 초기화
        System.out.println("[ clear 실행 후 ]");
        printState(buffer);

    }

    public static void printState(ByteBuffer buffer) {
        System.out.print("\t position : " + buffer.position() + ", ");
        System.out.print("\t limit : " + buffer.limit() + ", ");
        System.out.println("\t capacity : " + buffer.capacity());
    }
}
