package com.phil;

import java.util.Deque;
import java.util.LinkedList;

public class RewriteDeque {
    public static void main(String[] args) {
        RewriteDeque rewriteDeque = new RewriteDeque();
        rewriteDeque.originalMethod();
        rewriteDeque.rewroteMethod();
    }

    protected void rewroteMethod() {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("b");
        deque.addFirst("c");
        deque.addLast("a");

        System.out.println(deque);

        String str = deque.peekFirst();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.removeFirst());
        }

        System.out.println(deque);
    }

    protected void originalMethod() {
        Deque<String> deque = new LinkedList<>();
        deque.push("a");
        deque.push("b");
        deque.push("c");
        System.out.println(deque);

        String str = deque.peek();
        System.out.println(str);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.pop());
        }

        System.out.println(deque);
    }
}
