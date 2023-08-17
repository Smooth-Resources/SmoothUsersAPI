package net.smoothplugins.smoothusersapi.user;

import net.smoothplugins.smoothusersapi.service.Destination;

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
     * @return
     */
    boolean containsByUUID(UUID uuid);

    /**
     * Checks if a user exists by their username.
     * The username is case-insensitive.
     * @param username
     * @return
     */
    boolean containsByUsername(String username);

    /**
     * Gets a (optional) user by their UUID.
     * @param uuid
     * @return
     */
    Optional<User> getUserByUUID(UUID uuid);

    /**
     * Gets a (optional) user by their username.
     * The username is case-insensitive.
     * @param username
     * @return
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
}
