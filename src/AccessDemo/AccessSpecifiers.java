package AccessDemo;

class SingletonClassDriver {
    public static void main(String[] args) {

        SingletonClass obj = SingletonClass.getObject();
        SingletonClass obj1 = SingletonClass.getObject();
        System.out.println(obj);
        System.out.println(obj1);
    }
} class SingletonClass {
    public static SingletonClass obj = null;
    private SingletonClass() {
    }
    public static SingletonClass getObject() {
        if (obj == null) {
            obj = new SingletonClass();
        }
        return obj;
    }
}
