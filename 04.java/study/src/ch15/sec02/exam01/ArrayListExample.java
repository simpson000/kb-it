package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<Board>();
        list.add(new Board("subjec1","contex1","writer1"));
        list.add(new Board("subjec2","contex2","writer2"));
        list.add(new Board("subjec3","contex3","writer3"));
        list.add(new Board("subjec4","contex4","writer4"));
        list.add(new Board("subjec5","contex5","writer5"));


        int size= list.size();
        System.out.println(size);

        Board board=list.get(2);

        System.out.println(board.getSubject()+ " " + board.getContent() + " " + board.getWriter());
        System.out.println();


        for (int i=0;i<size;i++) {
            Board temp=list.get(i);
            System.out.println(temp.getSubject()+ " " + temp.getContent() + " " + board.getWriter());

        }
        list.remove(2);
        list.remove(2);
        System.out.println();

        for (Board temp:list) {
            System.out.println(temp.getSubject()+ " " + temp.getContent() + " " + board.getWriter());
        }

    }
}
