package com.mojang.ld22.screen;

/**
 * Created by SeamusFD on 3/18/14.
 * All rights belong to me!!
 */

import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Font;
import com.mojang.ld22.gfx.Screen;

public class AboutModMenu extends Menu {
    protected Menu parent;

    public AboutModMenu(Menu parent) {
        this.parent = parent;
    }

    public void tick() {
        if (input.attack.clicked || input.menu.clicked) {
            game.setMenu(parent);
        }
    }

    public void render(Screen screen) {
        screen.clear(0);

        Font.draw("About MiniFarm Mod", screen, 2 * 8 + 4, 1 * 8, Color.get(0, 555, 555, 555));
        Font.draw("MiniFarm was made", screen, 0 * 8 + 4, 3 * 8, Color.get(0, 333, 333, 333));
        Font.draw("by SeamusFD", screen, 0 * 8 + 4, 4 * 8, Color.get(0, 333, 333, 333));
        Font.draw("As a personal Java", screen, 0 * 8 + 4, 5 * 8, Color.get(0, 333, 333, 333));
        Font.draw("advanced project in", screen, 0 * 8 + 4, 6 * 8, Color.get(0, 333, 333, 333));
        Font.draw("Early 2014.", screen, 0 * 8 + 4, 7 * 8, Color.get(0, 333, 333, 333));
        Font.draw("it is dedicated to", screen, 0 * 8 + 4, 9 * 8, Color.get(0, 333, 333, 333));
        Font.draw("NOBODY. <3", screen, 0 * 8 + 4, 10 * 8, Color.get(0, 333, 333, 333));
    }
}
