package essentialThaumaturgy.common.init;

import cpw.mods.fml.common.registry.GameRegistry;
import essentialThaumaturgy.common.block.BlockAuraDestructor;
import essentialThaumaturgy.common.block.BlockAuraStabiliser;
import essentialThaumaturgy.common.block.BlockChunkLoader;
import essentialThaumaturgy.common.block.BlockColoredTransparent;
import essentialThaumaturgy.common.block.BlockCrystalDestructor;
import essentialThaumaturgy.common.block.BlockDimensionalTranciever;
import essentialThaumaturgy.common.block.BlockFluxWiper;
import essentialThaumaturgy.common.block.BlockMRUCUAbsorber;
import essentialThaumaturgy.common.block.BlockMRUCUStabilizer;
import essentialThaumaturgy.common.block.BlockMRUGenerator;
import essentialThaumaturgy.common.block.BlockMRUSpreader;
import essentialThaumaturgy.common.block.BlockNodeIrradiator;
import essentialThaumaturgy.common.block.BlockRadiatedAuraNode;
import essentialThaumaturgy.common.block.BlockSimple;
import essentialThaumaturgy.common.block.BlockWandCharger;
import essentialThaumaturgy.common.block.ItemBlockET;
import essentialThaumaturgy.common.core.EssentialThaumaturgy;
import essentialThaumaturgy.common.tile.TileFluxWiper;
import essentialThaumaturgy.common.tile.TileMRUAuraDestructor;
import essentialThaumaturgy.common.tile.TileMRUAuraStabiliser;
import essentialThaumaturgy.common.tile.TileMRUCUAbsorber;
import essentialThaumaturgy.common.tile.TileMRUCUStabilizer;
import essentialThaumaturgy.common.tile.TileMRUChunkLoader;
import essentialThaumaturgy.common.tile.TileMRUCrystalDestructor;
import essentialThaumaturgy.common.tile.TileMRUDimensionalTranciever;
import essentialThaumaturgy.common.tile.TileMRUGenerator;
import essentialThaumaturgy.common.tile.TileMRUSpreader;
import essentialThaumaturgy.common.tile.TileMRUWandCharger;
import essentialThaumaturgy.common.tile.TileNodeIrradiator;
import essentialThaumaturgy.common.tile.TileRadiatedNode;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import DummyCore.Blocks.BlocksRegistry;

public class BlocksInit {
	
	public static Block
	glassChaos,
	glassFrozen,
	infusedStone,
	auraStabiliser,
	chunkLoader,
	auraDestructor,
	dimTranciever,
	crystalDestructor,
	wandCharger,
	generator,
	radiatedNode,
	nodeIrradiator,
	mruSpreader,
	fluxWiper,
	mrucuStabilizer,
	mrucuAbsorber
	;
	
	public static void init()
	{
		glassChaos = registerBlockSimple(BlockColoredTransparent.class,glassChaos,"glassChaos","glass_chaos",1,1,0);
		glassFrozen = registerBlockSimple(BlockColoredTransparent.class,glassFrozen,"glassFrozen","glass_frozen",1,1,0);
		infusedStone = registerBlockSimple(BlockSimple.class,infusedStone,"infusedStone","infusedStone",1,1,0);
		auraStabiliser = registerBlockSimple(BlockAuraStabiliser.class,auraStabiliser,"auraStabiliser","auraStabiliser",1,1,0);
		chunkLoader = registerBlockSimple(BlockChunkLoader.class,chunkLoader,"chunkLoader","chunkLoader",1,1,0);
		auraDestructor = registerBlockSimple(BlockAuraDestructor.class,auraDestructor,"auraDestructor","auraStabiliser",1,1,0);
		dimTranciever = registerBlockSimple(BlockDimensionalTranciever.class,dimTranciever,"dimTranciever","dimTranciever",1,1,0);
		crystalDestructor = registerBlockSimple(BlockCrystalDestructor.class,crystalDestructor,"crystalDestructor","crystalDestructor",1,1,0);
		wandCharger = registerBlockSimple(BlockWandCharger.class,wandCharger,"wandCharger","wandCharger",1,1,0);
		generator = registerBlockSimple(BlockMRUGenerator.class,generator,"generator","generator",1,1,0);
		radiatedNode = registerBlockSimple(BlockRadiatedAuraNode.class,radiatedNode,"radiatedNode","radiatedNode",1,1,0);
		nodeIrradiator = registerBlockSimple(BlockNodeIrradiator.class,nodeIrradiator,"nodeIrradiator","nodeIrradiator",1,1,0);
		mruSpreader = registerBlockSimple(BlockMRUSpreader.class,mruSpreader,"mruSpreader","mruSpreader",1,1,0);
		fluxWiper = registerBlockSimple(BlockFluxWiper.class,fluxWiper,"fluxWiper","fluxWiper",1,1,0);
		mrucuStabilizer = registerBlockSimple(BlockMRUCUStabilizer.class,mrucuStabilizer,"mrucuStabilizer","mrucuStabilizer",1,1,0);
		mrucuAbsorber = registerBlockSimple(BlockMRUCUAbsorber.class,mrucuAbsorber,"mrucuAbsorber","mrucuAbsorber",1,1,0);
		
		GameRegistry.registerTileEntity(TileMRUAuraStabiliser.class, "essenthaum.tileMRUAuraStabiliser");
		GameRegistry.registerTileEntity(TileMRUChunkLoader.class, "essenthaum.tileMRUChunkLoader");
		GameRegistry.registerTileEntity(TileMRUAuraDestructor.class, "essenthaum.tileMRUAuraDestructor");
		GameRegistry.registerTileEntity(TileMRUDimensionalTranciever.class, "essenthaum.tileMRUDimensionalTranciever");
		GameRegistry.registerTileEntity(TileMRUCrystalDestructor.class, "essenthaum.tileMRUCrystalDestructor");
		GameRegistry.registerTileEntity(TileMRUWandCharger.class, "essenthaum.tileMRUWandCharger");
		GameRegistry.registerTileEntity(TileMRUGenerator.class, "essenthaum.tileMRUGenerator");
		GameRegistry.registerTileEntity(TileRadiatedNode.class, "essenthaum.tileRadiatedNode");
		GameRegistry.registerTileEntity(TileNodeIrradiator.class, "essenthaum.tileNodeIrradiator");
		GameRegistry.registerTileEntity(TileMRUSpreader.class, "essenthaum.tileMRUSpreader");
		GameRegistry.registerTileEntity(TileFluxWiper.class, "essenthaum.tileFluxWiper");
		GameRegistry.registerTileEntity(TileMRUCUStabilizer.class, "essenthaum.tileMRUCUStabilizer");
		GameRegistry.registerTileEntity(TileMRUCUAbsorber.class, "essenthaum.tileMRUCUAbsorber");
	}
	
	public static Block registerBlockSimple(Class<? extends Block> c,Block b, String name, String texture, float hardness, float resistance, int opacity)
	{
		try
		{
			b = c.newInstance().setBlockName("essenthaum."+name).setBlockTextureName("essenthaum:"+texture).setResistance(resistance).setHardness(hardness).setLightOpacity(opacity);
			BlocksRegistry.registerBlock(b, name, EssentialThaumaturgy.class, ItemBlockET.class);
			return b;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
