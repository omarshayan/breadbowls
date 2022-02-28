package omar.breadbowl.breadbowl;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Breadbowls implements ModInitializer {

    public static final Item BREAD_BOWL = new Breadbowl(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build()));

    public static final Item SOGGY_BREAD_BOWL = new SoggyBreadbowl(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).build()));

    public static final Item BEETROOT_SOUP_BREAD_BOWL = new BeetrootSoupBreadbowl(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()));
    public static final Item MUSHROOM_STEW_BREAD_BOWL = new MushroomStewBreadbowl(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()));
    public static final Item RABBIT_STEW_BREAD_BOWL = new RabbitStewBreadbowl(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build()));
    public static final Item SUSPICIOUS_STEW_BREAD_BOWL = new SuspiciousStewBreadbowl(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build()));
//    public static final Item RABBIT_STEW_BREAD_BOWL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).snack().build()));
//    public static final Item BEETROOT_STEW_BREAD_BOWL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).snack().build()));
//    public static final Item SUSPICIOUS_STEW_BREAD_BOWL = new Item(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).snack().build()));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("breadbowl", "bread_bowl"), BREAD_BOWL);
        Registry.register(Registry.ITEM, new Identifier("breadbowl", "soggy_bread_bowl"), SOGGY_BREAD_BOWL);
        Registry.register(Registry.ITEM, new Identifier("breadbowl", "mushroom_stew_bread_bowl"), MUSHROOM_STEW_BREAD_BOWL);
        Registry.register(Registry.ITEM, new Identifier("breadbowl", "rabbit_stew_bread_bowl"), RABBIT_STEW_BREAD_BOWL);
        Registry.register(Registry.ITEM, new Identifier("breadbowl", "beetroot_soup_bread_bowl"), BEETROOT_SOUP_BREAD_BOWL);
        Registry.register(Registry.ITEM, new Identifier("breadbowl", "suspicious_stew_bread_bowl"), SUSPICIOUS_STEW_BREAD_BOWL);
    }
}


