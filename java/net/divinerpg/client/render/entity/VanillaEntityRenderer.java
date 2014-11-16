package net.divinerpg.client.render.entity;

import net.divinerpg.api.entity.EntityStats;
import net.divinerpg.blocks.vanilla.container.tile_entity.TileEntityAltarOfCorruption;
import net.divinerpg.blocks.vanilla.container.tile_entity.TileEntityAyeracoBeam;
import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderDivineBoss;
import net.divinerpg.client.render.RenderDivineMob;
import net.divinerpg.client.render.RenderIconProjectile;
import net.divinerpg.client.render.RenderProjectile;
import net.divinerpg.client.render.RenderSizeable;
import net.divinerpg.client.render.block.RenderAltarOfCorruption;
import net.divinerpg.client.render.block.RenderAyeracoBeam;
import net.divinerpg.client.render.block.RenderStatue;
import net.divinerpg.client.render.block.TileEntityStatue;
import net.divinerpg.client.render.block.item_renderer.RenderStatueItem;
import net.divinerpg.client.render.entity.vanilla.RenderHellPig;
import net.divinerpg.client.render.entity.vanilla.RenderModBiped;
import net.divinerpg.client.render.entity.vanilla.model.ModelAncientEntity;
import net.divinerpg.client.render.entity.vanilla.model.ModelAridWarrior;
import net.divinerpg.client.render.entity.vanilla.model.ModelAyeraco;
import net.divinerpg.client.render.entity.vanilla.model.ModelCrab;
import net.divinerpg.client.render.entity.vanilla.model.ModelCrawler;
import net.divinerpg.client.render.entity.vanilla.model.ModelDramcryx;
import net.divinerpg.client.render.entity.vanilla.model.ModelEnderTriplets;
import net.divinerpg.client.render.entity.vanilla.model.ModelEye;
import net.divinerpg.client.render.entity.vanilla.model.ModelFrost;
import net.divinerpg.client.render.entity.vanilla.model.ModelGlacon;
import net.divinerpg.client.render.entity.vanilla.model.ModelJackOMan;
import net.divinerpg.client.render.entity.vanilla.model.ModelJungleBat;
import net.divinerpg.client.render.entity.vanilla.model.ModelKingCrab;
import net.divinerpg.client.render.entity.vanilla.model.ModelKingScorcher;
import net.divinerpg.client.render.entity.vanilla.model.ModelRainbour;
import net.divinerpg.client.render.entity.vanilla.model.ModelRotatick;
import net.divinerpg.client.render.entity.vanilla.model.ModelScorcher;
import net.divinerpg.client.render.entity.vanilla.model.ModelShark;
import net.divinerpg.client.render.entity.vanilla.model.ModelWatcher;
import net.divinerpg.client.render.entity.vanilla.model.ModelWhale;
import net.divinerpg.client.render.entity.vanilla.model.ModelWildFire;
import net.divinerpg.entities.vanilla.EntityAncientEntity;
import net.divinerpg.entities.vanilla.EntityAridWarrior;
import net.divinerpg.entities.vanilla.EntityAyeracoBlue;
import net.divinerpg.entities.vanilla.EntityAyeracoGreen;
import net.divinerpg.entities.vanilla.EntityAyeracoPurple;
import net.divinerpg.entities.vanilla.EntityAyeracoRed;
import net.divinerpg.entities.vanilla.EntityAyeracoYellow;
import net.divinerpg.entities.vanilla.EntityBabyCrab;
import net.divinerpg.entities.vanilla.EntityCaveCrawler;
import net.divinerpg.entities.vanilla.EntityCaveclops;
import net.divinerpg.entities.vanilla.EntityCorruptedDramcryx;
import net.divinerpg.entities.vanilla.EntityCrab;
import net.divinerpg.entities.vanilla.EntityCyclops;
import net.divinerpg.entities.vanilla.EntityDesertCrawler;
import net.divinerpg.entities.vanilla.EntityEnderSpider;
import net.divinerpg.entities.vanilla.EntityEnderTriplets;
import net.divinerpg.entities.vanilla.EntityEnderWatcher;
import net.divinerpg.entities.vanilla.EntityFrost;
import net.divinerpg.entities.vanilla.EntityGlacon;
import net.divinerpg.entities.vanilla.EntityHellPig;
import net.divinerpg.entities.vanilla.EntityHellSpider;
import net.divinerpg.entities.vanilla.EntityIceMan;
import net.divinerpg.entities.vanilla.EntityJackOMan;
import net.divinerpg.entities.vanilla.EntityJungleBat;
import net.divinerpg.entities.vanilla.EntityJungleDramcryx;
import net.divinerpg.entities.vanilla.EntityKingCrab;
import net.divinerpg.entities.vanilla.EntityKingOfScorchers;
import net.divinerpg.entities.vanilla.EntityMiner;
import net.divinerpg.entities.vanilla.EntityNetherWatcher;
import net.divinerpg.entities.vanilla.EntityRainbour;
import net.divinerpg.entities.vanilla.EntityRotatick;
import net.divinerpg.entities.vanilla.EntityScorcher;
import net.divinerpg.entities.vanilla.EntityShark;
import net.divinerpg.entities.vanilla.EntityTheEye;
import net.divinerpg.entities.vanilla.EntityWhale;
import net.divinerpg.entities.vanilla.EntityWildFire;
import net.divinerpg.entities.vanilla.projectile.EntityBowheadAnchor;
import net.divinerpg.entities.vanilla.projectile.EntityCaveRock;
import net.divinerpg.entities.vanilla.projectile.EntityCrabAnchor;
import net.divinerpg.entities.vanilla.projectile.EntityCyclopsianStaff;
import net.divinerpg.entities.vanilla.projectile.EntityDeath;
import net.divinerpg.entities.vanilla.projectile.EntityFrostShot;
import net.divinerpg.entities.vanilla.projectile.EntityGoldenFury;
import net.divinerpg.entities.vanilla.projectile.EntityMaelstorm;
import net.divinerpg.entities.vanilla.projectile.EntityModSnowball;
import net.divinerpg.entities.vanilla.projectile.EntityScythe;
import net.divinerpg.entities.vanilla.projectile.EntitySharkAnchor;
import net.divinerpg.entities.vanilla.projectile.EntityShuriken;
import net.divinerpg.entities.vanilla.projectile.EntityVileStorm;
import net.divinerpg.entities.vanilla.projectile.EntityWatcherShot;
import net.divinerpg.utils.Util;
import net.divinerpg.utils.blocks.VanillaBlocks;
import net.divinerpg.utils.items.VanillaItemsWeapons;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.init.Items;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class VanillaEntityRenderer {

	private static EntityResourceLocation x;
	private static EntityStats s;

	public static void init(){
		RenderingRegistry.registerEntityRenderingHandler(EntityShuriken.class, new RenderIconProjectile(VanillaItemsWeapons.shuriken));
		RenderingRegistry.registerEntityRenderingHandler(EntityModSnowball.class, new RenderProjectile(x.snowball));
		RenderingRegistry.registerEntityRenderingHandler(EntityVileStorm.class, new RenderIconProjectile(VanillaItemsWeapons.vileStorm));
		RenderingRegistry.registerEntityRenderingHandler(EntityScythe.class, new RenderProjectile(x.scytheProjectile));
		RenderingRegistry.registerEntityRenderingHandler(EntityDeath.class, new RenderProjectile(x.death));
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveRock.class, new RenderProjectile(x.cave));
		RenderingRegistry.registerEntityRenderingHandler(EntityWatcherShot.class, new RenderProjectile(x.watcherShot));
		RenderingRegistry.registerEntityRenderingHandler(EntityCyclopsianStaff.class, new RenderProjectile(x.cyclopsShot));
		RenderingRegistry.registerEntityRenderingHandler(EntityMaelstorm.class, new RenderProjectile(x.maelstorm));
		RenderingRegistry.registerEntityRenderingHandler(EntityCrabAnchor.class, new RenderProjectile(x.crabAnchor));
		RenderingRegistry.registerEntityRenderingHandler(EntitySharkAnchor.class, new RenderProjectile(x.bowheadAnchor));
		RenderingRegistry.registerEntityRenderingHandler(EntityBowheadAnchor.class, new RenderProjectile(x.bowheadAnchor));
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldenFury.class, new RenderIconProjectile(Items.gold_nugget));

		RenderingRegistry.registerEntityRenderingHandler(EntityEnderWatcher.class, new RenderDivineMob(new ModelWatcher(), 0.0F, x.enderWatcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderSizeable(new ModelCrab(), 0.0F, 1.0F, x.crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityBabyCrab.class, new RenderSizeable(new ModelCrab(), 0.0F, 0.5F, x.crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityKingCrab.class, new RenderSizeable(new ModelKingCrab(), 0.0F, 2.6F, x.kingCrab));
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, x.caveCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, x.desertCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityJungleDramcryx.class, new RenderDivineMob(new ModelDramcryx(), 0.0F, x.jungleDramcryx));
		RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderSizeable(new ModelBiped(), 0.0F, 2.0F, x.cyclops));
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveclops.class, new RenderSizeable(new ModelBiped(), 0.0F, 2.0F, x.caveclops));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderSizeable(new ModelWhale(), 0.0F, 5.0F, x.whale));
		RenderingRegistry.registerEntityRenderingHandler(EntityScorcher.class, new RenderSizeable(new ModelScorcher(), 0.0F, 1.8F, x.scorcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityHellSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 1.2F ,x.hellSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 0.5F, x.enderSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderTriplets.class, new RenderDivineMob(new ModelEnderTriplets(), 0.0F, x.enderTriplets));	
		RenderingRegistry.registerEntityRenderingHandler(EntityAridWarrior.class, new RenderDivineMob(new ModelAridWarrior(), 0.0F, x.aridWarrior));
		RenderingRegistry.registerEntityRenderingHandler(EntityCorruptedDramcryx.class, new RenderSizeable(new ModelDramcryx(), 0.0F, 1.5F, x.caveDramcryx));
		RenderingRegistry.registerEntityRenderingHandler(EntityTheEye.class, new RenderDivineMob(new ModelEye(), 0.0F, x.theEye));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrost.class, new RenderDivineMob(new ModelFrost(), 0.0F, x.frost));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceMan.class, new RenderDivineMob(new ModelBiped(), 0.0F, x.iceMan));
		RenderingRegistry.registerEntityRenderingHandler(EntityRainbour.class, new RenderDivineMob(new ModelRainbour(), 0.0F, x.rainbour));
		RenderingRegistry.registerEntityRenderingHandler(EntityRotatick.class, new RenderDivineMob(new ModelRotatick(), 0.0F, x.rotatick));
		RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderDivineMob(new ModelShark(), 0.0F, x.shark));
		RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderDivineMob(new ModelWildFire(), 0.0F, x.wildFire));
		RenderingRegistry.registerEntityRenderingHandler(EntityGlacon.class, new RenderDivineMob(new ModelGlacon(), 0.0F, x.glacon));
		RenderingRegistry.registerEntityRenderingHandler(EntityMiner.class, new RenderModBiped(new ModelZombie(), x.miner));
		RenderingRegistry.registerEntityRenderingHandler(EntityJackOMan.class, new RenderModBiped(new ModelJackOMan(), x.jackOMan)); 
		RenderingRegistry.registerEntityRenderingHandler(EntityHellPig.class, new RenderHellPig(new ModelPig()));
		RenderingRegistry.registerEntityRenderingHandler(EntityJungleBat.class, new RenderSizeable(new ModelJungleBat(), 0.0F, 0.5F, x.jungleBat));

		RenderingRegistry.registerEntityRenderingHandler(EntityKingOfScorchers.class, new RenderDivineBoss(new ModelKingScorcher(), 0.0F, x.kingOfScorchers, s.scorcherKingBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherWatcher.class, new RenderDivineBoss(new ModelWatcher(), 0.0F, 4.5F, x.netherWatcher, s.netherWatcherBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoBlue.class, new RenderDivineBoss(new ModelAyeraco(), 0.0F, x.ayeraco_Blue, s.ayeracoBlueBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoGreen.class, new RenderDivineBoss(new ModelAyeraco(), 0.0F, x.ayeraco_Green, s.ayeracoGreenBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoPurple.class, new RenderDivineBoss(new ModelAyeraco(), 0.0F, x.ayeraco_Purple, s.ayeracoPurpleBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoRed.class, new RenderDivineBoss(new ModelAyeraco(), 0.0F, x.ayeraco_Red, s.ayeracoRedBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoYellow.class, new RenderDivineBoss(new ModelAyeraco(), 0.0F, x.ayeraco_Yellow, s.ayeracoYellowBossID));
		RenderingRegistry.registerEntityRenderingHandler(EntityAncientEntity.class, new RenderDivineBoss(new ModelAncientEntity(), 0.0F, 5.0F, x.ancient, s.ancientEntityBossID));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostShot.class, new RenderProjectile(x.frostShot));
		
		Util.registerItemRenderer(VanillaBlocks.KingStatue, new RenderStatueItem(VanillaBlocks.KingStatue));
		Util.registerItemRenderer(VanillaBlocks.AncientStatue, new RenderStatueItem(VanillaBlocks.AncientStatue));
		Util.registerItemRenderer(VanillaBlocks.AyeracoStatue, new RenderStatueItem(VanillaBlocks.AyeracoStatue));
		Util.registerItemRenderer(VanillaBlocks.TDemonStatue, new RenderStatueItem(VanillaBlocks.TDemonStatue));
		Util.registerItemRenderer(VanillaBlocks.VamacheronStatue, new RenderStatueItem(VanillaBlocks.VamacheronStatue));
		Util.registerItemRenderer(VanillaBlocks.DensosStatue, new RenderStatueItem(VanillaBlocks.DensosStatue));
		Util.registerItemRenderer(VanillaBlocks.DexStatue, new RenderStatueItem(VanillaBlocks.DexStatue));
		Util.registerItemRenderer(VanillaBlocks.DramixStatue, new RenderStatueItem(VanillaBlocks.DramixStatue));
		//DivineAPI.registerItemRenderer(VanillaBlocks.ParasectaStatue, new RenderStatueItem(VanillaBlocks.ParasectaStatue));
		Util.registerItemRenderer(VanillaBlocks.SoulFiendStatue, new RenderStatueItem(VanillaBlocks.SoulFiendStatue));
		Util.registerItemRenderer(VanillaBlocks.WatcherStatue, new RenderStatueItem(VanillaBlocks.WatcherStatue));
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStatue.class, new RenderStatue());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAyeracoBeam.class, new RenderAyeracoBeam());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAltarOfCorruption.class, new RenderAltarOfCorruption());

	}
}