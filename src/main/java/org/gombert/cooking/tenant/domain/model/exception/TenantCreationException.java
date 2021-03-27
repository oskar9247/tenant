package org.gombert.cooking.tenant.domain.model.exception;

public class TenantCreationException extends RuntimeException
{
    public TenantCreationException(final String message)
    {
        super(message);
    }
}
