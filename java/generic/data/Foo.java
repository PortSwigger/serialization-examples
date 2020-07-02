package data;

import java.io.Serializable;

public class Foo implements Serializable {
    public String str;
    public int num;

    public Foo(String str, int num) {
        this.str = str;
        this.num = num;
    }
}
