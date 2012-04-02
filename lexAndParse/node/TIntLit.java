/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.node;

import lexAndParse.analysis.*;

@SuppressWarnings("nls")
public final class TIntLit extends Token
{
    public TIntLit(String text)
    {
        setText(text);
    }

    public TIntLit(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIntLit(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIntLit(this);
    }
}
