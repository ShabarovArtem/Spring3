package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratirExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for(char ch: s.toCharArray()){ // мы каждый char который получился из массива string s добавляем в list
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator(); // ListIterator имеет hasPrevious чтобы идти назад
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while(iterator.hasNext() && reverseIterator.hasPrevious()){
            if (iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }

        }


    }
}
