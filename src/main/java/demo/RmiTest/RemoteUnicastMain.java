package demo.RmiTest;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RemoteUnicastMain {

    public static void main(String[] args) throws Exception{

        LocateRegistry.createRegistry(1099);
        // 以下是向LocateRegistry注册（绑定/重绑定）RMI Server实现。
        RemoteUnicastServiceImpl remoteService = new RemoteUnicastServiceImpl("server_kvl");
        // 通过java 名字服务技术，可以讲具体的RMI Server实现绑定一个访问路径。注册到LocateRegistry中
        Naming.rebind("server_kvl", remoteService);


    }

}
