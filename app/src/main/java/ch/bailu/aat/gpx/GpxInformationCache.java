package ch.bailu.aat.gpx;

import ch.bailu.aat.dispatcher.OnContentUpdatedInterface;

public class GpxInformationCache {
    public GpxInformation info;
    public int infoID;


    public GpxInformationCache() {
        reset();
    }


    public void set(int _infoID, GpxInformation _info) {
        info = _info;
        infoID = _infoID;
    }


    public void reset() {
        set(InfoID.UNSPECIFIED, GpxInformation.NULL);
    }


    public void letUpdate(OnContentUpdatedInterface obj) {
        obj.onContentUpdated(infoID, info);
    }
}
