package me.vrnsky.patterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeStorage {

    private List<Prototypeable> storage;

    public PrototypeStorage() {
        this.storage = new ArrayList<>(100);
    }

    public boolean registerPrototype(Prototypeable prototypeable) {
        return this.storage.add(prototypeable);
    }

    public boolean unregisterPrototype(Prototypeable prototypeable) {
        if (this.storage.contains(prototypeable)) {
            return this.storage.remove(prototypeable);
        }
        return false;
    }

    public Prototypeable get(int index) {
        return this.storage.get(index);
    }
}
