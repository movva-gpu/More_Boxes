package net.oftl.moreboxes.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oftl.moreboxes.MoreBoxesMain;
import net.oftl.moreboxes.blocks.custom.ShulkerLampBlock;
import net.oftl.moreboxes.items.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS_REGISTER =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreBoxesMain.MOD_ID);

    public static final RegistryObject<Block> SHULKER_LAMP = registerBlock("test_shulker",
            () -> new ShulkerLampBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK)
                    .lightLevel(state -> state.getValue(ShulkerLampBlock.LIT) ? 15 : 0)), CreativeModeTab.TAB_REDSTONE);

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> sup, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS_REGISTER.register(name, sup);
        registerBlockItem(toReturn, name, tab);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(RegistryObject<T> block, String name, CreativeModeTab tab) {
        return ModItems.ITEMS_REGISTER.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS_REGISTER.register(eventBus);
    }
}
