/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.node;

import lexAndParse.analysis.*;

@SuppressWarnings("nls")
public final class TString extends Token
{
    public TString()
    {
        super.setText("String");
    }

    public TString(int line, int pos)
    {
        super.setText("String");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TString(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTString(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TString text.");
    }
}
