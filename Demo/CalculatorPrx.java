package Demo;

public interface CalculatorPrx extends com.zeroc.Ice.ObjectPrx
{
    int add(int a, int b);
    int subtract(int a, int b);
    int multiply(int a, int b);
    double divide(int a, int b);

    default int add(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_addAsync(a, b, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Integer> addAsync(int a, int b)
    {
        return _iceI_addAsync(a, b, null, false);
    }

    default java.util.concurrent.CompletableFuture<Integer> addAsync(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_addAsync(a, b, context, false);
    }

    default int subtract(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_subtractAsync(a, b, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Integer> subtractAsync(int a, int b)
    {
        return _iceI_subtractAsync(a, b, null, false);
    }

    default java.util.concurrent.CompletableFuture<Integer> subtractAsync(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_subtractAsync(a, b, context, false);
    }

    default int multiply(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_multiplyAsync(a, b, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Integer> multiplyAsync(int a, int b)
    {
        return _iceI_multiplyAsync(a, b, null, false);
    }

    default java.util.concurrent.CompletableFuture<Integer> multiplyAsync(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_multiplyAsync(a, b, context, false);
    }

    default double divide(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_divideAsync(a, b, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Double> divideAsync(int a, int b)
    {
        return _iceI_divideAsync(a, b, null, false);
    }

    default java.util.concurrent.CompletableFuture<Double> divideAsync(int a, int b, java.util.Map<String, String> context)
    {
        return _iceI_divideAsync(a, b, context, false);
    }

    default com.zeroc.IceInternal.OutgoingAsync<Integer> _iceI_addAsync(int iceP_a, int iceP_b, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Integer> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "add", null, sync, null);
        f.invoke(true, context, null, ostr -> {
            ostr.writeInt(iceP_a);
            ostr.writeInt(iceP_b);
        }, istr -> {
            int ret;
            ret = istr.readInt();
            return ret;
        });
        return f;
    }

    default com.zeroc.IceInternal.OutgoingAsync<Integer> _iceI_subtractAsync(int iceP_a, int iceP_b, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Integer> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "subtract", null, sync, null);
        f.invoke(true, context, null, ostr -> {
            ostr.writeInt(iceP_a);
            ostr.writeInt(iceP_b);
        }, istr -> {
            int ret;
            ret = istr.readInt();
            return ret;
        });
        return f;
    }

    default com.zeroc.IceInternal.OutgoingAsync<Integer> _iceI_multiplyAsync(int iceP_a, int iceP_b, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Integer> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "multiply", null, sync, null);
        f.invoke(true, context, null, ostr -> {
            ostr.writeInt(iceP_a);
            ostr.writeInt(iceP_b);
        }, istr -> {
            int ret;
            ret = istr.readInt();
            return ret;
        });
        return f;
    }

    default com.zeroc.IceInternal.OutgoingAsync<Double> _iceI_divideAsync(int iceP_a, int iceP_b, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Double> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "divide", null, sync, null);
        f.invoke(true, context, null, ostr -> {
            ostr.writeInt(iceP_a);
            ostr.writeInt(iceP_b);
        }, istr -> {
            double ret;
            ret = istr.readDouble();
            return ret;
        });
        return f;
    }

    static CalculatorPrx checkedCast(com.zeroc.Ice.ObjectPrx b)
    {
        if(b == null)
        {
            return null;
        }
        if(b instanceof CalculatorPrx)
        {
            return (CalculatorPrx)b;
        }
        if(b.ice_isA(ice_staticId()))
        {
            return _iceI_CalculatorPrxI.fromObjectPrx(b);
        }
        return null;
    }

    static CalculatorPrx checkedCast(com.zeroc.Ice.ObjectPrx b, String f)
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
                return _iceI_CalculatorPrxI.fromObjectPrx(bb);
            }
        }
        catch(com.zeroc.Ice.FacetNotExistException ex)
        {
        }
        return null;
    }

    static CalculatorPrx uncheckedCast(com.zeroc.Ice.ObjectPrx b)
    {
        if(b == null)
        {
            return null;
        }
        return _iceI_CalculatorPrxI.fromObjectPrx(b);
    }

    static CalculatorPrx uncheckedCast(com.zeroc.Ice.ObjectPrx b, String f)
    {
        if(b == null)
        {
            return null;
        }
        return _iceI_CalculatorPrxI.fromObjectPrx(b.ice_facet(f));
    }

    static String ice_staticId()
    {
        return "::Demo::Calculator";
    }

    @Override
    default CalculatorPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (CalculatorPrx)_ice_context(newContext);
    }

    @Override
    default CalculatorPrx ice_adapterId(String newAdapterId)
    {
        return (CalculatorPrx)_ice_adapterId(newAdapterId);
    }

    @Override
    default CalculatorPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (CalculatorPrx)_ice_endpoints(newEndpoints);
    }

    @Override
    default CalculatorPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (CalculatorPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    @Override
    default CalculatorPrx ice_invocationTimeout(int newTimeout)
    {
        return (CalculatorPrx)_ice_invocationTimeout(newTimeout);
    }

    @Override
    default CalculatorPrx ice_connectionCached(boolean newCache)
    {
        return (CalculatorPrx)_ice_connectionCached(newCache);
    }

    @Override
    default CalculatorPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (CalculatorPrx)_ice_endpointSelection(newType);
    }

    @Override
    default CalculatorPrx ice_secure(boolean b)
    {
        return (CalculatorPrx)_ice_secure(b);
    }

    @Override
    default CalculatorPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (CalculatorPrx)_ice_encodingVersion(e);
    }

    @Override
    default CalculatorPrx ice_preferSecure(boolean b)
    {
        return (CalculatorPrx)_ice_preferSecure(b);
    }

    @Override
    default CalculatorPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (CalculatorPrx)_ice_router(router);
    }

    @Override
    default CalculatorPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (CalculatorPrx)_ice_locator(locator);
    }

    @Override
    default CalculatorPrx ice_collocationOptimized(boolean b)
    {
        return (CalculatorPrx)_ice_collocationOptimized(b);
    }

    @Override
    default CalculatorPrx ice_twoway()
    {
        return (CalculatorPrx)_ice_twoway();
    }

    @Override
    default CalculatorPrx ice_oneway()
    {
        return (CalculatorPrx)_ice_oneway();
    }

    @Override
    default CalculatorPrx ice_batchOneway()
    {
        return (CalculatorPrx)_ice_batchOneway();
    }

    @Override
    default CalculatorPrx ice_datagram()
    {
        return (CalculatorPrx)_ice_datagram();
    }

    @Override
    default CalculatorPrx ice_batchDatagram()
    {
        return (CalculatorPrx)_ice_batchDatagram();
    }

    @Override
    default CalculatorPrx ice_compress(boolean co)
    {
        return (CalculatorPrx)_ice_compress(co);
    }

    @Override
    default CalculatorPrx ice_timeout(int t)
    {
        return (CalculatorPrx)_ice_timeout(t);
    }

    @Override
    default CalculatorPrx ice_connectionId(String connectionId)
    {
        return (CalculatorPrx)_ice_connectionId(connectionId);
    }

    @Override
    default CalculatorPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (CalculatorPrx)_ice_fixed(connection);
    }
}
