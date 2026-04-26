package Demo;

public interface PrinterPrx extends com.zeroc.Ice.ObjectPrx
{
    void printString(String s);
    void printReverse(String s);
    void printUpper(String s);
    int getStringLength(String s);

    default void printString(String s, java.util.Map<String, String> context)
    {
        _iceI_printStringAsync(s, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> printStringAsync(String s)
    {
        return _iceI_printStringAsync(s, null, false);
    }

    default java.util.concurrent.CompletableFuture<Void> printStringAsync(String s, java.util.Map<String, String> context)
    {
        return _iceI_printStringAsync(s, context, false);
    }

    default void printReverse(String s, java.util.Map<String, String> context)
    {
        _iceI_printReverseAsync(s, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> printReverseAsync(String s)
    {
        return _iceI_printReverseAsync(s, null, false);
    }

    default java.util.concurrent.CompletableFuture<Void> printReverseAsync(String s, java.util.Map<String, String> context)
    {
        return _iceI_printReverseAsync(s, context, false);
    }

    default void printUpper(String s, java.util.Map<String, String> context)
    {
        _iceI_printUpperAsync(s, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> printUpperAsync(String s)
    {
        return _iceI_printUpperAsync(s, null, false);
    }

    default java.util.concurrent.CompletableFuture<Void> printUpperAsync(String s, java.util.Map<String, String> context)
    {
        return _iceI_printUpperAsync(s, context, false);
    }

    default int getStringLength(String s, java.util.Map<String, String> context)
    {
        return _iceI_getStringLengthAsync(s, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Integer> getStringLengthAsync(String s)
    {
        return _iceI_getStringLengthAsync(s, null, false);
    }

    default java.util.concurrent.CompletableFuture<Integer> getStringLengthAsync(String s, java.util.Map<String, String> context)
    {
        return _iceI_getStringLengthAsync(s, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_printStringAsync(String iceP_s, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "printString", null, sync, null);
        f.invoke(true, context, null, ostr -> {
            ostr.writeString(iceP_s);
        }, null);
        return f;
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_printReverseAsync(String iceP_s, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "printReverse", null, sync, null);
        f.invoke(true, context, null, ostr -> {
            ostr.writeString(iceP_s);
        }, null);
        return f;
    }

    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_printUpperAsync(String iceP_s, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "printUpper", null, sync, null);
        f.invoke(true, context, null, ostr -> {
            ostr.writeString(iceP_s);
        }, null);
        return f;
    }

    default com.zeroc.IceInternal.OutgoingAsync<Integer> _iceI_getStringLengthAsync(String iceP_s, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Integer> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "getStringLength", null, sync, null);
        f.invoke(true, context, null, ostr -> {
            ostr.writeString(iceP_s);
        }, istr -> {
            int ret;
            ret = istr.readInt();
            return ret;
        });
        return f;
    }

    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx b)
    {
        if(b == null)
        {
            return null;
        }
        if(b instanceof PrinterPrx)
        {
            return (PrinterPrx)b;
        }
        if(b.ice_isA(ice_staticId()))
        {
            return _iceI_PrinterPrxI.fromObjectPrx(b);
        }
        return null;
    }

    static PrinterPrx checkedCast(com.zeroc.Ice.ObjectPrx b, String f)
    {
        if(b == null)
        {
            return null;
        }
        com.zeroc.Ice.ObjectPrx bb = b.ice_facet(f);
        try
        {
            if(bb.ice_isA(ice_staticId()))
            {
                return _iceI_PrinterPrxI.fromObjectPrx(bb);
            }
        }
        catch(com.zeroc.Ice.FacetNotExistException ex)
        {
        }
        return null;
    }

    static PrinterPrx uncheckedCast(com.zeroc.Ice.ObjectPrx b)
    {
        if(b == null)
        {
            return null;
        }
        return _iceI_PrinterPrxI.fromObjectPrx(b);
    }

    static PrinterPrx uncheckedCast(com.zeroc.Ice.ObjectPrx b, String f)
    {
        if(b == null)
        {
            return null;
        }
        return _iceI_PrinterPrxI.fromObjectPrx(b.ice_facet(f));
    }

    static String ice_staticId()
    {
        return "::Demo::Printer";
    }

    @Override
    default PrinterPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (PrinterPrx)_ice_context(newContext);
    }

    @Override
    default PrinterPrx ice_adapterId(String newAdapterId)
    {
        return (PrinterPrx)_ice_adapterId(newAdapterId);
    }

    @Override
    default PrinterPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (PrinterPrx)_ice_endpoints(newEndpoints);
    }

    @Override
    default PrinterPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (PrinterPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    @Override
    default PrinterPrx ice_invocationTimeout(int newTimeout)
    {
        return (PrinterPrx)_ice_invocationTimeout(newTimeout);
    }

    @Override
    default PrinterPrx ice_connectionCached(boolean newCache)
    {
        return (PrinterPrx)_ice_connectionCached(newCache);
    }

    @Override
    default PrinterPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (PrinterPrx)_ice_endpointSelection(newType);
    }

    @Override
    default PrinterPrx ice_secure(boolean b)
    {
        return (PrinterPrx)_ice_secure(b);
    }

    @Override
    default PrinterPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (PrinterPrx)_ice_encodingVersion(e);
    }

    @Override
    default PrinterPrx ice_preferSecure(boolean b)
    {
        return (PrinterPrx)_ice_preferSecure(b);
    }

    @Override
    default PrinterPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (PrinterPrx)_ice_router(router);
    }

    @Override
    default PrinterPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (PrinterPrx)_ice_locator(locator);
    }

    @Override
    default PrinterPrx ice_collocationOptimized(boolean b)
    {
        return (PrinterPrx)_ice_collocationOptimized(b);
    }

    @Override
    default PrinterPrx ice_twoway()
    {
        return (PrinterPrx)_ice_twoway();
    }

    @Override
    default PrinterPrx ice_oneway()
    {
        return (PrinterPrx)_ice_oneway();
    }

    @Override
    default PrinterPrx ice_batchOneway()
    {
        return (PrinterPrx)_ice_batchOneway();
    }

    @Override
    default PrinterPrx ice_datagram()
    {
        return (PrinterPrx)_ice_datagram();
    }

    @Override
    default PrinterPrx ice_batchDatagram()
    {
        return (PrinterPrx)_ice_batchDatagram();
    }

    @Override
    default PrinterPrx ice_compress(boolean co)
    {
        return (PrinterPrx)_ice_compress(co);
    }

    @Override
    default PrinterPrx ice_timeout(int t)
    {
        return (PrinterPrx)_ice_timeout(t);
    }

    @Override
    default PrinterPrx ice_connectionId(String connectionId)
    {
        return (PrinterPrx)_ice_connectionId(connectionId);
    }

    @Override
    default PrinterPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (PrinterPrx)_ice_fixed(connection);
    }
}
