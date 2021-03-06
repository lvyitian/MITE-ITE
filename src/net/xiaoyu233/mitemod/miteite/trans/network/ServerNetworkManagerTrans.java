package net.xiaoyu233.mitemod.miteite.trans.network;

import net.minecraft.Connection;
import net.minecraft.EntityPlayer;
import net.minecraft.INetworkManager;
import net.minecraft.PlayerConnection;
import net.xiaoyu233.fml.asm.annotations.Link;
import net.xiaoyu233.fml.asm.annotations.Marker;
import net.xiaoyu233.fml.asm.annotations.Transform;
import net.xiaoyu233.mitemod.miteite.inventory.container.ContainerForgingTable;
import net.xiaoyu233.mitemod.miteite.network.CPacketStartForging;

@Transform(PlayerConnection.class)
public class ServerNetworkManagerTrans extends Connection {
    @Link
    public EntityPlayer c;

    @Override
    @Marker
    public boolean a() {
        return false;
    }

    @Override
    @Marker
    public INetworkManager getNetManager() {
        return null;
    }

    public void processStartForgingPacket(CPacketStartForging packet){
        if (this.c.bp instanceof ContainerForgingTable){
            ((ContainerForgingTable) this.c.bp).startForging();
        }
    }
}
