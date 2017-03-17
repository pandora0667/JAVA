package Chapter15.Example;

import java.util.List;

/**
 * Created by seongwonlee on 2017. 3. 16..
 */
public class ListExample {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoradList();

        for (Board board : list) {
            System.out.println(board.getTitle() + " - " + board.getContent());
        }
    }
}
