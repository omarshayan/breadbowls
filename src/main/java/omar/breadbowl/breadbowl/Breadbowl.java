package omar.breadbowl.breadbowl;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Breadbowl extends Item {

    public Breadbowl(Settings settings) {
        super(settings);
    }

//    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
//        if (this.isFood()) {
//            return user.eatFood(world, stack);
//        }
//        return stack;
//    }
}

