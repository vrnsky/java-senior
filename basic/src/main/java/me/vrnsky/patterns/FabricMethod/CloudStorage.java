package me.vrnsky.patterns.FabricMethod;

import java.util.ArrayList;
import java.util.List;

public class CloudStorage implements InfoStorage {

    private List<SaveableData> cloud;

    public CloudStorage() {
        this.cloud = new ArrayList<>();
    }

    @Override
    public void save(SaveableData data) {
        cloud.add(data);
    }
}
