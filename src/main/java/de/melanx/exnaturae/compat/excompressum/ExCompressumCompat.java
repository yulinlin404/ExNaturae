package de.melanx.exnaturae.compat.excompressum;

import de.melanx.exnaturae.item.DummyItem;
import de.melanx.exnaturae.item.crook.BotanyCrook;
import de.melanx.exnaturae.item.hammer.BotanyHammer;
import de.melanx.exnaturae.item.hammer.ElementiumHammer;
import de.melanx.exnaturae.item.hammer.TerrasteelHammer;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;

public class ExCompressumCompat {

    public static final String MODID = "excompressum";

    public static Item makeCompressedCrook(float attackDamage, float attackSpeed, IItemTier tier, int mana) {
        if (isExCompressumLoaded()) {
            return new BotanyCrook(attackDamage, attackSpeed, tier, mana, true);
        } else {
            return new DummyItem(MODID);
        }
    }

    public static Item makeCompressedHammer(float attackDamage, float attackSpeed, IItemTier tier, int mana) {
        if (isExCompressumLoaded()) {
            return new BotanyHammer(attackDamage, attackSpeed, tier, mana, true);
        } else {
            return new DummyItem(MODID);
        }
    }

    public static Item makeCompressedElementiumHammer(float attackDamage, float attackSpeed, IItemTier tier, int mana) {
        if (isExCompressumLoaded()) {
            return new ElementiumHammer(attackDamage, attackSpeed, tier, mana, true);
        } else {
            return new DummyItem(MODID);
        }
    }

    public static Item makeCompressedTerraHammer(float attackDamage, float attackSpeed, IItemTier tier, int mana) {
        if (isExCompressumLoaded()) {
            return new TerrasteelHammer(attackDamage, attackSpeed, tier, mana, true);
        } else {
            return new DummyItem(MODID);
        }
    }

    public static boolean isExCompressumLoaded() {
        return false; // ModList.get().isLoaded(MODID); TODO re-add when I have textures
    }
}
