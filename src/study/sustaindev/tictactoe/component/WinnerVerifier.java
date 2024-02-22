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

package study.sustaindev.tictactoe.component;

import study.sustaindev.tictactoe.model.Cell;
import study.sustaindev.tictactoe.model.GameTable;

/**
 * @author edmams789
 * @link http:// sustaindev.study/java
 */
public class WinnerVerifier {

    public boolean isUserWin(final GameTable gameTable) {

        return isWinner(gameTable, 'X');
    }

    public boolean isComputerWin(final GameTable gameTable) {

        return isWinner(gameTable, '0');
    }

    private boolean isWinner(final GameTable gameTable, final char sign) {

        return isWinnerByRows(gameTable, sign) ||
                isWinnerByCols(gameTable, sign) ||
                isWinnerByMainDiagonal(gameTable, sign) ||
                isWinnerBySecondaryDiagonal(gameTable, sign);
    }

    private boolean isWinnerByRows(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSing(new Cell(i, 0)) == gameTable.getSing(new Cell(i, 1)) &&
                    gameTable.getSing(new Cell(i, 1)) == gameTable.getSing(new Cell(i, 2)) &&
                    gameTable.getSing(new Cell(i, 2)) == sign) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByCols(final GameTable gameTable, final char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSing(new Cell(0, i)) == gameTable.getSing(new Cell(1, i)) &&
                    gameTable.getSing(new Cell(1, i)) == gameTable.getSing(new Cell(2, i)) &&
                    gameTable.getSing(new Cell(2, i)) == sign) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByMainDiagonal(final GameTable gameTable, final char sign) {
        return gameTable.getSing(new Cell(0, 0)) == gameTable.getSing(new Cell(1, 1)) &&
                gameTable.getSing(new Cell(1, 1)) == gameTable.getSing(new Cell(2, 2)) &&
                gameTable.getSing(new Cell(2, 2)) == sign;
    }

    private boolean isWinnerBySecondaryDiagonal(final GameTable gameTable, final char sign) {
        return gameTable.getSing(new Cell(2, 0)) == gameTable.getSing(new Cell(1, 1)) &&
                gameTable.getSing(new Cell(1, 1)) == gameTable.getSing(new Cell(0, 2)) &&
                gameTable.getSing(new Cell(0, 2)) == sign;
    }
}
