package com.javarush.task.task13.task1307;

/* 
Параметризованый интерфейс
*/

import java.sql.DataTruncation;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject <String>//допишите здесь ваш код
    {

        @Override
        public SimpleObject <String>getInstance() {
            return new StringObject();
        }
    }
}