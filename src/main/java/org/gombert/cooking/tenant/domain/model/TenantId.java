package org.gombert.cooking.tenant.domain.model;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.gombert.cooking.tenant.domain.model.exception.TenantCreationException;


import java.util.UUID;

@ToString(callSuper = false)
@EqualsAndHashCode()
public class TenantId
{
    @Getter(AccessLevel.PUBLIC)
    private UUID id;

    public TenantId(final String tenantId)
    {
        this(UUID.fromString(tenantId));
    }

    public TenantId(final TenantId tenantId) {
        this.id = tenantId.getId();
    }

    public TenantId(final UUID tenantId) throws TenantCreationException {
        this.id = tenantId;
    }
}
