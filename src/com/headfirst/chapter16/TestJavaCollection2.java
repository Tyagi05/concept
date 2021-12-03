package com.headfirst.chapter16;

import java.util.Iterator;
import java.util.Stack;
public class TestJavaCollection2 {
        public static void main(String[] args) {
            Stack<String> st = new Stack<String>();
            st.push("orange");
            st.push("apple");
            st.push("mango");
            st.search("k");
            Iterator<String> itr= st.iterator();
            while(itr.hasNext()){
                System.out.println("element" + itr.next());
            }
        }
    }

