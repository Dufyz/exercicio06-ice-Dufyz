package Demo;

public interface Calculator extends com.zeroc.Ice.Object
{
    int add(int a, int b, com.zeroc.Ice.Current current);
    int subtract(int a, int b, com.zeroc.Ice.Current current);
    int multiply(int a, int b, com.zeroc.Ice.Current current);
    double divide(int a, int b, com.zeroc.Ice.Current current);

    /** @hidden */
    static final String[] _iceIds =
    {
        "::Demo::Calculator",
        "::Ice::Object"
    };

    @Override
    default String[] ice_ids(com.zeroc.Ice.Current current)
    {
        return _iceIds;
    }

    @Override
    default String ice_id(com.zeroc.Ice.Current current)
    {
        return ice_staticId();
    }

    static String ice_staticId()
    {
        return "::Demo::Calculator";
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_add(Calculator obj, com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_a;
        int iceP_b;
        iceP_a = istr.readInt();
        iceP_b = istr.readInt();
        inS.endReadParams();
        int ret = obj.add(iceP_a, iceP_b, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_subtract(Calculator obj, com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_a;
        int iceP_b;
        iceP_a = istr.readInt();
        iceP_b = istr.readInt();
        inS.endReadParams();
        int ret = obj.subtract(iceP_a, iceP_b, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_multiply(Calculator obj, com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_a;
        int iceP_b;
        iceP_a = istr.readInt();
        iceP_b = istr.readInt();
        inS.endReadParams();
        int ret = obj.multiply(iceP_a, iceP_b, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_divide(Calculator obj, com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        int iceP_a;
        int iceP_b;
        iceP_a = istr.readInt();
        iceP_b = istr.readInt();
        inS.endReadParams();
        double ret = obj.divide(iceP_a, iceP_b, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeDouble(ret);
        inS.endWriteParams(ostr);
        return inS.setResult(ostr);
    }

    @Override
    default java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceDispatch(com.zeroc.IceInternal.Incoming in, com.zeroc.Ice.Current current)
        throws com.zeroc.Ice.UserException
    {
        int pos = java.util.Arrays.binarySearch(_iceOps, current.operation);
        if(pos < 0)
        {
            throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
        }

        switch(pos)
        {
            case 0:
                return _iceD_add(this, in, current);
            case 1:
                return _iceD_divide(this, in, current);
            case 2:
                return _iceD_multiply(this, in, current);
            case 3:
                return _iceD_subtract(this, in, current);
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }

    /** @hidden */
    static final String[] _iceOps =
    {
        "add",
        "divide",
        "multiply",
        "subtract"
    };
}
