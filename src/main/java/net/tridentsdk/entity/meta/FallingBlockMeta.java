package net.tridentsdk.entity.meta;

import net.tridentsdk.base.Vector;

/**
 * @author TridentSDK
 * @since 0.5-alpha
 */
// TODO - documentation
public interface FallingBlockMeta extends EntityMeta {

    Vector getSpawnPosition();

    void setSpawnPosition(Vector vector);

}
