package net.sacredlabyrinth.Phaed.PreciousStones.vectors;

import net.sacredlabyrinth.Phaed.PreciousStones.entries.BlockTypeEntry;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;

/**
 * @author phaed
 */
public class GriefBlock extends AbstractVec
{
    private BlockTypeEntry type;
    private String signText = "";
    private boolean empty = false;

    /**
     * @param x
     * @param y
     * @param z
     * @param world
     * @param typeId
     * @param data
     */
    public GriefBlock(int x, int y, int z, String world, BlockTypeEntry type)
    {
        super(x, y, z, world);
        this.type = type;
    }

    /**
     * @param loc
     * @param typeId
     * @param data
     */
    public GriefBlock(Location loc, BlockTypeEntry type)
    {
        super(loc.getBlockX(), loc.getBlockY(), loc.getBlockZ(), loc.getWorld().getName());
        this.type = type;
    }

    /**
     * @param block
     */
    public GriefBlock(Block block)
    {
        super(block.getX(), block.getY(), block.getZ(), block.getWorld().getName());
        this.type = new BlockTypeEntry(block.getTypeId(), block.getData());
    }

    /**
     * @param block
     */
    public GriefBlock(BlockState state)
    {
        super(state.getX(), state.getY(), state.getZ(), state.getWorld().getName());
        this.type = new BlockTypeEntry(state.getTypeId(), state.getRawData());
        this.empty = true;
    }

    /**
     * @return the typeId
     */
    public int getTypeId()
    {
        return type.getTypeId();
    }

    /**
     * @return the data
     */
    public byte getData()
    {
        return type.getData();
    }

    /**
     * @return the signText
     */
    public String getSignText()
    {
        return signText;
    }

    /**
     * @param signText the signText to set
     */
    public void setSignText(String signText)
    {
        this.signText = signText;
    }

    public boolean isEmpty()
    {
        return empty;
    }

    public void setEmpty(boolean empty)
    {
        this.empty = empty;
    }
}
