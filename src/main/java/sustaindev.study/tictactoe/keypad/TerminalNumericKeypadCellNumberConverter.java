/*
 *    Copyright 2019. http://sustaindev.study
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package sustaindev.study.tictactoe.keypad;

import sustaindev.study.tictactoe.component.CellNumberConverter;
import sustaindev.study.tictactoe.model.Cell;

/**
 * @author edmams789
 * @link http:// sustaindev.study/java
 */
public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {

//    private final char[][] mapping = {
//            {'1', '2', '3'},
//            {'4', '5', '6'},
//            {'7', '8', '9'}
//    };

    @Override
    public Cell toCell(final char number) {
        /* for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mapping[i][j] == number) {
                    return new Cell(i, j);
                }
            }
        }
        return null;*/
        final int val = number - '0' - 1;
        return new Cell(val / 3, val % 3);
    }

    @Override
    public char toNumber(final Cell cell) {
//        return mapping[cell.getRow()][cell.getCol()];
        return (char) ('0' + (cell.getRow() * 3 + cell.getCol() + 1));
    }
}

/*
List<String> names = Arrays.asList("Alice", "Bob", "Charlotte", "David");

Optional<String> nameOptional = names.stream()
 .filter(name -> name.startsWith("A"))
 .findFirst();

nameOptional.ifPresent(name -> System.out.println("Найдено имя, начинающееся на 'A': " + name));

В этом примере мы используем Optional для поиска первого имени в списке, которое начинается на букву "A".
Мы применяем метод filter для фильтрации и метод findFirst для поиска первого элемента.
Затем мы используем метод ifPresent для выполнения действия, если значение было найдено.

Использование Optional помогает обработать ситуации, когда значение может отсутствовать, и предотвратить ошибки NullPointerException.
Эта фишка улучшает безопасность кода и делает его более надежным, что является важным для профессиональных разработчиков на Java
 */
