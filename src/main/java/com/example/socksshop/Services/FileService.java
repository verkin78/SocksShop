package com.example.socksshop.Services;

public interface FileService {

    boolean saveFileSocks(String json);

    String readFileSocks();

    boolean cleanDataFileSocks();
}
