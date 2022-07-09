package Singleton;

/**
 * 单例模式--饿汉式
 */
public class hungrySingleton {
    private static hungrySingleton uniqueInstance;
    public hungrySingleton(){

    }
    private static synchronized hungrySingleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new hungrySingleton();
        }
        return uniqueInstance;
    }
}
