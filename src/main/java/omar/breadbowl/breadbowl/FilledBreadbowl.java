package omar.breadbowl.breadbowl;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FilledBreadbowl extends Item{

    public FilledBreadbowl(Item.Settings settings) {
        super(settings);
    }


    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user){
        ItemStack eaten_stack;
        ItemStack final_stack = stack;
        PlayerEntity playerentity = user instanceof PlayerEntity ? (PlayerEntity) user : null;
        System.out.println("entering finishUsing");

        if (this.isFood()) {
            eaten_stack = user.eatFood(world, stack);
            if (eaten_stack.isEmpty())
            {
                System.out.println("stack emtpy! giving soggy bread bowl");
                final_stack = new ItemStack(Breadbowls.SOGGY_BREAD_BOWL);
            }
            else if (!stack.isEmpty())
            {
//            playerentity.inventory.insertStack(new ItemStack(Items.BREAD));
            }


            return final_stack;
        }
        //can remove !stack.isEmpty() case if soups in breadbowls are unstackable?
        return stack;

    }
}
