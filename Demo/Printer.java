package Demo;

public interface Printer extends com.zeroc.Ice.Object
{
    void printString(String s, com.zeroc.Ice.Current current);
    void printReverse(String s, com.zeroc.Ice.Current current);
    void printUpper(String s, com.zeroc.Ice.Current current);
    int getStringLength(String s, com.zeroc.Ice.Current current);

    /** @hidden */
    static final String[] _iceIds =
    {
        "::Demo::Printer",
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
        return "::Demo::Printer";
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_printString(Printer obj, com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_s;
        iceP_s = istr.readString();
        inS.endReadParams();
        obj.printString(iceP_s, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_printReverse(Printer obj, com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_s;
        iceP_s = istr.readString();
        inS.endReadParams();
        obj.printReverse(iceP_s, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_printUpper(Printer obj, com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_s;
        iceP_s = istr.readString();
        inS.endReadParams();
        obj.printUpper(iceP_s, current);
        return inS.setResult(inS.writeEmptyParams());
    }

    static java.util.concurrent.CompletionStage<com.zeroc.Ice.OutputStream> _iceD_getStringLength(Printer obj, com.zeroc.IceInternal.Incoming inS, com.zeroc.Ice.Current current)
    {
        com.zeroc.Ice.Object._iceCheckMode(null, current.mode);
        com.zeroc.Ice.InputStream istr = inS.startReadParams();
        String iceP_s;
        iceP_s = istr.readString();
        inS.endReadParams();
        int ret = obj.getStringLength(iceP_s, current);
        com.zeroc.Ice.OutputStream ostr = inS.startWriteParams();
        ostr.writeInt(ret);
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
                return _iceD_getStringLength(this, in, current);
            case 1:
                return _iceD_printReverse(this, in, current);
            case 2:
                return _iceD_printString(this, in, current);
            case 3:
                return _iceD_printUpper(this, in, current);
        }

        assert(false);
        throw new com.zeroc.Ice.OperationNotExistException(current.id, current.facet, current.operation);
    }

    /** @hidden */
    static final String[] _iceOps =
    {
        "getStringLength",
        "printReverse",
        "printString",
        "printUpper"
    };
}
