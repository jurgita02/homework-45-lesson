package de.ait;

public abstract class StringTools {
    /*
    Создайте абстрактный класс StringTools, со статическими методами:
   Напишите тесты для данных методов.
     */
    public static String FirstToUpperCase(String str) {
        //String FirstToUpperCase(String str);
        //Данный метод должен возвращать новую строку, в которой первый символ возведен в верхний регистр.
        //Например, FirstToUpperCase("apple") -> "apple';
        if (str == null || str.isEmpty()) {
            return str;
        }
            char firstChar = str.charAt(0);
            if (Character.isUpperCase(firstChar)) {
                return str;
            }
        return Character.toUpperCase(firstChar) + str.substring(1);
    }

        public static boolean isStartingFromCapital (String str){
            //   boolean isStartingFromCapital(String str);
            //   Данный метод должен показывать, начинается ли строка с большой буквы.
            //   Например, isStartingFromCapital("Apple") -> true;
            // isStartingFromCapital("apple") -> false;
            if (str == null || str.isEmpty()) {
                return false;
            }
            char firstChar = str.charAt(0);
            return Character.isUpperCase(firstChar);
        }
    }