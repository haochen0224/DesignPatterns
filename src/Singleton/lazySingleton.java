package Singleton;

/**
 * 单例模式--懒汉式
 */
public class lazySingleton {
    private static lazySingleton uniqueInstance;
    public lazySingleton(){

    }
    private static lazySingleton getUniqueInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new lazySingleton();
        }
        return uniqueInstance;
    }
}
