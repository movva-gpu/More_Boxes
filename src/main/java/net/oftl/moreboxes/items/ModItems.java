package net.oftl.moreboxes.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oftl.moreboxes.MoreBoxesMain;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS_REGISTER =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreBoxesMain.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS_REGISTER.register(eventBus);
    }
}
