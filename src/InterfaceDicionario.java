import java.rmi.Remote;

public interface InterfaceDicionario extends Remote {

    public String traduzir (String palavra) throws java.rmi.RemoteException;
    
}
