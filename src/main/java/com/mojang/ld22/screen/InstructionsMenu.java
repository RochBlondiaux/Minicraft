package com.mojang.ld22.screen;

import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Font;
import com.mojang.ld22.gfx.Screen;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InstructionsMenu extends Menu {

    private final Menu parent;

    public void tick() {
        if (input.attack.clicked || input.menu.clicked) {
            game.setMenu(parent);
        }
    }

    public void render(Screen screen) {
        screen.clear(0);

        Font.draw("HOW TO PLAY", screen, 4 * 8 + 4, 8, Color.get(0, 555, 555, 555));
        Font.draw("Move your character", screen, 4, 3 * 8, Color.get(0, 333, 333, 333));
        Font.draw("with the arrow keys", screen, 4, 4 * 8, Color.get(0, 333, 333, 333));
        Font.draw("press C to attack", screen, 4, 5 * 8, Color.get(0, 333, 333, 333));
        Font.draw("and X to open the", screen, 4, 6 * 8, Color.get(0, 333, 333, 333));
        Font.draw("inventory and to", screen, 4, 7 * 8, Color.get(0, 333, 333, 333));
        Font.draw("use items.", screen, 4, 8 * 8, Color.get(0, 333, 333, 333));
        Font.draw("Select an item in", screen, 4, 9 * 8, Color.get(0, 333, 333, 333));
        Font.draw("the inventory to", screen, 4, 10 * 8, Color.get(0, 333, 333, 333));
        Font.draw("equip it.", screen, 4, 11 * 8, Color.get(0, 333, 333, 333));
        Font.draw("Kill the air wizard", screen, 4, 12 * 8, Color.get(0, 333, 333, 333));
        Font.draw("to win the game!", screen, 4, 13 * 8, Color.get(0, 333, 333, 333));
    }
}
