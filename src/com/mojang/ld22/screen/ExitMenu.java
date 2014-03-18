package com.mojang.ld22.screen;

/**
 * Created by SeamusFD on 3/18/14.
 * All rights belong to me!!
 */
import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Font;
import com.mojang.ld22.gfx.Screen;

import javax.swing.*;

public class ExitMenu extends Menu {
    protected Menu parent;

    public ExitMenu(Menu parent) {
        this.parent = parent;
    }

    public void tick() {
        if (input.attack.clicked || input.menu.clicked) {
            System.exit(1);
        }
    }
}
