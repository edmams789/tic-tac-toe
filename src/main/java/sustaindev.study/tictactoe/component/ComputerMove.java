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

package sustaindev.study.tictactoe.component;

import sustaindev.study.tictactoe.model.Cell;
import sustaindev.study.tictactoe.model.GameTable;

import java.util.Random;

/**
 * @author edmams789
 * @link http:// sustaindev.study/java
 */
public class ComputerMove {

    public void make(final GameTable gameTable) {
        final Random random = new Random();
        while (true) {
            final int row = random.nextInt(3);
            final int col = random.nextInt(3);
            final Cell randomCell = new Cell(row, col);
//        if (gameTable.getSing(randomCell) == ' ') {
//            gameTable.setSign(randomCell, '0');
//            return;
//        }
            if (gameTable.isEmpty(randomCell)) {
                gameTable.setSign(randomCell, '0');
                return;
            }
        }
    }
}
