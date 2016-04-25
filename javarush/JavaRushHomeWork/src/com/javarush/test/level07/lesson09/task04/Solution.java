package com.javarush.test.level07.lesson09.task04;


import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("лима"); //1
        list.add("рора"); //2
        list = fix(list);

        int i = 0;
        for (String s : list)
        {
            System.out.println(s);

        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //напишите тут ваш код
       int n = list.size();
        int add = 0;
        int remove = 0;
        int x,y;
        for(int j = 0; j <list.size(); j ++){

            String s = list.get(j);
            int l = 0;
            int r = 0;
            for (int i = 0; i < s.length(); i ++){
                if(s.charAt(i) == 'л') l ++;
                if(s.charAt(i) == 'р') r ++;
            }
            if ( l > 0 && r > 0) continue;
            if ( r > 0 ){
                list.remove(s);
                j --;
            }
            if ( l > 0 ){
                list.add(j, s);
                j ++;
            }

        }


        return list;
    }
}