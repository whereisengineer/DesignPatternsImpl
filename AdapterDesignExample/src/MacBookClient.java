import Adaptee.HDMIConnect;
import Adapter.TyepCAdaptorImpl;
import Adapter.TypeCAdaptor;

public class MacBookClient {
    public void doConnect(){
        //here it will talk to adaptor to reuse hdmi connect
        TypeCAdaptor adaptor = new TyepCAdaptorImpl(new HDMIConnect());
        adaptor.connectTypeC();
        System.out.println("type c connected successfully");

    }
}
