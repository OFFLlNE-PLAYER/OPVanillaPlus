package net.offllneplayer.opvanillaplus.method.furnaces;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.entity.BlockEntity;

public class FurnacesProgressBar_SuperMethod {

/*--------------------------------------------------------------------------------------------*/
	public class FurnacesProgressBar0_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") == 0;
	}
}
	/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar05_Method {
		public static boolean execute(LevelAccessor world, double x, double y, double z) {
			boolean IsProgressInThisRange = false;
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 1 && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 500) {
				IsProgressInThisRange = true;
			}
			return IsProgressInThisRange;
		}
	}

/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar10_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 1000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}

/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar15_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 1001 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 1500) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar20_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 1501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 2000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar25_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 2001 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 2500) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar30_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 2501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 3000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar35_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 3001 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 3500) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar40_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 3501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 4000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar45_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 4001 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 4500) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar50_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 4501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 5000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar55_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 5001 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 5500) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar60_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 5501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 6000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar65_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 6001 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 6500) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar70_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 6501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 7000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar75_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 7001 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 7500) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar80_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 7501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 8000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar85_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 8001 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 8500) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar90_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 8501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 9000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
	public class FurnacesProgressBar95_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 9001 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 9500) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/
public class FurnacesProgressBar100_Method {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean IsProgressInThisRange = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") >= 9501 && new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getDouble(tag);
				return -1;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "NBT_Furnaces_Progress") <= 10000) {
			IsProgressInThisRange = true;
		}
		return IsProgressInThisRange;
	}
}
/*--------------------------------------------------------------------------------------------*/

}
