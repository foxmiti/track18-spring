package ru.track.cypher;

import java.util.*;

import org.jetbrains.annotations.NotNull;

/**
 * Вспомогательные методы шифрования/дешифрования
 */
public class CypherUtil {

  public static final String SYMBOLS = "abcdefghijklmnopqrstuvwxyz";

        /**
         * Генерирует таблицу подстановки - то есть каждой буква алфавита ставится в соответствие другая буква
         * Не должно быть пересечений (a -> x, b -> x). Маппинг уникальный
         *
         * @return таблицу подстановки шифра
         */
        @NotNull
        public static Map<Character, Character> generateCypher() {
            Map<Character, Character> retmap = new HashMap<>();

            List<Character> l = new ArrayList<>();
            for (int i = 0; i < SYMBOLS.length(); i++)
                l.add(SYMBOLS.charAt(i));
            Collections.shuffle(l);

            for (int i = 0; i < SYMBOLS.length(); i++)
                retmap.put(SYMBOLS.charAt(i), l.get(i));

            return retmap;
    }

}
