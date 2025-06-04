package com.smoothresources.smoothusersapi.user;

import com.smoothresources.smoothusersapi.service.Destination;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserService {

    /**
     * Creates a user. The user will be saved in the database, not in the cache.
     * @param user
     */
    void create(User user);

    /**
     * Updates a user.
     * Use Destination to specify where the user should be updated.
     * @param user
     * @param destinations
     */
    void update(User user, Destination... destinations);

    /**
     * Checks if a user exists by their UUID.
     * @param uuid
     * @return true if the user exists, false if not.
     */
    boolean containsByUUID(UUID uuid);

    /**
     * Checks if a user exists by their username.
     * The username is case-insensitive.
     * @param username
     * @return true if the user exists, false if not.
     */
    boolean containsByUsername(String username);

    /**
     * Gets a (optional) user by their UUID.
     * @param uuid
     * @return the user if found, empty if not.
     */
    Optional<User> getUserByUUID(UUID uuid);

    /**
     * Gets a (optional) user by their username.
     * The username is case-insensitive.
     * @param username
     * @return the user if found, empty if not.
     */
    Optional<User> getUserByUsername(String username);

    /**
     * Deletes a user by their UUID.
     * @param uuid
     * @param destinations
     */
    void deleteByUUID(UUID uuid, Destination... destinations);

    /**
     * Deletes a user by their username.
     * The username is case-insensitive.
     * @param username
     * @param destinations
     */
    void deleteByUsername(String username, Destination... destinations);

    /**
     * Checks if a user exists in the cache by their UUID.
     * @param uuid
     * @return true if the user exists in the cache, false if not.
     */
    boolean cacheContainsByUUID(UUID uuid);

    /**
     * Checks if a user exists in the cache by their username.
     * The username is case-insensitive.
     * @param username
     * @return true if the user exists in the cache, false if not.
     */
    boolean cacheContainsByUsername(String username);

    /**
     * Load a user to the cache.
     * @param user
     */
    void loadToCache(User user);

    /**
     * Remove the time to live from a user in the cache by their UUID.
     * @param uuid
     * @return true if the user was found and the time to live was removed, false if the user was not found.
     */
    boolean removeTTLFromCacheByUUID(UUID uuid);

    /**
     * Remove the time to live from a user in the cache by their username.
     * The username is case-insensitive.
     * @param username
     * @return true if the user was found and the time to live was removed, false if the user was not found.
     */
    boolean removeTTLFromCacheByUsername(String username);

    /**
     * Set the time to live of a user in the cache by their UUID.
     * @param uuid
     * @param seconds
     * @return true if the user was found and the time to live was set, false if the user was not found.
     */
    boolean setTTLOfCacheByUUID(UUID uuid, int seconds);

    /**
     * Set the time to live of a user in the cache by their username.
     * The username is case-insensitive.
     * @param username
     * @param seconds
     * @return true if the user was found and the time to live was set, false if the user was not found.
     */
    boolean setTTLOfCacheByUsername(String username, int seconds);

    /**
     * Get all users from the cache.
     * The users may be outdated from a seconds ago (this is useful for example to tab completion).
     * @param forceUpdate if true, the users will be updated before getting them.
     * @return a list of users.
     */
    List<User> getAllFromCache(boolean forceUpdate);
}
