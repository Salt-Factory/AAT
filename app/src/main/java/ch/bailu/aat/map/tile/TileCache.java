package ch.bailu.aat.map.tile;

import org.mapsforge.core.model.Tile;

import java.io.Closeable;

import ch.bailu.aat.services.ServiceContext;
import ch.bailu.aat.services.cache.TileStackObject;

public class TileCache implements Closeable {


    public static final TileCache NULL = new TileCache();


    public TileStackObject get(String string) {
        return null;
    }


    public TileStackObject get(Tile mt) {
        return null;
    }


    public void put(TileStackObject handle) {}

    @Override
    public void close() {}


    public void reDownloadTiles(ServiceContext sc) {}
    public void reset() {}
    public void setCapacity(int capacity) {}

    public int size() {return 0;}
}
