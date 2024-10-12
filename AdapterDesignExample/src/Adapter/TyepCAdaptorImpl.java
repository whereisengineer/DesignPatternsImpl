package Adapter;

import Adaptee.HDMIConnect;
import entity.HDMI;
import entity.TypeC;

public class TyepCAdaptorImpl implements TypeCAdaptor {

    private HDMIConnect hdmiConnect;

    public TyepCAdaptorImpl(HDMIConnect hdmiConnect){
        this.hdmiConnect = hdmiConnect;
    }

    @Override
    public TypeC connectTypeC() {
        hdmiConnect.hdmiConnecter(new HDMI());
        //do some logic
        return new TypeC();

    }
}
