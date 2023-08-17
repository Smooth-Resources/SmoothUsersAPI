package net.smoothplugins.smoothusersapi.user;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class User {

    @SerializedName("_id")
    private final UUID uuid;
    private String username;
    private String lowerCaseUsername;

    public User(UUID uuid, String username) {
        this.uuid = uuid;
        this.username = username;
    }

    public void updateUsername(String username) {
        this.username = username;
        this.lowerCaseUsername = username.toLowerCase();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public String getLowerCaseUsername() {
        return lowerCaseUsername;
    }
}
