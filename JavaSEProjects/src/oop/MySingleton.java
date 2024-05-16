package oop;

public class MySingleton {
    // 该实例必须是static
    private static MySingleton instance;
    // 单例模式要求构造器私有
    private MySingleton() {}

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }

        return instance;
    }

}
