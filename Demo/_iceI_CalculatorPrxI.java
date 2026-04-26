package Demo;

public class _iceI_CalculatorPrxI extends com.zeroc.Ice._ObjectPrxI implements CalculatorPrx
{
    public static CalculatorPrx fromObjectPrx(com.zeroc.Ice.ObjectPrx prx)
    {
        if(prx == null)
        {
            return null;
        }
        if(prx instanceof CalculatorPrx)
        {
            return (CalculatorPrx)prx;
        }
        _iceI_CalculatorPrxI result = new _iceI_CalculatorPrxI();
        result._copyFrom(prx);
        return result;
    }

    @Override
    public int add(int a, int b)
    {
        return add(a, b, null);
    }

    @Override
    public int subtract(int a, int b)
    {
        return subtract(a, b, null);
    }

    @Override
    public int multiply(int a, int b)
    {
        return multiply(a, b, null);
    }

    @Override
    public double divide(int a, int b)
    {
        return divide(a, b, null);
    }
}
