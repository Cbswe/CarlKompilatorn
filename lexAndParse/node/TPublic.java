/* This file was generated by SableCC (http://www.sablecc.org/). */

package lexAndParse.node;

import lexAndParse.analysis.*;

@SuppressWarnings("nls")
public final class TPublic extends Token
{
    public TPublic()
    {
        super.setText("public");
    }

    public TPublic(int line, int pos)
    {
        super.setText("public");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPublic(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPublic(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPublic text.");
    }
}
