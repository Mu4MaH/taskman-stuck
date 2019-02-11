package org.alex.api.repository;

import org.jetbrains.annotations.NotNull;

public interface IAccessControlList {
    String getObjectACL(@NotNull String uidWhere);

    void setObjectACL(@NotNull String uidWhere, @NotNull String uidWho);
}
