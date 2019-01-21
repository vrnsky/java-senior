package me.vrnsky.patterns.FabricMethod;

public class StorageFactory {


    public InfoStorage getStorageByParam(String param) {
        if ("cloud".equalsIgnoreCase(param)) {
            return new CloudStorage();
        } else if ("paper".equalsIgnoreCase(param)) {
            return new PaperStorage();
        }
        throw new IllegalStateException(String.format("%s unknown type of the storage", param));
    }
}
