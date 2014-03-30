package com.mojang.ld22.entity;

import com.mojang.ld22.crafting.Crafting;
import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.screen.CraftingMenu;

/**
 * Created by SeamusFD on 3/29/14.
 * All rights belong to me!!
 */
public class RoastingSpit extends Furniture{
    public RoastingSpit() {
        super("RoastingOven");
        col = Color.get(-1, 000, 332, 442);
        sprite = 2;
        xr = 3;
        yr = 2;
    }

    public boolean use(Player player, int attackDir) {
        player.game.setMenu(new CraftingMenu(Crafting.roasterRecipes, player));
        return true;
    }
}
