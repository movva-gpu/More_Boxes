package net.oftl.moreboxes.blocks.entities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.oftl.moreboxes.MoreBoxesMain;
import net.oftl.moreboxes.blocks.ModBlocks;
import net.oftl.moreboxes.blocks.entities.custom.ShulkerLampBlockEntity;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES_REG =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MoreBoxesMain.MOD_ID);

    public static final RegistryObject<BlockEntityType<ShulkerLampBlockEntity>> SHULKER_LAMP_BLOCK_ENTITY_TYPE =
            BLOCK_ENTITY_TYPES_REG.register("shulker_lamp_block_entity",
                    () -> BlockEntityType.Builder.of(ShulkerLampBlockEntity::new,
                            ModBlocks.SHULKER_LAMP.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES_REG.register(eventBus);
    }
}
