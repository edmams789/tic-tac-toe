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

package main.java.sustaindev.study.tictactoe;

import main.java.sustaindev.study.tictactoe.component.*;
import main.java.sustaindev.study.tictactoe.keypad.TerminalNumericKeypadCellNumberConverter;

/**
 * @author edmams789
 * @link http:// sustaindev.study/java
 */
public class Launcher {

    public static void main(final String[] args) {
//        final CellNumberConverter cellNumberConverter = new DesktopNumericKeypadCellNumberConverter();
        final CellNumberConverter cellNumberConverter = new TerminalNumericKeypadCellNumberConverter();
        final Game game = new Game(
                new DataPrinter(cellNumberConverter),
                new ComputerMove(),
                new UserMove(cellNumberConverter),
                new WinnerVerifier(),
                new CellVerifier()
        );
        game.play();
    }
}


//PS C:\Users\edmam\IdeaProjects\tic-tac-toe> java -jar target\tic-tac-toe-1.0-SNAPSHOT.jar
