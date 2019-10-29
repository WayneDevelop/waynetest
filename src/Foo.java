class Foo {

    private Foo(){
        i=0;
    }
    final int i;
    int j;
    public void doSomething() {
        System.out.println(++j + i);
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.doSomething();
    }
}