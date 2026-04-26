package Demo;

public class _iceI_PrinterPrxI extends com.zeroc.Ice._ObjectPrxI implements PrinterPrx
{
    public static PrinterPrx fromObjectPrx(com.zeroc.Ice.ObjectPrx prx)
    {
        if(prx == null)
        {
            return null;
        }
        if(prx instanceof PrinterPrx)
        {
            return (PrinterPrx)prx;
        }
        _iceI_PrinterPrxI result = new _iceI_PrinterPrxI();
        result._copyFrom(prx);
        return result;
    }

    @Override
    public void printString(String s)
    {
        printString(s, null);
    }

    @Override
    public void printReverse(String s)
    {
        printReverse(s, null);
    }

    @Override
    public void printUpper(String s)
    {
        printUpper(s, null);
    }

    @Override
    public int getStringLength(String s)
    {
        return getStringLength(s, null);
    }
}
