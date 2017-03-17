package Chapter15.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seongwonlee on 2017. 3. 16..
 */
public class BoardDao {

    public List<Board> getBoradList() {
        List<Board> list = new ArrayList<Board>();
        list.add(new Board("JAVA", "Collection Framework"));
        list.add(new Board("Data Structure", "Heap"));
        list.add(new Board("APPLE", "MacBook Pro TouchBar"));

        return list;

    }
}
