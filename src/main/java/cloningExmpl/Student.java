package cloningExmpl;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private Address addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return this.name+" | "+this.addr.getCity();
    }
}
